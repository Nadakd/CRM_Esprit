package com.CRM_Esprit.Repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.CRM_Esprit.Entity.Etudiant;

public interface EtudiantRepository extends CrudRepository <Etudiant,Integer> {

	@Query("select note from Matiere where nom_matiere='spring' ")
	public float notespring();
	
	@Query("select note from Matiere where nom_matiere='.Net' ")
	public float notedotnet();

	@Query("select note from Matiere where nom_matiere='data mining' ")
	public float notedatamining();
	
	@Query("select note from Matiere where nom_matiere='BI' ")
	public float noteBI();
	
	@Query("select note from Matiere where nom_matiere='francais' ")
	public float notefrancais();
	
	@Query("select note from Matiere where nom_matiere='anglais' ")
	public float noteanglais();
}
