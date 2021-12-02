package com.example.demo.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_consecionario")
public class Consecionario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idConsecionario;
	private String local;

	@OneToMany(mappedBy = "consecionario", cascade = {CascadeType.PERSIST,CascadeType.MERGE,CascadeType.DETACH}
	,fetch = FetchType.EAGER)
			//
	List<Auto> autos = new ArrayList<>();

	
	public Consecionario () {
		
	}
	
	public Consecionario(int idConsecionario, String local, List<Auto> autos) {
		super();
		this.idConsecionario = idConsecionario;
		this.local = local;
		this.autos = autos;
	}

	public int getIdConsecionario() {
		return idConsecionario;
	}

	public void setIdConsecionario(int idConsecionario) {
		this.idConsecionario = idConsecionario;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public List<Auto> getAutos() {
		return autos;
	}

	public void setAutos(List<Auto> autos) {
		this.autos = autos;
	}
	
	
	
}
