package com.ke.controller.bs;

import com.ke.pojo.Item;
import com.ke.service.ItemService;
import com.ke.service.SubSectionService;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by Administrator on 2017/8/7.
 */

@RequiresRoles(value = {"moderator","admin"})
@Controller
@RequestMapping("/bs")
public class BsItemController {

    @Autowired
    private ItemService itemService;

    @Autowired
    private SubSectionService subSectionService;

    @RequestMapping(value = "/item",method = RequestMethod.GET)
    public String itemPage(Model model){

        model.addAttribute("subsections",subSectionService.getAllSubSection());
        model.addAttribute("items",itemService.getAllItem());
        return "bs/admin/item";
    }

    @RequestMapping(value = "/sitem/{id}",method = RequestMethod.GET,produces = "application/json")
    @ResponseBody
    public List<Item> getItemBySection(@PathVariable("id")Integer id){
        List<Item> items = itemService.getItemBySectionId(id);
        return items;
    }


}
