package com.example.demo.services;

import java.util.ArrayList;

import com.example.demo.models.Coche;
import com.example.demo.repositories.CocheRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CocheService {
    @Autowired
    CocheRepository cocheRepository;


    public Coche saveCoche(Coche coche){
        return cocheRepository.save(coche);
    }

    public ArrayList<Coche> getAllCoche(){
        ArrayList<Coche> pets = (ArrayList<Coche>) cocheRepository.findAll();
        return pets;
    }
}
