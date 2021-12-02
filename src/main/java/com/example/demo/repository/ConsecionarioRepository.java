package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Consecionario;

@Repository
public interface ConsecionarioRepository extends JpaRepository<Consecionario, Integer>{

}
