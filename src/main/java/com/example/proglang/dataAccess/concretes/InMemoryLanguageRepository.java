package com.example.proglang.dataAccess.concretes;

import com.example.proglang.dataAccess.abstracts.LanguageRepository;
import com.example.proglang.entities.concretes.Language;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class InMemoryLanguageRepository implements LanguageRepository {
    List<Language> languages;

    public InMemoryLanguageRepository() {
        languages = new ArrayList<Language>();
        languages.add(new Language(1,"Java"));
        languages.add(new Language(2,"C#"));
        languages.add(new Language(3,"C"));
        languages.add(new Language(4,"Python"));
    }

    @Override
    public List<Language> getAll() {
        return languages;
    }

    @Override
    public void insert() {
        languages.add(new Language(5,"C++"));
    }

    @Override
    public void delete() {
        languages.remove(1);
    }

    @Override
    public void update() {
        languages.set(3,new Language(4,"Flutter"));
    }

    @Override
    public Language getById(int id) {
        return languages.get(id-1);
    }
}
