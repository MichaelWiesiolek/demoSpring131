package com.example.demospring131.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import lombok.Data;
import org.springframework.data.annotation.Id;
@Table(name = "translations")
@Entity
@Data
public class TranslationEntity {
    @jakarta.persistence.Id // sprawdzić

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String code;
    private String language;
    private String translation;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
