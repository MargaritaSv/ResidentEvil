package org.softuni.residentevil.service;

import org.softuni.residentevil.domain.entities.Viruses;
import org.softuni.residentevil.domain.models.binding.VirusAddBindingModel;
import org.softuni.residentevil.domain.models.binding.VirusEditBindingModel;

import java.util.List;

public interface VirusService {
    void save(VirusAddBindingModel virusAddBindingModel);

    List<Viruses> allViruses();

    void deleteById(Integer id);

    Viruses findVirusById(Integer id);

    void edit(Integer id, VirusEditBindingModel virusEditBindingModel);
}
