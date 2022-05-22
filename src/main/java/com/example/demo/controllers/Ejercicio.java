package com.example.demo.controllers;



import java.util.ArrayList;


import com.example.demo.models.Pet;

import com.example.demo.services.PetService;


//import com.example.demo.models.Data;


//import com.example.demo.services.DataBDService;
import com.example.demo.utils.Utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


//import java.io.File;


@RestController
public class Ejercicio {

    @Autowired
    PetService petService;
   
   /* @Autowired
    TranslatorService translatorService;*/
  
   


    // http://localhost:8080/
    @GetMapping("/")
    public String greet() {
        return "Bienvenido al servidor backend de Zoel y Aitor";
    }

    // http://localhost:8080/contar/ana
    @GetMapping("/contar/{name}")
    public String palindrome(@PathVariable String name) {
        String contarLetras = Utils.ContarLetras(name);
        return contarLetras;
    }
    
  //3º
   // http://localhost:8080/guarda?nombre=???
   @GetMapping("/guarda")
   public String addPet(@RequestParam String nombre, @RequestParam String especie){
       //insert into pet(name) values ("nombre")
       Pet pet = new Pet();
       pet.setName(nombre);
       pet.setSpecies(especie);
       petService.savePet(pet);
       return "Mascota registrada correctamente";
   }

// http://localhost:8080/listar
@GetMapping("/listar")
public String petList(){
    ArrayList<Pet> pets = petService.getAllPets();
    String listado = "Mascotas registradas:<br/>";
    for(Pet pet : pets){
        listado +=pet.getId() + " ";
        listado += pet.getName() + " ";
        listado += pet.getSpecies();
        listado += "<br/>";
    }
    return listado;
}
 


/*4- Cuando el cliente acceda a la dirección:
http://localhost:8080/BBBB*/
@GetMapping("/invertir/{name}")
public String darVuelta(@PathVariable String name) {
    String invertir = Utils.darLaVuelta(name);
    return invertir;

}


/*5-*/
 /*// http://localhost:8080/traduce/????
 @GetMapping("/traduce/{frase}")
 public String getTranslation(@PathVariable String frase){
     Translate t = translatorService.translateMetod(frase);

     return "La palabra en ingles es: "+t.responseData.translatedText;
 }

*/
}