package com.ICG.BACKTEXTER.DATA;
import java.util.Optional;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface adm_catedraticos_repository extends JpaRepository<adm_catedraticos, Integer> {

	Optional<adm_catedraticos> findByIkey(String id);

 // List<adm_contacto> findByGrupo(int idgrupo);

//List<adm_contacto> findByPlantilla(int id);



  //List<adm_contacto> findByPlantilla(int id);

}
