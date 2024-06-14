package com.blu4ck.demo;

import jakarta.persistence.*;
import jakarta.persistence.Entity;

@Entity
@Table(name = "nights")
public class Night {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String night;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNight() {
        return night;
    }

    public void setNight(String night) {
        this.night = night;
    }
}
