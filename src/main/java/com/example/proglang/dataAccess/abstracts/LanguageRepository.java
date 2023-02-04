package com.example.proglang.dataAccess.abstracts;

import com.example.proglang.entities.concretes.Language;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface LanguageRepository {
    List<Language> getAll();
    public void insert();
    public void delete();
    public void update();
    public Language getById(int id);
}
