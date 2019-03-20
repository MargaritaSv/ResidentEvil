package org.softuni.residentevil.service;

import org.softuni.residentevil.domain.entities.Viruses;
import org.softuni.residentevil.domain.models.binding.VirusAddBindingModel;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface VirusService {
    void save(VirusAddBindingModel virusAddBindingModel);

//    @Query(name = "select v from Viruses as v",
//            nativeQuery = true)
   List<Viruses> allViruses();
}
