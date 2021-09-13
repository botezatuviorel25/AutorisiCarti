package com.AutorisiCarti;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller

public class authorController {
    @GetMapping(value = "/authorsOverview")
    public ModelAndView viewAuthors(Model model){
        ModelAndView modelAndView = new ModelAndView();
        String greetingText = "Hello world";

        model.addAttribute("greeting", greetingText );
        modelAndView.setViewName("authorsOverview");
        return modelAndView;
    }
}
