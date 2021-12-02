package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Consecionario;
import com.example.demo.repository.ConsecionarioRepository;
import com.example.demo.service.ConsecionarioService;

@Service
public class ConsecionarioServiceImpl implements ConsecionarioService{

	@Autowired
	private ConsecionarioRepository repository;
	
	@Override
	public List<Consecionario> consecionarioList() {
		return repository.findAll();
	}

	@Override
	public Consecionario consecioanrioSave(Consecionario c) {
		return repository.save(c);
	}

}
