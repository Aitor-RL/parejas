package com.example.demo.services;

import com.example.demo.models.Translate;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class TranslatorService {

    @Autowired
    RestTemplate restTemplate;

    public Translate translateMetod(String cad){
        String url = "https://api.mymemory.translated.net/get?q="+cad+"&langpair=es|en";
        Translate text = restTemplate.getForObject(url, Translate.class);
        return text;
    }
}
