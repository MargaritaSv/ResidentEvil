package org.softuni.residentevil.web.controllers;

import org.modelmapper.ModelMapper;
import org.softuni.residentevil.domain.models.binding.VirusAddBindingModel;
import org.softuni.residentevil.domain.models.view.CapitalListViewModel;
import org.softuni.residentevil.service.CapitalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.stream.Collectors;

@Controller
@RequestMapping("/viruses")
public class VirusController extends BaseController {

    private final CapitalService capitalService;
    private final ModelMapper modelMapper;

    @Autowired
    public VirusController(CapitalService capitalService, ModelMapper modelMapper) {
        this.capitalService = capitalService;
        this.modelMapper = modelMapper;
    }


    @GetMapping("/add")//podavame my modela,za da go nameri vuv view-to !!!
    public ModelAndView view(ModelAndView modelAndView, @ModelAttribute(name = "bindingModel") VirusAddBindingModel bindingModel) {
        modelAndView.addObject("bindingModel", bindingModel);
        modelAndView.addObject("capitalNames",
                this.capitalService.findAllCapitals()
                        .stream()
                        .map(c -> this.modelMapper.map(c, CapitalListViewModel.class))
                        .collect(Collectors.toList()));

        return super.view("add-virus", modelAndView);
    }

    @PostMapping("/add")//zakachame binding modela, za da ne go izgybim otnovo!!!!!!
    public ModelAndView addConfirm(ModelAndView modelAndView,
                                   @Valid @ModelAttribute(name = "bindingModel") VirusAddBindingModel bindingModel,
                                   BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            modelAndView.addObject("bindingModel", bindingModel);
            return super.view("add-virus", modelAndView);
        }
        return super.redirect("/");
    }

    @InitBinder
    public void initBinder(WebDataBinder binder) {
        binder.registerCustomEditor(String.class, new StringTrimmerEditor(true));
        SimpleDateFormat date = new SimpleDateFormat("dd/mm/yyyy");
        date.setLenient(false);

        binder.registerCustomEditor(Date.class, new CustomDateEditor(date, true));
    }

    @GetMapping("/show")
    public ModelAndView show(ModelAndView modelAndView) {
        return super.view("show");
    }

    public ModelAndView showConfirm(ModelAndView modelAndView) {
        return super.redirect("/show");
    }

    @GetMapping("/delete/{id}")
    public ModelAndView delete(@PathVariable String id) {
        return super.view("/");
    }
}
