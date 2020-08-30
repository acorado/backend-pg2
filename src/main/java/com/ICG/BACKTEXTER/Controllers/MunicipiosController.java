package com.ICG.BACKTEXTER.Controllers;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import com.ICG.BACKTEXTER.DATA.*;

import java.util.Optional;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@CrossOrigin("*")
@RestController
public class MunicipiosController {

  @Autowired
  private adm_municipios_repository adm_municipios_repository;


  @Autowired
  private adm_alumnos_repository adm_alumnos_repository;




	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();

	@GetMapping("/municipios")
  public List<com.ICG.BACKTEXTER.DATA.adm_municipios> getAllGrupos() {
      return adm_municipios_repository.findAll();
  }
  @GetMapping("/municipios/{id}")
  public Optional<com.ICG.BACKTEXTER.DATA.adm_municipios> getSingleGrupos(@PathVariable int id) {
      return adm_municipios_repository.findById(id);
  }


  @GetMapping("/municipios/{id}/total")
  public List<adm_alumnos> getAlumnosMunicipio(@PathVariable int id) {
      return adm_alumnos_repository.searchByMunicipio(id);
  }



}
