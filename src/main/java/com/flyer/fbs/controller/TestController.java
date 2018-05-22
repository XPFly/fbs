package com.flyer.fbs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @description:
 * @author: xu_pf@suixingpay.com
 * @date: 2018/5/22
 */
@Controller
@RequestMapping("/test")
public class TestController {

    @RequestMapping("/hello")
    public String say(Model model){
        model.addAttribute("name","张珊");
        return "/fbs/index";
    }
}
