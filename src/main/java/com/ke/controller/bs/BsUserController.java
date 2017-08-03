package com.ke.controller.bs;

import com.ke.pojo.User;
import com.ke.service.UserService;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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

    @RequestMapping(value = "/manageuserpage",method = RequestMethod.GET)
    public String manageUser(Model model){

        List<User> users = userService.selectAllUser();

        model.addAttribute("users",users);

        return "bs/admin/manage-user";
    }



}
