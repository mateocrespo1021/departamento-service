package com.loxasoft.departamentservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.loxasoft.departamentservice.entity.Departament;

public interface DepartamentRepository extends JpaRepository<Departament, Integer>{
    
}
