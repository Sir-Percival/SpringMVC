package com.example.springmvc.controllers;

import com.example.springmvc.model.Student;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class StudentController
{
    @Value("${countries}")
    private List<String> countries;

    @Value("${languages}")
    private List<String> languages;

    @Value("${systems}")
    private List<String> systems;

    @InitBinder
    public void initBinder(WebDataBinder dataBinder)
    {
        StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
        dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
    }

    @GetMapping("/showStudentForm")
    public String showForm(Model model)
    {
        model.addAttribute("student", new Student());
        model.addAttribute("countries", countries);
        model.addAttribute("languages", languages);
        model.addAttribute("systems", systems);
        return "student-form";
    }

    @PostMapping("/processStudentForm")
    public String processForm(@Valid @ModelAttribute("student") Student student, BindingResult bindingResult, Model model)
    {
        if(bindingResult.hasErrors())
        {
            model.addAttribute("countries", countries);
            model.addAttribute("languages", languages);
            model.addAttribute("systems", systems);
            return "student-form";
        }
        else
        {
            return "student-confirm";
        }
    }
}
