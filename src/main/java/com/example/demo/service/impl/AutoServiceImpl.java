package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Auto;
import com.example.demo.repository.AutoRepository;
import com.example.demo.service.AutoService;

@Service
public class AutoServiceImpl implements AutoService{
	
	@Autowired
	private AutoRepository repository;

	@Override
	public List<Auto> autoListar() {
		return repository.findAll();
	}

	@Override
	public Auto autoGuardar(Auto a) {
		return repository.save(a);
	}
	
	

}
