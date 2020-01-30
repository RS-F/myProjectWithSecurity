package com.wildcodeschool.myProjectWithSecurity.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/")
    public String hello() {
        return "Welcome to the SHIELD";
    }
    
    @GetMapping("/avengers/assemble")
    public String avengers() {
        return "Avengers..... Assemble";
    }

    @GetMapping("/secret-bases")
    public String director() {
        return "All the secret bases:\n\n" +
        		"Amsterdam\n" +
        		"Barcelone\n" +
        		"Berlin\n" +
        		"Biarritz\n" +
        		"Bordeaux\n" +
        		"Bruxelles\n" +
        		"Bucharest\n" +
        		"Budapest\n" +
        		"Dublin\n" +
        		"La Loupe\n" +
        		"Lille\n" +
        		"Lisbon\n" +
        		"London\n" +
        		"Lyon\n" +
        		"Madrid\n" +
        		"Marseille\n" +
        		"Milan\n" +
        		"Nantes\n" +
        		"Orleans\n" +
        		"Paris\n" +
        		"Reims\n" +
        		"Strasbourg\n" +
        		"Toulouse\n" +
        		"Tours\n\n" ;
    }
    
}
