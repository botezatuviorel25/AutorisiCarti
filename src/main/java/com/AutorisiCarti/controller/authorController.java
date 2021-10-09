package com.AutorisiCarti.controller;

import com.AutorisiCarti.model.Author;
import com.AutorisiCarti.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.awt.print.Book;
import java.util.List;

@Controller

public class authorController {
    @Autowired
    AuthorService authorService;
    @GetMapping(value = "/authorsOverview")
    public ModelAndView viewAuthors(Model model){
        ModelAndView modelAndView = new ModelAndView();
        String greetingText = "Hello world";

        model.addAttribute("greeting", greetingText );
        model.addAttribute("someText", "Some random text");
        model.addAttribute("authorlist", getAuthor());
        //model.addAttribute("bookList", getBook());

        modelAndView.setViewName("authorsOverview");
        return modelAndView;
    }
    private List<Author> getAuthor() {
        Author author1 = Author.builder()
        .firstName("gigi")
       .lastName("popescu")
                .build();
        Author author2 = Author.builder()
                .firstName("gigfvi")
                .lastName("popescvfdu")
                .build();


        return List.of(author1, author2);
   }
    //private List<Book> getBook(){

      //  return List.of(book1);
    //}

}
