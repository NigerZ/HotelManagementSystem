package com.bdqn.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class SystemController {

    @RequestMapping("/login.html")
    public String login(){
        return "admin/login";
    }
}
