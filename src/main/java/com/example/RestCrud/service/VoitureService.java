package com.example.RestCrud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.RestCrud.entity.Voiture;
import com.example.RestCrud.repository.VoitureRepository;
import com.sun.istack.NotNull;

@Service
public class VoitureService {
	@Autowired
	VoitureRepository voitureRepository;
	
	public List<Voiture> ListVoitures(){
		return voitureRepository.findAll();
	}
	
	public Voiture findVoitureById(@NotNull long id ) {
		return voitureRepository.findById(id).get();
		
	}
	public void AddVoiture (Voiture voiture) {
		voitureRepository.save(voiture);
	}
	public void DeleteVoiture (long id) {
		voitureRepository.deleteById(id);
	}
	
}
