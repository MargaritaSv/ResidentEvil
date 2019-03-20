package org.softuni.residentevil.service;

import org.softuni.residentevil.domain.entities.Capital;
import org.softuni.residentevil.domain.entities.Viruses;
import org.softuni.residentevil.domain.models.binding.VirusAddBindingModel;
import org.softuni.residentevil.repository.CapitalRepository;
import org.softuni.residentevil.repository.VirusRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class VirusServiceImpl implements VirusService {

    private final VirusRepository virusRepository;
    private final CapitalRepository capitalRepository;

    public VirusServiceImpl(VirusRepository virusRepository, CapitalRepository capitalRepository) {
        this.virusRepository = virusRepository;
        this.capitalRepository = capitalRepository;
    }

    @Override
    public void save(VirusAddBindingModel virusAddBindingModel) {

        Viruses virus = new Viruses();

        virus.setName(virusAddBindingModel.getName());
        virus.setDescription(virusAddBindingModel.getDescription());
        virus.setCreater(virusAddBindingModel.getCreater());
        virus.setDeadly(virusAddBindingModel.isDeadly() == true);
        virus.setMutation(virusAddBindingModel.getMutation());
        virus.setMagnitude(virusAddBindingModel.getMagnitude());
        virus.setCapitals(new ArrayList());

        for (Capital capital : capitalRepository.findAll()) {
            virus.getCapitals().add(this.virusRepository.findByName(capital.getName()));
        }

        this.virusRepository.saveAndFlush(virus);
    }
}
