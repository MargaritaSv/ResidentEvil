package org.softuni.residentevil.web.controllers;

import org.springframework.web.servlet.ModelAndView;


public abstract class BaseController {

    protected ModelAndView view(String view, Object object) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("bindingModel", object);
        modelAndView.setViewName(view);
        return modelAndView;
    }


    protected ModelAndView view(String view) {
        return this.view(view, new ModelAndView());
    }

    protected ModelAndView redirect(String url) {
        return this.view("redirect:" + url);
    }
}
