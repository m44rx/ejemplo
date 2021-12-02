package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Auto;

@Repository
public interface AutoRepository extends JpaRepository<Auto, Integer>{

}
