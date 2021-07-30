package com.CRM_Esprit.service;

import java.util.List;
import com.CRM_Esprit.Entity.Universités;

public interface UniversiteService {

	
	public int adduniversite(Universités univ);
	public List<Universités> findUniversités();

}
