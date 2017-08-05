package com.ke.controller.bs;

import com.ke.pojo.User;
import com.ke.service.UserService;
import com.ke.shiro.PasswordHelper;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2017/8/3.
 */

@Controller
@RequiresRoles("admin")
@RequestMapping("/bs")
public class BsUserController {

    @Autowired
    private UserService userService;

    @Autowired
    private PasswordHelper ph;

    @RequestMapping(value = "/manageuserpage",method = RequestMethod.GET)
    public String manageUser(Model model){

        List<User> users = userService.selectAllUser();

        model.addAttribute("users",users);

        return "bs/admin/manage-user";
    }

    @RequestMapping(value = "/manageadminpage",method = RequestMethod.GET)
    public String manageAdmin(Model model){

        List<User> admins = userService.selectAllAdmin();

        model.addAttribute("admins",admins);
        model.addAttribute("count",admins.size());

        return "bs/admin/manage-admin";
    }

    @RequestMapping(value = "/managemoderatorpage",method = RequestMethod.GET)
    public String manageModerator(Model model){

        List<User> moderators = userService.selectAllModerator();

        model.addAttribute("moderators",moderators);

        return "bs/admin/manage-moderator";
    }


    @RequestMapping(value = "/user/{action}")
    public ModelAndView addUser(@PathVariable("action") String action, User user,
                                @RequestParam(defaultValue = "null") String lockname ){

        ModelAndView mv = new ModelAndView();

        if(action.equals("insert")){
            user.setRegistrationTime(new Date());
            user.setLocked(0);
            user.setLoginTimes(0);
            user.setSalt("123");
            userService.insertUser(ph.encryptPassword(user));

        }else if(action.equals("update")){
            if(ph.confirmPassword(user)){
                //如果账号与密码匹配则修改账号密码

            }else{
                //不匹配返回错误信息
            }

        }else if(action.equals("delete")){


        }else if(action.equals("lock")){


        }

        int i = user.getRoleId();
        switch (i){
            case 1 :
                mv.addObject("users",userService.selectAllAdmin());
                mv.setViewName("redirect:/bs/managemoderatorpage");
            case 2 :
                mv.addObject("users",userService.selectAllAdmin());
                mv.setViewName("redirect:/bs/managemoderatorpage");

            case 3 :
                mv.addObject("users",userService.selectAllAdmin());
                mv.setViewName("redirect:/bs/managemoderatorpage");

            default:return mv;
        }

    }


}
