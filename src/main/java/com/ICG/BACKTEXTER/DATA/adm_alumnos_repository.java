package com.ICG.BACKTEXTER.DATA;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface adm_alumnos_repository extends JpaRepository<adm_alumnos, Integer>{

	List<adm_alumnos> findByCurso(int id);

	List<adm_alumnos> searchByMunicipio(int id);

	Optional<adm_alumnos> findByIkey(String id);



	//List<adm_alumnos> findByCatedratico(int id);

}
