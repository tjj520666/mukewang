package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class testControllr {

    @RequestMapping("/admin")
    public String string(){

        return "su";
    }

}
