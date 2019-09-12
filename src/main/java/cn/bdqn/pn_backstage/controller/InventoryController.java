package cn.bdqn.pn_backstage.controller;

import cn.bdqn.pn_backstage.pojo.Inventory;
import cn.bdqn.pn_backstage.service.InventoryService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class InventoryController {
    private InventoryService InventoryService;
    @RequestMapping("/h")
    public String pp(){

        return "/resources/templates/index.html";
    }

    @RequestMapping("/he")
    public String aaa(Model model){
        List<Inventory> list=InventoryService.zha();
        model.addAttribute("list","list");
        return "charts-7.html";
    }
}
