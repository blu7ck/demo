package com.blu4ck.demo;

import jakarta.persistence.*;
import jakarta.persistence.Entity;


@Entity
public class Night {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String night;
    private String happens;

    public Night(){

    }

    public String getHappens() {return happens;}

    public void setHappens(String happens) {this.happens = happens;}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNight() {
        return night;
    }

    public void setNight(String night) {
        this.night = night;
    }
}

