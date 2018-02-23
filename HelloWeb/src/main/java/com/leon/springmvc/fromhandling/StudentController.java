package com.leon.springmvc.fromhandling;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by leon on 2018/2/22.
 */
@Controller
public class StudentController {
    @Autowired
    private HttpServletRequest httpServletRequest;
    @RequestMapping(value = "/student", method = RequestMethod.GET)
    public ModelAndView student() {
        return new ModelAndView("student", "command", new Student());
    }
    @RequestMapping(value = "/addStudent", method = RequestMethod.POST)
    public String addStudent(@ModelAttribute("SpringWeb") Student student, ModelMap modelMap) {
        modelMap.addAttribute("name", student.getName());
        modelMap.addAttribute("age", httpServletRequest.getRequestURL());
        modelMap.addAttribute("id", student.getId());
        return "result";
    }
}
