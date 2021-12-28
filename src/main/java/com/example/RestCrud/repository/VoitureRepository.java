package com.example.RestCrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.RestCrud.entity.Voiture;

public interface VoitureRepository extends JpaRepository<Voiture, Long>{

}
