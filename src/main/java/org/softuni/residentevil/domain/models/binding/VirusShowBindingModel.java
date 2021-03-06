package org.softuni.residentevil.domain.models.binding;

import org.softuni.residentevil.domain.entities.enums.Magnitude;

import java.time.LocalDate;

public class VirusShowBindingModel {
    private int id;
    private String name;
    private Magnitude magnitude;
    private LocalDate releasedOn;

    public VirusShowBindingModel() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Magnitude getMagnitude() {
        return magnitude;
    }

    public void setMagnitude(Magnitude magnitude) {
        this.magnitude = magnitude;
    }

    public LocalDate getReleasedOn() {
        return releasedOn;
    }

    public void setReleasedOn(LocalDate releasedOn) {
        this.releasedOn = releasedOn;
    }
}
