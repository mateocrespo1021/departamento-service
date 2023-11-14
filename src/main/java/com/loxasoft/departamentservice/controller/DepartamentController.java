package com.loxasoft.departamentservice.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.loxasoft.departamentservice.entity.Departament;
import com.loxasoft.departamentservice.service.DepartamentService;

@RestController
@RequestMapping("/api/departaments")
public class DepartamentController {
  private final DepartamentService departamentService;

public DepartamentController(DepartamentService departamentService) {
	this.departamentService = departamentService;
}

@PostMapping
public Departament createDepartament(@RequestBody Departament departament) {
	  System.out.println("Datos recibidos en el controlador: " + departament.toString());
	return departamentService.createDepartament(departament);
}

@GetMapping
public List<Departament> findAll(){
	return departamentService.findAll();
}



@GetMapping("/{id}")
public Departament getDepartamentById(@PathVariable Integer id) {
	return departamentService.getDepartamentById(id);
}
  
  
  
}
