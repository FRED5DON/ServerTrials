package com.example.controller;

import com.example.model.Author;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by fred on 2017/4/9.
 */
@RestController
@EnableAutoConfiguration
public class IndexController {

    @RequestMapping("/")
    public ModelAndView index(){
        ModelAndView modelAndView=new ModelAndView("/index");
        List<Author> authors=new ArrayList<>();
        {
            Author author=new Author();
            author.setName("Fred Don");
            author.setEmail("gsiner@live.com");
            authors.add(author);
        }
        {
            Author author=new Author();
            author.setName("Ke$ha");
            author.setEmail("kesha_pa@outlook.com");
            authors.add(author);
        }
        {
            Author author=new Author();
            author.setName("Emi");
            author.setEmail("emi@jpc.com");
            authors.add(author);
        }
        {
            Author author=new Author();
            author.setName("Peter");
            author.setEmail("Peter@google.com");
            authors.add(author);
        }
        modelAndView.addObject("authors",authors);
        return modelAndView;
    }

    @RequestMapping(value="/hello",method = RequestMethod.GET)
    public String index2(){
        return "index";
    }
}
