package com.chuck.controllers;

import com.chuck.services.JokesService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokesController {
    private final JokesService jokeService;

    public JokesController(JokesService jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping({"/", ""})
    public String joke(Model model){
        model.addAttribute("joke", jokeService.getJoke());
        return "index";
    }
}
