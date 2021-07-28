package com.CRM_Esprit.Control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.CRM_Esprit.Entity.Universités;
import com.CRM_Esprit.service.UniversiteServiceImpl;



@RestController
public class UniversiteController {

	@Autowired
	UniversiteServiceImpl univservice;
	
	
	@PostMapping("/addUniver")
	@ResponseBody
    public int addUniver(@RequestBody Universités univ) {
		System.out.println(" add Univer");
		return univservice.adduniversite(univ);
		 
		}
}
