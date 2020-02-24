package com.bysj.bodytrain.Controller;

import com.bysj.bodytrain.Models.Users;
import com.bysj.bodytrain.Service.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.ModelMap;

import javax.servlet.http.HttpServletRequest;
import java.util.Optional;

@Controller
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserServices userServices;

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(@RequestParam String userName, String password, ModelMap map, HttpServletRequest request) {

        Users user = userServices.getUser(userName, password);
        map.addAttribute("userName", user.getAccount());
        request.getSession().setAttribute("users",user);
        return "/dashboard";
    }
}
