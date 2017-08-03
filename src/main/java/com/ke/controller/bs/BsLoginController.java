package com.ke.controller.bs;

import com.ke.pojo.Section;
import com.ke.pojo.User;
import com.ke.service.SectionService;
import com.ke.service.UserService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.LockedAccountException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by Administrator on 2017/7/31.
 */

@Controller
@RequestMapping("/bs")
public class BsLoginController {

    @Autowired
    private UserService userService;

    @Autowired
    private SectionService sectionService;

    /**
     * 后台登陆页面请求GET
     * @return 登陆页面
     */
    @RequestMapping(value = "/login" ,method = RequestMethod.GET)
    public String loginPage(){
        return "bs/login";
    }


    /**
     * 登陆表单请求POAT
     * @param req req
     * @param model 存储信息
     * @param session 登陆成功后设置session
     * @return 登陆成功返回后台主界面，失败返回登陆页面
     */
    @RequestMapping(value = "/loginreq",method = RequestMethod.POST)
    public String loginRequest(HttpServletRequest req, Model model, HttpSession session){

        String exceptionClassName = (String) req.getAttribute("shiroLoginFailure");
        String err_message = null;
        if (UnknownAccountException.class.getName().equals(exceptionClassName)) {
            err_message = "用户名/密码错误";
        } else if (IncorrectCredentialsException.class.getName().equals(exceptionClassName)) {
            err_message = "用户名/密码错误";
        } else if (exceptionClassName != null) {
            err_message = "其他错误：" + exceptionClassName;
        }
        Subject subject = SecurityUtils.getSubject();

        boolean isAuthenticated = subject.isAuthenticated();



        if (isAuthenticated) {
            String principal = (String) subject.getPrincipal();

            session.setAttribute("username", principal);

            model.addAttribute("username",subject.getPrincipal().toString());

            return subject.hasRole("admin")? "bs/admin/index"
                    :
                    (subject.hasRole("moderator")?"bs/admin/index":"bs/login");

        }
        model.addAttribute("err_message",err_message);

        return "bs/login";

    }

    /**
     * @return 信息总览页面
     */
    @RequiresRoles("admin")
    @RequestMapping("/index")
    public String index(){
        return "bs/admin/index";
    }

    /**
     * @return 一级版块管理页面
     */
    @RequiresRoles("admin")
    @RequestMapping(value = "/category",method = RequestMethod.GET)
    public String category(Model model){

        List<Section> sections = sectionService.getAllSection();

        Integer count = sections.size();

        model.addAttribute("sections",sections);
        model.addAttribute("count",count);

        return "bs/admin/category";
    }

    @RequiresRoles("admin")
    @RequestMapping(value = "/category/{action}/{id}",method = RequestMethod.POST)
    public ModelAndView addSection(Section section , @PathVariable("action")String action,
                             @PathVariable("id")Integer id){

        ModelAndView mv = new ModelAndView();

        if(action.equals("add")){//增加一级版块
            section.setId(null);
            sectionService.insertSection(section);
        }else if(action.equals("delete")){//删除一级版块
            sectionService.deleteSection(section);
        }else if(action.equals("update")){
            sectionService.updateByPrimaryKeySelective(section);
        }

        List<Section> sections = sectionService.getAllSection();

        mv.addObject("sections",sections);

        mv.setViewName("redirect:/bs/category");

        return mv;
    }

    @RequiresRoles("admin")
    @RequestMapping(value = "/delItems",method = RequestMethod.POST)
    public String delItems(@RequestParam("checkbox[]") String[] items){

        sectionService.deleteSectionsByPrimaryKey(items);
        return "redirect:/bs/category";

    }

}
