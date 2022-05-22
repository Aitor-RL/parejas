package com.example.demo.repositories;

import com.example.demo.models.Coche;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CocheRepository extends CrudRepository<Coche, Long>{
    
}
