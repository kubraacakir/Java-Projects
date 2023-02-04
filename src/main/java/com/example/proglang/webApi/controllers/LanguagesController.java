package com.example.proglang.webApi.controllers;

import com.example.proglang.business.abstracts.LanguageService;
import com.example.proglang.entities.concretes.Language;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/languages")
public class LanguagesController {
    private LanguageService languageService;

    @Autowired
    public LanguagesController(LanguageService languageService) {
        this.languageService = languageService;
    }
    @GetMapping("/getall")
    public List<Language> getAll(){
        return languageService.getAll();
    }
    @GetMapping("/insert")
    public void insert(){
        languageService.insert();
    }

    @GetMapping("/delete")
    public void delete(){
        languageService.delete();
    }
    @GetMapping("/update")
    public void update(){
        languageService.update();
    }
    @GetMapping("/getbyid/{id}")
    public Language getById(@PathVariable int id){
        return languageService.getById(id);
    }
}

