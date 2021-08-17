package com.CRM_Esprit.Entity;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class Responsable implements Serializable  {

	@Id
	@GeneratedValue
	private int id_res;

	public int getId_res() {
		return id_res;
	}

	public void setId_res(int id_res) {
		this.id_res = id_res;
	}

	public Responsable(int id_res) {
		super();
		this.id_res = id_res;
	}

	public Responsable() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	
}
