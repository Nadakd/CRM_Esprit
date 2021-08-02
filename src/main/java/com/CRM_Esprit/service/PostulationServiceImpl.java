package com.CRM_Esprit.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CRM_Esprit.Entity.Etudiant;
import com.CRM_Esprit.Entity.Postulation;
import com.CRM_Esprit.Entity.Universités;
import com.CRM_Esprit.Repository.EtudiantRepository;
import com.CRM_Esprit.Repository.PostulationRepository;
import com.CRM_Esprit.Repository.UniversiteRepository;



@Service
public class PostulationServiceImpl implements PostulationService {

	@Autowired
	 PostulationRepository posrep;
	
	@Autowired
	 EtudiantRepository etudrep;
	
	@Autowired
	UniversiteRepository univerrep;
	
public int Postuler(Postulation pos, int id_univer) {
		
			 Etudiant etud=etudrep.findById(1).get();
			 pos.setEtud(etud);
		     Universités univer = univerrep.findById(id_univer).get(); 
		     pos.setUniversités(univer);
		     pos.setEtat("en attente");
		     posrep.save(pos);
			return id_univer;
}

public List<Postulation> getAllPostulationbyscore(int id_univer) {
	return posrep.getAllPostulationbyscore(id_univer);
}


		}
