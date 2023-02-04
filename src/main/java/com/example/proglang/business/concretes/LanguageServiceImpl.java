package com.example.proglang.business.concretes;

import com.example.proglang.business.abstracts.LanguageService;
import com.example.proglang.dataAccess.abstracts.LanguageRepository;
import com.example.proglang.entities.concretes.Language;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LanguageServiceImpl implements LanguageService {
    private LanguageRepository languageRepository;
    @Autowired
    public LanguageServiceImpl(LanguageRepository languageRepository) {
        this.languageRepository = languageRepository;
    }

    @Override
    public List<Language> getAll() {
        return languageRepository.getAll();
    }

    @Override
    public void insert() {
        languageRepository.insert();
    }

    @Override
    public void delete() {
        languageRepository.delete();
    }

    @Override
    public void update() {
        languageRepository.update();
    }

    @Override
    public Language getById(int id) {
        return languageRepository.getById(id);
    }

}
