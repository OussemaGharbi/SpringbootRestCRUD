package com.example.RestCrud.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity

public class Voiture {
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getPuissance() {
		return puissance;
	}
	public void setPuissance(String puissance) {
		this.puissance = puissance;
	}
	public String getModele() {
		return modele;
	}
	public void setModele(String modele) {
		this.modele = modele;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id ;
	@Column
	private String puissance;
	@Column
	private String modele;
	@Column
	private String type;
	
	

}
