/*package com.example.demo.services;

import java.util.ArrayList;

import com.example.demo.models.Coche;
import com.example.demo.repositories.CocheRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CocheService {
    @Autowired
    CocheRepository repository;


    public Coche savePet(Coche coche){
        return CocheRepository.save(coche);
    }

    public ArrayList<Coche> getAllPets(){
        ArrayList<Coche> pets = (ArrayList<Coche>) CocheRepository.findAll();
        return pets;
    }
}
*/