package com.bysj.bodytrain.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping({"/","/login.html"})
    public String index(){
        return "login";
    }
}
