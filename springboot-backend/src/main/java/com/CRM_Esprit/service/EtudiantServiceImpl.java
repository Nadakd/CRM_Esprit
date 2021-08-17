package com.CRM_Esprit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CRM_Esprit.Entity.Etudiant;
import com.CRM_Esprit.Entity.Matiere;
import com.CRM_Esprit.Repository.EtudiantRepository;



@Service
public class EtudiantServiceImpl implements EtudiantService{
	@Autowired
	EtudiantRepository etudrep;
	
	public Etudiant calculscoregl(int idetud) {
		Etudiant etud = etudrep.findById(idetud).get();
		float net =etudrep.notedotnet();
		float spring =etudrep.notespring();
		float francais =etudrep.notefrancais();
		float anglais =etudrep.noteanglais();
		float score=((net*3)+(spring*2)+(anglais*2)+francais)/8;
		etud.setScore(score);
		return etudrep.save(etud);
		
		
	}
	
	public Etudiant calculscorebi(int idetud) {
		Etudiant etud = etudrep.findById(idetud).get();
		float bi =etudrep.noteBI();
		float data =etudrep.notedatamining();
		float francais =etudrep.notefrancais();
		float anglais =etudrep.noteanglais();
		float score=((bi*3)+(data*2)+(anglais*2)+francais)/8;
		etud.setScore(score);
		return etudrep.save(etud);
		
		
	}
	

}
	
	

