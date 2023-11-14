package com.loxasoft.departamentservice.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.loxasoft.departamentservice.entity.Departament;
import com.loxasoft.departamentservice.repository.DepartamentRepository;

import jakarta.transaction.Transactional;

@Service
public class DepartamentService {
 private final DepartamentRepository departamentRepository;


@Transactional
public Departament createDepartament(Departament departament) {
	return departamentRepository.save(departament);
}

public Departament getDepartamentById(Integer id) {
	return departamentRepository.findById(id).get();
}


public List<Departament> findAll(){
	return departamentRepository.findAll();
}
  
 
 
}
