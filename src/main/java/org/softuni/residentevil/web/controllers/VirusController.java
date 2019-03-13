package org.softuni.residentevil.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("add-virus")
public class VirusController extends BaseController {

    @GetMapping("/add")
    public ModelAndView view() {
        return super.view("add-virus");
    }
}
