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
public class CatedraticController {

  @Autowired
  private adm_catedraticos_repository adm_catedraticos_repository;


  @Autowired
  private adm_cursos_repository adm_cursos_repository;


	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();

	@GetMapping("/catedraticos")
  public List<com.ICG.BACKTEXTER.DATA.adm_catedraticos> getAllContactos() {
      return adm_catedraticos_repository.findAll();
  }
   @GetMapping("/catedraticos/{id}")
   public Optional<com.ICG.BACKTEXTER.DATA.adm_catedraticos> getSingleContactos(@PathVariable int id) {
       return adm_catedraticos_repository.findById(id);
   }
   @PostMapping("/catedraticos")
   adm_catedraticos newContacto(@RequestBody adm_catedraticos newContacto) {
 	    return adm_catedraticos_repository.save(newContacto);
   }
 
  @GetMapping("/catedraticos/{id}/cursos")
  public List<adm_cursos> getContactosGrupos(@PathVariable int id) {
      return adm_cursos_repository.findByCatedratico(id);
  }

  @GetMapping("/catedraticos/{id}/initial")
  public Optional<adm_catedraticos> getCatedraticoInfo(@PathVariable String id) {



      return adm_catedraticos_repository.findByIkey(id);
  }




 /*
     
   @PutMapping("/contactos/{id}")
   Optional<adm_catedraticos> updateContacto(@RequestBody adm_catedraticos newContacto,@PathVariable int id) {
 	     return adm_catedraticos_repository.findById(id)
 	    	      .map(contacto -> {
 	    	          contacto.setNombre(newContacto.getNombre());
 	    	          contacto.setApellido(newContacto.getApellido());
 	    	          contacto.setEstado(newContacto.getEstado());
 	    	          contacto.setIdkey(newContacto.getIdkey());
 	    	          return adm_catedraticos_repository.save(contacto);
 	    	          
 	    	        });
   }


   @GetMapping("/contactos/{id}/telefonos")
   public List<com.ICG.BACKTEXTER.DATA.adm_telefono> getTelefonosContactos(@PathVariable int id) {
       return adm_telefono_repository.findByContacto(id);
   }

   @PostMapping("/contactos/{id}/telefonos")
   adm_telefono newTelefono(@RequestBody adm_telefono newTelefono,@PathVariable int id) {
	    newTelefono.setContacto(id);
 	    return adm_telefono_repository.save(newTelefono);
   }
   @PutMapping("/contactos/{idContacto}/telefonos/{idTelefono}")
   Optional<adm_telefono> updateTelefono(@RequestBody adm_telefono newTelefono,@PathVariable int idContacto,@PathVariable int idTelefono) {
	   return adm_telefono_repository.findById(idTelefono)
	    	      .map(telefono -> {
	    	          telefono.setNumero(newTelefono.getNumero());
	    	          telefono.setEstado(newTelefono.getEstado());
	    	          return adm_telefono_repository.save(telefono);	    	          
	    	        });
   }
   */
   
   
   
}
