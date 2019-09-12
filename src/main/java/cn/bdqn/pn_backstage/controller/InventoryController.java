package cn.bdqn.pn_backstage.controller;

import cn.bdqn.pn_backstage.pojo.Inventory;
import cn.bdqn.pn_backstage.service.InventoryService;
import cn.bdqn.pn_backstage.service.impl.InventoryServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller("/inventory")
public class InventoryController {
    @Autowired
    private InventoryService InventoryService;

    @RequestMapping("index")
    public String a(){
        System.out.println(1);
        return "index";
    }

    @RequestMapping("charts-7")
    public String cha(Model model){
       List<Inventory> list=InventoryService.zha();
        model.addAttribute("list","list");
        return "charts-7";
    }

}
