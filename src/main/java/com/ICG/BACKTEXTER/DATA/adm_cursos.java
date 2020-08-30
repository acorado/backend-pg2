package com.ICG.BACKTEXTER.DATA;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.FetchType;

import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.NamedNativeQuery;

import java.util.Set;

@Entity // This tells Hibernate to make a table out of this class


@NamedNativeQuery(name="adm_cursos.findByCatedratico",
query="SELECT c.id,c.nombre, c.prerequisito FROM adm_cursos c INNER JOIN adm_catedratico_curso cg ON cg.curso=c.id WHERE cg.catedratico = ? ",
resultClass = adm_cursos.class)



@NamedNativeQuery(name="adm_cursos.findByAlumno",
query="SELECT c.id,c.nombre,c.prerequisito FROM adm_cursos c INNER JOIN adm_alumno_curso cg ON cg.curso=c.id WHERE cg.alumno = ? ",
resultClass = adm_cursos.class)


public class adm_cursos {
  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
  private Integer id;

  private String nombre;

  private int prerequisito;

  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }

  public String getNombre() {
    return nombre;
  }
  public void setNombre(String nombre) {
    this.nombre = nombre;
  }


  
  public int getPrerequisito() {
    return prerequisito;
  }
  public void setPrerequisito(int prerequisito) {
    this.prerequisito= prerequisito;
  }



}
