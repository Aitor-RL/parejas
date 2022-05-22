package com.example.demo.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="coche")
public class Coche {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    Long id;

    @Column(nullable = false)
    String name;

    @Column(nullable = false)
    String escuderia;

    public Long getId(){
        return id;
    } 

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setSpecies(String escuderia){
        this.escuderia = escuderia;
    }
    public String getSpecies(){
        return escuderia;
    }

}
