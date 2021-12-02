package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Auto;

public interface AutoService {

	List<Auto> autoListar();
	
	Auto autoGuardar(Auto a);
}
