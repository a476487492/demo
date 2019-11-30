package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
public class ViewController {



    @RequestMapping("succ")
    public  String index(Map<String ,Object> map){
        map.put("name","zmmm");
        System.out.print("11");
        return "succ";
    }


}
