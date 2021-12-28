package com.example.RestCrud.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.RestCrud.entity.Voiture;
import com.example.RestCrud.service.VoitureService;

@RestController
public class VoitureController {
	@Autowired
	VoitureService voitureService;
	
	@GetMapping("/list")
	public ResponseEntity<List<Voiture>> getAllVoitures(){
		List<Voiture> voitures =  voitureService.ListVoitures();
		
		if (voitures.isEmpty()) {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
		else {
			return new ResponseEntity<>(voitures, HttpStatus.OK);
		}
	}
	@PutMapping("/voiture/{id}")
	public ResponseEntity<Voiture> UpdateVoiture(@PathVariable(value="id") long id, @RequestBody Voiture voiture){
		Voiture _voiture = voitureService.findVoitureById(id);
		
		if (_voiture==null) {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}else{
			
			_voiture.setModele(voiture.getModele());
			_voiture.setPuissance(voiture.getPuissance());
			return new ResponseEntity<>(voiture, HttpStatus.OK);
		}
		
	}
	@DeleteMapping("/voiture/{id}")
	public ResponseEntity<HttpStatus> DeleteVoiture(@PathVariable(value="id") long id){
		voitureService.DeleteVoiture(id);
		
			return new ResponseEntity<>(HttpStatus.OK);
		}
		
	
	

}
