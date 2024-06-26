package com.luv2code.springboot.thymeleafdemo.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {


    //new a controller emthod show initial html form
    @RequestMapping("/showForm")
    public String showForm(){
        return "helloworld-form";
    }



    //need a contoler method to process the html form
    @RequestMapping ("/processForm")
    public String processForm() {
        return "helloworld";
    }

    @RequestMapping ("/processFormVersionTwo")
    public String letsShoutDude(HttpServletRequest request, Model model) {

        //read the request parameter from the html form
        String theName = request.getParameter("studentName");

        //convert the data to all caps
        theName = theName.toUpperCase();

        //create the message
        String result = "Yo!" + theName;

        //add to the model
        model.addAttribute("message" , result);

        return "helloworld";



    }

    @RequestMapping ("/processFormVersionThree")
    public String processFromVersionThree(@RequestParam("studentName") String theName, Model model) {


        //convert the data to all caps
        theName = theName.toUpperCase();

        //create the message
        String result = "Hey My Friend!" + theName;

        //add to the model
        model.addAttribute("message" , result);

        return "helloworld";



    }
}
