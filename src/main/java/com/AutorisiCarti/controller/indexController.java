package com.AutorisiCarti.controller;

import com.AutorisiCarti.model.Author;
import com.AutorisiCarti.service.AuthorService12;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller

public class indexController {


    @GetMapping(value = "/index")
    public ModelAndView returnIndex() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("index");
        return mav;
    }
    @Autowired
    AuthorService authorService;
    public ModelAndView viewAuthors(Model model) {
        ModelAndView modelAndView = new ModelAndView();
        List<Author> authors = authorService.getAllAuthors();

        // model.addAttribute("greeting", greetingText);


        model.addAttribute("authorList", authors);

        modelAndView.setViewName("index");
        return modelAndView;

        private List<Author> getAuthors () {
            Author employee1 = Author.builder()

                    .firstName("Mihai")
                    .lastName("Popepescu")

                    .build();

            Author employee2 = Author.builder()

                    .lastName("Musterman")
                    .firstName("Max")


                    .build();

            Author employee3 = Author.builder()

                    .lastName("Man")
                    .firstName("Iron")


                    .build();


            return List.of(employee1, employee2, employee3);
        }
    }

    private class AuthorService {
    }
}
