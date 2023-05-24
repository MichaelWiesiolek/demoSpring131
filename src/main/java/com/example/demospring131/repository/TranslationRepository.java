package com.example.demospring131.repository;

import com.example.demospring131.model.entity.TranslationEntity;
import org.springframework.data.jpa.repository.JpaRepository;


public interface TranslationRepository extends JpaRepository<TranslationEntity, Long> {
}
