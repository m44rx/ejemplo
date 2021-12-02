package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Consecionario;
import com.example.demo.service.ConsecionarioService;

@RestController
@RequestMapping("/conse")
public class ConsecionarioController {

	@Autowired
	private ConsecionarioService service;
	
	@GetMapping("/listar")
	public List<Consecionario> listarConsecionario(){
		return service.consecionarioList();
	}
	
	@PostMapping("/grabar")
	public Consecionario guardarConsecionario (@RequestBody Consecionario c) {
		return service.consecioanrioSave(c);
	}
	
}
