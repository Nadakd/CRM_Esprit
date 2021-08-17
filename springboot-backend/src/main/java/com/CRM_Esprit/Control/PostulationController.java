package com.CRM_Esprit.Control;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.CRM_Esprit.Entity.Postulation;
import com.CRM_Esprit.service.PostulationServiceImpl;



@RestController
public class PostulationController {

	
	@Autowired
	PostulationServiceImpl posservice;
	
	
	@PostMapping("/postuler/{id_univer}")
	@ResponseBody
    public int Postuler(@RequestBody Postulation pos,@PathVariable("id_univer") int id_univer) {
		
		return posservice.Postuler(pos, id_univer);
		 
		}
	
	@GetMapping("/getAllPostulationbyscore/{id_univer}")
	@ResponseBody
	public List<Postulation> getAllPublicationByDate(@PathVariable("id_univer") int id_univer) {
	return posservice.getAllPostulationbyscore(id_univer);
	}
	
	
	@PutMapping(value = "/affectation/{id_univer}") 
    @ResponseBody
	public void affectation(@PathVariable("id_univer") int id_univer) {
		posservice.affectation(id_univer);
					
				}
}
