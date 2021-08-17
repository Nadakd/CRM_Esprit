package com.CRM_Esprit.Entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Matiere implements Serializable {

	@Id
	@GeneratedValue
	private int id;
	

	@Column(name="nom_matiere")
	private String nom_matiere;
	
	@Column(name="note")
	private float note;
	
	@ManyToOne
    @JoinColumn(name="idetud")
	Etudiant etud;
	
	
	 @ManyToMany(fetch = FetchType.LAZY,
	            cascade = {
	                CascadeType.PERSIST,
	                CascadeType.MERGE
	            },
	            mappedBy = "mat")
	    private Set<Etudiant> etudiant = new HashSet<Etudiant>();

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom_matiere() {
		return nom_matiere;
	}

	public void setNom_matiere(String nom_matiere) {
		this.nom_matiere = nom_matiere;
	}

	public float getNote() {
		return note;
	}

	public void setNote(float note) {
		this.note = note;
	}

	public Matiere() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Matiere(int id, String nom_matiere, float note) {
		super();
		this.id = id;
		this.nom_matiere = nom_matiere;
		this.note = note;
	}
	
	
	
	
}
