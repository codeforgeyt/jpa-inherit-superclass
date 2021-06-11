package com.codeforgeyt.jpainheritance.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class Vehicle {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private Integer seats;

    public Vehicle() {
    }

    public Vehicle(String name, Integer seats) {
        this.name = name;
        this.seats = seats;
    }
}
