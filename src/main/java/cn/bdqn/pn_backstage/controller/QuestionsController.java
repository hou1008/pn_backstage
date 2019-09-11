package cn.bdqn.pn_backstage.controller;

import cn.bdqn.demo.pojo.Questions;
import cn.bdqn.demo.service.QuestionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class QuestionsController {
    @Autowired
    QuestionsService questionsService;
    @RequestMapping("/getAll")
    public String  getAll(Model model){
        List<Questions> list=questionsService.getAll();
        model.addAttribute("list",list);
        return "/user/index";
    }
}
