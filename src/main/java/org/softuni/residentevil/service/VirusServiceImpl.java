package org.softuni.residentevil.service;

import org.softuni.residentevil.domain.entities.Capital;
import org.softuni.residentevil.domain.entities.Viruses;
import org.softuni.residentevil.domain.models.binding.VirusAddBindingModel;
import org.softuni.residentevil.domain.models.binding.VirusEditBindingModel;
import org.softuni.residentevil.repository.CapitalRepository;
import org.softuni.residentevil.repository.VirusRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

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
        virus.setDeadly(virusAddBindingModel.isDeadly());
        virus.setMutation(virusAddBindingModel.getMutation());
        virus.setMagnitude(virusAddBindingModel.getMagnitude());
        virus.setReleasedOn(virusAddBindingModel.getReleasedOn());
        virus.setCreater(virusAddBindingModel.getCreater());
        virus.setCapitals(new ArrayList());

        for (Capital capital : capitalRepository.findAll()) {
            virus.getCapitals().add(this.virusRepository.findByName(capital.getName()));
        }

        this.virusRepository.saveAndFlush(virus);
    }

    @Override
    public List<Viruses> allViruses() {
        return this.virusRepository.findAll();
    }

    @Override
    public void deleteById(Integer id) {
        this.virusRepository.deleteById(id);
    }

    @Override
    public Viruses findVirusById(Integer id) {
        return this.virusRepository.findVirusesById(id);
    }

    @Override
    public void edit(Integer id, VirusEditBindingModel virusEditBindingModel) {
        Viruses virus = this.virusRepository.findVirusesById(id);

        if (virus == null) {
            return;
        }


        virus.setName(virusEditBindingModel.getName());
        virus.setDescription(virusEditBindingModel.getDescription());
        virus.setCreater(virusEditBindingModel.getCreater());
        virus.setDeadly(virusEditBindingModel.isDeadly());
        virus.setMutation(virusEditBindingModel.getMutation());
        virus.setMagnitude(virusEditBindingModel.getMagnitude());
        virus.setReleasedOn(virusEditBindingModel.getReleasedOn());
        virus.setCreater(virusEditBindingModel.getCreater());
        virus.setCapitals(new ArrayList());

        for (Capital capital : capitalRepository.findAll()) {
            virus.getCapitals().add(this.virusRepository.findByName(capital.getName()));
        }

        this.virusRepository.saveAndFlush(virus);
    }
}
