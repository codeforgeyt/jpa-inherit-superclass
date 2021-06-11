package com.codeforgeyt.jpainheritance.model;

import javax.persistence.Entity;

@Entity
public class Truck extends Vehicle {
    private Integer maxLoad;
    private Boolean sleeperCab;

    public Truck() {
    }

    public Truck(String name, Integer seats, Integer maxLoad, Boolean sleeperCab) {
        super(name, seats);
        this.maxLoad = maxLoad;
        this.sleeperCab = sleeperCab;
    }
}
