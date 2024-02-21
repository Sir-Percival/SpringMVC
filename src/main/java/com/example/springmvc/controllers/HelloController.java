package com.example.springmvc.controllers;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

@Controller
public class HelloController
{
    @GetMapping("/hello")
    public String sayHello(Model model)
    {
        model.addAttribute("date", LocalDateTime.now().format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM)));
        return "hello";
    }

    @RequestMapping("/helloForm")
    public String showForm()
    {
        return "hello-form";
    }

    @RequestMapping("/processForm")
    public String processForm()
    {
        return "welcome";   // ${param.username}
    }

    @RequestMapping("/processFormModel")
    public String processFormModel(HttpServletRequest request, Model model)
    {
        String username = request.getParameter("username");
        username = username.toUpperCase();
        model.addAttribute("username", username);
        return "welcome"; // ${username}
    }

    @RequestMapping("/processFormParam")
    public String processFormParam(@RequestParam("username") String username, Model model)
    {
        model.addAttribute("username", username);
        return "welcome"; // ${username}
    }
}
