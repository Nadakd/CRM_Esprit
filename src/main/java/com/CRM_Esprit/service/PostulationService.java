package com.CRM_Esprit.service;

import java.util.List;

import com.CRM_Esprit.Entity.Postulation;

public interface PostulationService {

	
	public int Postuler(Postulation pos, int id_univer) ;
	
	public List<Postulation> getAllPostulationbyscore(int id_univer);
}
