package org.softuni.residentevil.domain.models.binding;

import org.softuni.residentevil.domain.entities.Capital;
import org.softuni.residentevil.domain.entities.enums.Creater;
import org.softuni.residentevil.domain.entities.enums.Magnitude;
import org.softuni.residentevil.domain.entities.enums.Mutation;

import java.time.LocalDate;
import java.util.List;

public class VirusEditBindingModel {

    private String name;
    private String description;
    private String sideEffects;
    private Creater creater;
    private boolean isDeadly;
    private boolean isCurable;
    private Integer turnoverRate;
    private Integer hoursUntilTurn;
    private Magnitude magnitude;
    private LocalDate releasedOn;
    private List<Capital> capitals;
    private Mutation mutation;

    public VirusEditBindingModel() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSideEffects() {
        return sideEffects;
    }

    public void setSideEffects(String sideEffects) {
        this.sideEffects = sideEffects;
    }

    public Creater getCreater() {
        return creater;
    }

    public void setCreater(Creater creater) {
        this.creater = creater;
    }

    public boolean isDeadly() {
        return isDeadly;
    }

    public void setDeadly(boolean deadly) {
        isDeadly = deadly;
    }

    public boolean isCurable() {
        return isCurable;
    }

    public void setCurable(boolean curable) {
        isCurable = curable;
    }

    public Integer getTurnoverRate() {
        return turnoverRate;
    }

    public void setTurnoverRate(Integer turnoverRate) {
        this.turnoverRate = turnoverRate;
    }

    public Integer getHoursUntilTurn() {
        return hoursUntilTurn;
    }

    public void setHoursUntilTurn(Integer hoursUntilTurn) {
        this.hoursUntilTurn = hoursUntilTurn;
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

    public List<Capital> getCapitals() {
        return capitals;
    }

    public void setCapitals(List<Capital> capitals) {
        this.capitals = capitals;
    }

    public Mutation getMutation() {
        return mutation;
    }

    public void setMutation(Mutation mutation) {
        this.mutation = mutation;
    }
}
