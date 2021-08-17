package com.CRM_Esprit.Entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class Postulation implements Serializable {

	@Id
	@GeneratedValue
	private int id;
	
	@ManyToOne
    @JoinColumn(name="id_etud")
	Etudiant etud;
	
	@ManyToOne
    @JoinColumn(name="id_univer")
	Universités Universités;
	
	private String etat;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Etudiant getEtud() {
		return etud;
	}

	public void setEtud(Etudiant etud) {
		this.etud = etud;
	}

	public Universités getUniversités() {
		return Universités;
	}

	public void setUniversités(Universités universités) {
		Universités = universités;
	}

	public String getEtat() {
		return etat;
	}

	public void setEtat(String etat) {
		this.etat = etat;
	}

	public Postulation() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Postulation(int id, Etudiant etud, com.CRM_Esprit.Entity.Universités universités, String etat) {
		super();
		this.id = id;
		this.etud = etud;
		Universités = universités;
		this.etat = etat;
	}
	
	
	
}
