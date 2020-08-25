package com.ICG.BACKTEXTER.DATA;

import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.boot.jackson.JsonObjectDeserializer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;


public interface adm_actividades_curso_repository extends JpaRepository<adm_actividades_curso, actividadescursoID> {

//  @Query("FROM adm_contacto as c  join adm_contacto_grupo as cg where cg.contacto=c.id and cg.grupo = 1")
//List<adm_contacto> findByGrupo(int idgrupo);
	
//	adm_contacto_grupo findByID(contactogrupoID id);
}
