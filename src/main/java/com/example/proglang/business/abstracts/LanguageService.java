package com.example.proglang.business.abstracts;

import com.example.proglang.entities.concretes.Language;

import java.util.List;


public interface LanguageService {
    List<Language> getAll();
    public void insert();
    public void delete();
    public void update();
    public Language getById(int id);
}
