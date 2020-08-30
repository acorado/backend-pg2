package com.ICG.BACKTEXTER.DATA;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface adm_actividades_repository extends JpaRepository<adm_actividades, Integer>{

	List<adm_actividades> findByCurso(int id);

	List<adm_actividades> findByAlumno(int id);

	List<adm_actividades> findByNota(int id);

//	List<adm_cursos> findByCatedratico(int id);

}
