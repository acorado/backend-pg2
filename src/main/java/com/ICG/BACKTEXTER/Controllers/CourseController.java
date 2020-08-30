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
public class CourseController {

  @Autowired
  private adm_cursos_repository adm_cursos_repository;

  @Autowired
  private  adm_catedratico_curso_repository  adm_catedratico_curso_repository;


  @Autowired
  private adm_alumnos_repository adm_alumnos_repository;


  @Autowired
  private adm_alumno_curso_repository adm_alumno_curso_repository;


  
  @Autowired
  private adm_actividades_repository adm_actividades_repository;


   
  @Autowired
  private adm_actividades_curso_repository adm_actividades_curso_repository;


	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();

	@GetMapping("/cursos")
  public List<com.ICG.BACKTEXTER.DATA.adm_cursos> getAllGrupos() {
      return adm_cursos_repository.findAll();
  }
  @GetMapping("/cursos/{id}")
  public Optional<com.ICG.BACKTEXTER.DATA.adm_cursos> getSingleGrupos(@PathVariable int id) {
      return adm_cursos_repository.findById(id);
  }
  @GetMapping("/cursos/{id}/alumnos")
  public List<com.ICG.BACKTEXTER.DATA.adm_alumnos> getContactosGrupos(@PathVariable int id) {
      return adm_alumnos_repository.findByCurso(id);
  }
  @PostMapping("/cursos")
  adm_cursos newGrupo(@RequestBody adm_cursos newGrupo) {
	    return adm_cursos_repository.save(newGrupo);
  }
  @PutMapping("/cursos/{id}")
  Optional<adm_cursos> updateGrupo(@RequestBody adm_cursos newGrupo,@PathVariable int id) {
	     return adm_cursos_repository.findById(id)
	    	      .map(curso -> {
	    	          curso.setNombre(newGrupo.getNombre());
	    	          return adm_cursos_repository.save(curso);
	    	        });
  }





  @PostMapping("/cursos/{idcurso}/catedraticos/{idcatedratico}")
  public com.ICG.BACKTEXTER.DATA.adm_catedratico_curso newContactosGrupos(@PathVariable int idcurso,@PathVariable int idcatedratico) {
	  catedraticocursoID id=new catedraticocursoID(idcatedratico,idcurso);
	  adm_catedratico_curso a=new adm_catedratico_curso();
	  a.setId(id);
	  a.setEstado(1);
	  return adm_catedratico_curso_repository.save(a);
  }


  @PostMapping("/cursos/{idcurso}/alumnos/{idalumno}")
  public com.ICG.BACKTEXTER.DATA.adm_alumno_curso newalumnoCurso(@PathVariable int idcurso,@PathVariable int idalumno) {
	  alumnocursoID id=new alumnocursoID(idalumno,idcurso);
	  adm_alumno_curso a=new adm_alumno_curso();
	  a.setId(id);
	  a.setEstado(1);
	  return adm_alumno_curso_repository.save(a);
  }


  @PostMapping("/cursos/{idcurso}/actividad/{idNota}")
  public com.ICG.BACKTEXTER.DATA.adm_actividades_curso newactividadCurso(@PathVariable int idcurso,@PathVariable int idNota) {
	  actividadescursoID id=new actividadescursoID(idNota,idcurso);
	  adm_actividades_curso a=new adm_actividades_curso();
	  a.setId(id);
	  a.setEstado(1);
	  return adm_actividades_curso_repository.save(a);
  }



  @GetMapping("/cursos/{id}/notas")
  public List<com.ICG.BACKTEXTER.DATA.adm_actividades> getTelefonosContactos(@PathVariable int id) {
      return adm_actividades_repository.findByCurso(id);
  }




  /*
  @PutMapping("/grupos/{idgrupo}/contactos/{idcontacto}")
  public com.ICG.BACKTEXTER.DATA.adm_contacto_grupo updateContactosGrupos(@PathVariable int idgrupo,@PathVariable int idcontacto,@RequestBody adm_estado estado) {
	  contactogrupoID id=new contactogrupoID(idcontacto,idgrupo);	  
	  Optional<adm_contacto_grupo> a=adm_contacto_grupo_repository.findById(id);
	  adm_contacto_grupo b=a.get();
	  
	  b.setEstado(estado.getEstado());
	  return adm_contacto_grupo_repository.save(b);
  }
  
  
  @DeleteMapping("/grupos/{idgrupo}/contactos/{idcontacto}")
  public com.ICG.BACKTEXTER.DATA.adm_contacto_grupo deleteContactosGrupos(@PathVariable int idgrupo,@PathVariable int idcontacto) {
	  contactogrupoID id=new contactogrupoID(idcontacto,idgrupo);
	  Optional<adm_contacto_grupo> a=adm_contacto_grupo_repository.findById(id);
	  adm_contacto_grupo b=a.get();
	  b.setEstado(0);
	  return adm_contacto_grupo_repository.save(b);
  }*/
}
