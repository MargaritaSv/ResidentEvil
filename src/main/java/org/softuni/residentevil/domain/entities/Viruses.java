package org.softuni.residentevil.domain.entities;

import org.softuni.residentevil.domain.entities.enums.Creater;
import org.softuni.residentevil.domain.entities.enums.Magnitude;
import org.softuni.residentevil.domain.entities.enums.Mutation;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "viruses")
public class Viruses extends BaseEntity {

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

    @Column(name = "creater")
    @Enumerated(EnumType.STRING)
    public Creater getCreater() {
        return creater;
    }

    public void setCreater(Creater creater) {
        this.creater = creater;
    }

    @Column(name = "mutation")
    @Enumerated(EnumType.STRING)
    public Mutation getMutation() {
        return mutation;
    }

    public void setMutation(Mutation mutation) {
        this.mutation = mutation;
    }

    public Viruses() {
    }

    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Column(name = "side_effect")
    public String getSideEffects() {
        return sideEffects;
    }

    public void setSideEffects(String sideEffects) {
        this.sideEffects = sideEffects;
    }

    @Column(name = "is_deadly")
    public boolean isDeadly() {
        return isDeadly;
    }

    public void setDeadly(boolean deadly) {
        isDeadly = deadly;
    }

    @Column(name = "is_curable")
    public boolean isCurable() {
        return isCurable;
    }

    public void setCurable(boolean curable) {
        isCurable = curable;
    }

    @Column(name = "turnover_rate")
    public Integer getTurnoverRate() {
        return turnoverRate;
    }

    public void setTurnoverRate(Integer turnoverRate) {
        this.turnoverRate = turnoverRate;
    }

    @Column(name = "hours_unit_turn")
    public Integer getHoursUntilTurn() {
        return hoursUntilTurn;
    }

    public void setHoursUntilTurn(Integer hoursUntilTurn) {
        this.hoursUntilTurn = hoursUntilTurn;
    }

    @Column(name = "magnitude")
    public Magnitude getMagnitude() {
        return magnitude;
    }

    public void setMagnitude(Magnitude magnitude) {
        this.magnitude = magnitude;
    }

    @Column(name = "released_on")
    public LocalDate getReleasedOn() {
        return releasedOn;
    }

    public void setReleasedOn(LocalDate releasedOn) {
        this.releasedOn = releasedOn;
    }

    @OneToMany(targetEntity = Capital.class)
    @JoinTable(name = "viruses_capitals",
            joinColumns = @JoinColumn(name = "versus_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "capital_id", referencedColumnName = "id"))
    public List<Capital> getCapitals() {
        return capitals;
    }

    public void setCapitals(List<Capital> capitals) {
        this.capitals = capitals;
    }
}
