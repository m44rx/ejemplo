package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Auto;
import com.example.demo.service.AutoService;

@RestController
@RequestMapping("/auto")
public class AutoController {

	@Autowired
	private AutoService service;
	
	@GetMapping("/listar")
	public List<Auto> listarConsecionario(){
		return service.autoListar();
	}
	
	@PostMapping("/grabar")
	public Auto guardarAuto (@RequestBody Auto a) {
		return service.autoGuardar(a);
	}
}
