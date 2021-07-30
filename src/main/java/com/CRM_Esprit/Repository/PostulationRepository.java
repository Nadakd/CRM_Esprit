package com.CRM_Esprit.Repository;


import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.jpa.repository.Query;
import com.CRM_Esprit.Entity.Postulation;
import org.springframework.data.repository.query.Param;

public interface PostulationRepository extends CrudRepository <Postulation,Integer> {

	@Query(value="SELECT * FROM postulation p,etudiant e,universités u where p.id_univer=u.iduniver and p.id_etud=e.id and etat='en attente' order by e.score DESC",nativeQuery=true)
	public List<Postulation> getAllPostulationbyscore();
	
	
}
