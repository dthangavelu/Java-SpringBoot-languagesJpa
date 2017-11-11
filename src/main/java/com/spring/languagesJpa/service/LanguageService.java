package com.spring.languagesJpa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.languagesJpa.model.Language;
import com.spring.languagesJpa.repositories.LanguageRepository;

@Service
public class LanguageService {
	
	@Autowired
	private LanguageRepository languageRepository;

	public List<Language> getAll(){
		return (List<Language>) languageRepository.findAll();
	}
	
	public void createNewLang(Language lang) {
		languageRepository.save(lang);
	}
	
	public Language getLangById(Long id) {		
		return languageRepository.findOne(id);
	}
	
	public void destroyLanguageById(Long id) {
		languageRepository.delete(id);
	}

	public void updateLanguage(Language language) {
		languageRepository.save(language);		
	}
	
}
