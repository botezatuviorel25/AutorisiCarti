package com.AutorisiCarti.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class FormularController {
    @GetMapping(value = "/formular")
    public ModelAndView returnIndex(){
        ModelAndView mav = new ModelAndView();
        mav.setViewName("formular");
        return mav;
    }
}
