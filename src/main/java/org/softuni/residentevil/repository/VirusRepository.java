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

    //    @Query(value = "SELECT v FROM viruses v")
////    List<Viruses> findAll();
//    @Query(name = "select v from viruses as v",
//            nativeQuery = true)
  // List<Viruses> findAll();
//
    Viruses findVirusesById(String id);


}
