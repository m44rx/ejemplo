/**
 * 
 */
package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Consecionario;

public interface ConsecionarioService {
	
	List<Consecionario> consecionarioList();
	
	Consecionario consecioanrioSave(Consecionario c);

}
