package com.bhargavn.SpringBootWebProject;

import com.bhargavn.SpringBootWebProject.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String home() {
        return "index";
    }

    @ModelAttribute("course")
    public String getCourse() {
        return "Electronics fundamentals";
    }

    @RequestMapping("/add")
    public ModelAndView add(@RequestParam("num1") int num1, @RequestParam("num2") int num2, ModelAndView mv){
        int result = num1+num2;
        mv.addObject("result",result);
        mv.setViewName("index");
        return mv;
    }


    @RequestMapping("/addStudent")
    public String addStudent(@ModelAttribute Student student) {
        return "home";
    }

}