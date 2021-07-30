package com.CRM_Esprit.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CRM_Esprit.Entity.Etudiant;
import com.CRM_Esprit.Entity.Universités;
import com.CRM_Esprit.Repository.EtudiantRepository;
import com.CRM_Esprit.Repository.UniversiteRepository;

@Service
public class UniversiteServiceImpl implements UniversiteService {

	@Autowired
	 UniversiteRepository univrep;
	
	@Autowired
	 EtudiantRepository etudrep;

	public int adduniversite(Universités univ) {
		// TODO Auto-generated method stub
		
		univrep.save(univ);
		
		return univ.getIduniver();
	}
	
	
	
	@Override
	public List<Universités> findUniversités() {
		return  univrep.findUniversités();
	}
	
	
}
