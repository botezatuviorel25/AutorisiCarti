package com.AutorisiCarti.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

public class AuthorOverviewControler {
    @Controller

    public class indexController {
        @GetMapping(value = "/authorsOverview")
        public ModelAndView returnIndex(){
            ModelAndView mav = new ModelAndView();
            mav.setViewName("authorsOverview");
            return mav;
        }

    }

}
