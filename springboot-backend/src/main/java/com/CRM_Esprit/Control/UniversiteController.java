package com.CRM_Esprit.Control;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.CRM_Esprit.Entity.Universités;
import com.CRM_Esprit.service.UniversiteServiceImpl;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class UniversiteController {

	@Autowired
	UniversiteServiceImpl univservice;
	
	
	@PostMapping("/addUniver")
	@ResponseBody
    public Universités addUniver(@RequestBody Universités univ) {
		System.out.println(" add Univer");
		return univservice.adduniversite(univ);
		 
		}
	
	@GetMapping("/findUniversités")
	@ResponseBody
	public List<Universités> getUniversités() {
	List<Universités> list = univservice.findUniversités();
	return list;
	}
}
