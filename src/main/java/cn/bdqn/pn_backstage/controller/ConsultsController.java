package cn.bdqn.pn_backstage.controller;

import cn.bdqn.pn_backstage.pojo.Consults;
import cn.bdqn.pn_backstage.service.ConsultsService;
import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller("/consults")
public class ConsultsController {
    @Autowired
    private ConsultsService consultsService;

    @ResponseBody
    @RequestMapping("/getAll")
    public String getAll(){
        List<Consults> list = consultsService.getAll();
        return JSON.toJSONString(list);
    }
}
