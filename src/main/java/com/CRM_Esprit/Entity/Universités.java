package com.CRM_Esprit.Entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
public class Universités implements Serializable{

	@Id
	@GeneratedValue
	private int iduniver;
	

	@Column(name="nom_univer")
	private String nom_univer;
	
	@Column(name="Details")
	private String Details;
	
	
	@JsonIgnore
	@OneToMany(cascade=CascadeType.ALL,mappedBy="Universités")
	private Set<Etudiant> etudiant ;

	
	public int getIduniver() {
		return iduniver;
	}

	public void setIduniver(int iduniver) {
		this.iduniver = iduniver;
	}

	public Set<Etudiant> getEtudiant() {
		return etudiant;
	}

	public void setEtudiant(Set<Etudiant> etudiant) {
		this.etudiant = etudiant;
	}

	public String getNom_univer() {
		return nom_univer;
	}

	public void setNom_univer(String nom_univer) {
		this.nom_univer = nom_univer;
	}

	public String getDetails() {
		return Details;
	}

	public void setDetails(String details) {
		Details = details;
	}

	public Universités(int iduniver, String nom_univer, String details) {
		super();
		this.iduniver = iduniver;
		this.nom_univer = nom_univer;
		Details = details;
	}

	public Universités() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
}
