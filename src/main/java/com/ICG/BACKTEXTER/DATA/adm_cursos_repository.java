package com.ICG.BACKTEXTER.DATA;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface adm_cursos_repository extends JpaRepository<adm_cursos, Integer>{

	List<adm_cursos> findByCatedratico(int id);

	List<adm_cursos> findByAlumno(int id);

}
