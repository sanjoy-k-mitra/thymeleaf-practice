package com.pixisolutions.thymeleaf.practice.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by sanjoy on 9/29/15.
 */
@Controller
public class DefaultController {
    @RequestMapping(value = "/")
    public ModelAndView index(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index");
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd MMM, yyyy");
        modelAndView.addObject("today", dateFormat.format(new Date()));
        return modelAndView;
    }
}
