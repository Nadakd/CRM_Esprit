package com.CRM_Esprit.Entity;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonIgnore;



@Entity
public class Etudiant implements Serializable {
	@Id
	@GeneratedValue
	private int id;
	
	@Column(name="nom_prenom",length=30)
	@NotEmpty
	@Size(min=5,max=30)
	private String nom_prenom;
	
	@DateTimeFormat(pattern="yyyy-mm-dd")
	private Date dateNaissance;
	
	@NotEmpty
	@Email
	private String email;
	
	private String classe;
	
	private String specialite;
	
	private int score;
	
	@JsonIgnore
	@OneToMany(cascade=CascadeType.ALL,mappedBy="etud")
	private Set<Postulation> post ;
	
	
	
	@ManyToMany(fetch = FetchType.LAZY,
            cascade = {
                CascadeType.PERSIST,
                CascadeType.MERGE
            })
    @JoinTable(name = "etud_matiere",
            joinColumns = { @JoinColumn(name = "etud_id") },
            inverseJoinColumns = { @JoinColumn(name = "mat_id") })
    private Set<Matiere> mat = new HashSet<Matiere>();
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public Date getDateNaissance() {
		return dateNaissance;
	}
	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getClasse() {
		return classe;
	}
	public void setClasse(String classe) {
		this.classe = classe;
	}
	
	public String getSpecialite() {
		return specialite;
	}
	public void setSpecialite(String specialite) {
		this.specialite = specialite;
	}
	
	public String getNom_prenom() {
		return nom_prenom;
	}
	public void setNom_prenom(String nom_prenom) {
		this.nom_prenom = nom_prenom;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public Etudiant() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Etudiant(int id, String nom_prenom, Date dateNaissance, String email, String classe, String specialite,
			int score) {
		super();
		this.id = id;
		this.nom_prenom = nom_prenom;
		this.dateNaissance = dateNaissance;
		this.email = email;
		this.classe = classe;
		this.specialite = specialite;
		this.score = score;
	}
	
}