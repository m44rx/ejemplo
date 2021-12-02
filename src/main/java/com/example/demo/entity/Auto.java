package com.example.demo.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_autos")
public class Auto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idAuto;
	private String marca;
	
	@ManyToOne		//	id_consecionario
	@JoinColumn(name = "id_consecionario", referencedColumnName = "idConsecionario")
	private Consecionario consecionario;

	
	public Auto() {
		
	}
	
	
	public Auto(int idAuto, String marca, Consecionario concesionario) {
		super();
		this.idAuto = idAuto;
		this.marca = marca;
		this.consecionario = concesionario;
	}

	public int getIdAuto() {
		return idAuto;
	}

	public void setIdAuto(int idAuto) {
		this.idAuto = idAuto;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public Consecionario getConcesionario() {
		return consecionario;
	}

	public void setConcesionario(Consecionario concesionario) {
		this.consecionario = concesionario;
	}
	
	
	
	
	

}
