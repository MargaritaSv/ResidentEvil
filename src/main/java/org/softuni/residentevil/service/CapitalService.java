package org.softuni.residentevil.service;

import org.softuni.residentevil.domain.models.binding.CapitalServiceModel;

import java.util.List;

public interface CapitalService {
    List<CapitalServiceModel>findAllCapitals();
}
