package com.yezi.jylframe.controller;

import com.yezi.jylframe.data.config.ApplicationConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * created by yezi on 2018/7/6
 */
@Controller
public class HomeController {

    @Autowired
    ApplicationConfig config;

    @RequestMapping("/hello")
    public String home(Model model) {
        model.addAttribute("now", DateFormat.getDateTimeInstance().format(new Date()));
        return "hello";
    }
}
