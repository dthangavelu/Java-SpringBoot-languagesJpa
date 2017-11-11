package com.spring.languagesJpa.repositories;

import org.springframework.data.repository.CrudRepository;

import com.spring.languagesJpa.model.Language;

public interface LanguageRepository extends CrudRepository<Language, Long> {

}
