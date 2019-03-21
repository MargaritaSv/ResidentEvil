package org.softuni.residentevil.repository;

import org.softuni.residentevil.domain.entities.Capital;
import org.softuni.residentevil.domain.entities.Viruses;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VirusRepository extends JpaRepository<Viruses, Integer> {
    Capital findByName(String name);

    Viruses findVirusesById(Integer id);
}
