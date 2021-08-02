package com.CRM_Esprit.Repository;


import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.jpa.repository.Query;
import com.CRM_Esprit.Entity.Postulation;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

public interface PostulationRepository extends CrudRepository <Postulation,Integer> {

	@Query(value="SELECT * FROM postulation p,etudiant e,universités u where p.id_univer=u.iduniver and p.id_etud=e.id and etat='en attente' and id_univer=:id_univer order by e.score DESC",nativeQuery=true)
	public List<Postulation> getAllPostulationbyscore(@Param("id_univer")int id_univer);
	
	 @Modifying
    @Transactional
    @Query(value="UPDATE postulation SET etat='accepter' where id_univer=:id_univer LIMIT 15",nativeQuery=true)
    public void affectation(@Param("id_univer")int id_univer);
	
	
}
