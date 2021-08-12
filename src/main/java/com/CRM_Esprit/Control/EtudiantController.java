package com.CRM_Esprit.Control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.CRM_Esprit.Entity.Etudiant;
import com.CRM_Esprit.Entity.Matiere;
import com.CRM_Esprit.Entity.Postulation;
import com.CRM_Esprit.service.EtudiantServiceImpl;
import com.CRM_Esprit.service.PostulationServiceImpl;

@RestController
public class EtudiantController {

	
	@Autowired
	EtudiantServiceImpl etudservice;
	
	 @PutMapping(value = "/calculgl/{idetud}") 
	  @ResponseBody
		public Etudiant calculgl(@PathVariable("idetud") int idetud) {
				return etudservice.calculscoregl(idetud);
				
			}
	 
	 @PutMapping(value = "/calculbi/{idetud}") 
	  @ResponseBody
		public Etudiant calculbi(@PathVariable("idetud") int idetud) {
				return etudservice.calculscorebi(idetud);
				
			}
	
}
