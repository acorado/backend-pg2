package com.ICG.BACKTEXTER.Controllers;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.CrossOrigin;
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
public class AlumnosController {

  @Autowired
  private adm_alumnos_repository adm_alumnos_repository;


  @Autowired
  private adm_cursos_repository adm_cursos_repository;

  @Autowired
  private adm_actividades_repository adm_actividades_repository;

	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();

	@GetMapping("/alumnos")
  public List<com.ICG.BACKTEXTER.DATA.adm_alumnos> getAllContactos() {
      return adm_alumnos_repository.findAll();
  }
   @GetMapping("/alumnos/{id}")
   public Optional<com.ICG.BACKTEXTER.DATA.adm_alumnos> getSingleContactos(@PathVariable int id) {
       return adm_alumnos_repository.findById(id);
   }
   @PostMapping("/alumnos")
   adm_alumnos newContacto(@RequestBody adm_alumnos newContacto) {
 	    return adm_alumnos_repository.save(newContacto);
   }


   
  @GetMapping("/alumnos/{id}/cursos")
  public List<adm_cursos> getContactosGrupos(@PathVariable int id) {
      return adm_cursos_repository.findByAlumno(id);
  }

  @GetMapping("/alumnos/{id}/notas")
  public List<adm_actividades> getAlumnosNotas(@PathVariable int id) {
      return adm_actividades_repository.findByAlumno(id);
  }

 

  @GetMapping("/notas/{id}")
  public List<adm_actividades> getAlumnosNotasInfo(@PathVariable int id) {
      //return adm_actividades_repository.findByNota(id);
      return adm_actividades_repository.findByNota(id);
  }

 

  @GetMapping("/alumnos/{id}/initial")
  public Optional<com.ICG.BACKTEXTER.DATA.adm_alumnos> getAlumnoInfo(@PathVariable String id) {



      return adm_alumnos_repository.findByIkey(id);
  }


     
   @PutMapping("/alumnos/{id}")
   Optional<adm_alumnos> updateContacto(@RequestBody adm_alumnos newAlumnos,@PathVariable int id) {
 	     return adm_alumnos_repository.findById(id)
 	    	      .map(alumnos -> {
 	    	          alumnos.setNombre(newAlumnos.getNombre());
 	    	          alumnos.setApellido(newAlumnos.getApellido());
 	    	          alumnos.setEstado(newAlumnos.getEstado());
                      alumnos.setIdkey(newAlumnos.getIdkey());
                      alumnos.setCarrera(newAlumnos.getCarrera());
                     alumnos.setDpi(newAlumnos.getDpi());
                     alumnos.setMunicipio(newAlumnos.getMunicipio());
                     alumnos.setSemestre(newAlumnos.getSemestre());
                     alumnos.setTelefono(newAlumnos.getTelefono());
                        return adm_alumnos_repository.save(alumnos);
 	    	          
 	    	        });
   }

   @PostMapping("/alumnos/{id}/notas")
   adm_actividades newTelefono(@RequestBody adm_actividades newActividades,@PathVariable int id) {
        newActividades.setAlumno(id);
        newActividades.setParcial1(newActividades.getParcial1());
        newActividades.setParcial2(newActividades.getParcial2());
        newActividades.setParcial3(newActividades.getParcial3());
        newActividades.setActividad(newActividades.getActividad());
        newActividades.setProyecto(newActividades.getParcial3());
        newActividades.setExamen(newActividades.getExamen());
        newActividades.setCurso(newActividades.getCurso());
        newActividades.setNombreA(newActividades.getNombreA());
        newActividades.setNombreC(newActividades.getNombreC());
 	    return adm_actividades_repository.save(newActividades);
   }


   @PutMapping("/alumnos/{idAlumno}/notas/{idNotas}")
   Optional<adm_actividades> updateTelefono(@RequestBody adm_actividades newActividades,@PathVariable int idAlumno,@PathVariable int idNotas) {
	   return adm_actividades_repository.findById(idNotas)         
	    	      .map(actividad -> {
                    actividad.setParcial1(newActividades.parcial1);
                    actividad.setParcial2(newActividades.parcial2);
                    actividad.setParcial3(newActividades.parcial3);
                    actividad.setActividad(newActividades.actividad);
                    actividad.setProyecto(newActividades.proyecto);
                    actividad.setExamen(newActividades.examen);
                    actividad.setCurso(actividad.getCurso());
                    actividad.setNombreA(actividad.getNombreA());
                    actividad.setNombreC(actividad.getNombreC());
                    actividad.setAlumno(idAlumno);

	    	          return adm_actividades_repository.save(actividad);	    	          
	    	        });
   }

   
   
   
}
