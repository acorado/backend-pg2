package com.ICG.BACKTEXTER.DATA;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import javax.persistence.CascadeType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
//import com.ICG.BACKTEXTER.DATA.adm_telefono;
import javax.persistence.OneToMany;
import java.util.Set;
import javax.persistence.NamedQuery;
import javax.persistence.NamedNativeQuery;

@Entity // This tells Hibernate to make a table out of this class


@NamedNativeQuery(name="adm_actividades.findByCurso",
query="SELECT a.id,a.nombreA,a.nombreC, a.parcial1, a.parcial2, a.parcial3, a.actividad, a.proyecto, a.examen,a.alumno, a.curso FROM adm_actividades a INNER JOIN adm_actividades_curso b WHERE b.actividad=a.id AND b.curso= ? ",
resultClass = adm_actividades.class)

@NamedNativeQuery(name="adm_actividades.findByAlumno", 
query ="SELECT*FROM adm_actividades WHERE alumno= ? ",
resultClass = adm_actividades.class)

@NamedNativeQuery(name="adm_actividades.findByNota", 
query ="SELECT*FROM adm_actividades WHERE id= ? ",
resultClass = adm_actividades.class)


public class adm_actividades {
  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
  private Integer id;
  public int parcial1;
  public int parcial2;
  public int parcial3;
  public int actividad;
  public int proyecto;
  public int examen;
  private int alumno;
  private int curso;
  private String nombreA;
  private String nombreC;
  
  


  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }


  public int getParcial1() {
    return parcial1;
  }
  public void setParcial1(int parcial1) {
    this.parcial1 = parcial1;
  }

  
  public int getParcial2() {
    return parcial2;
  }
  public void setParcial2(int parcial2) {
    this.parcial2 = parcial2;
  }

  public int getParcial3() {
    return parcial3;
  }
  public void setParcial3(int parcial3) {
    this.parcial3 = parcial3;
  }

  public int getActividad() {
    return actividad;
  }
  public void setActividad(int actividad) {
    this.actividad = actividad;
  }


  public int getProyecto() {
    return proyecto;
  }
  public void setProyecto(int proyecto) {
    this.proyecto= proyecto;
  }

  public int getExamen() {
    return examen;
  }
  public void setExamen(int examen) {
    this.examen= examen;
  }

  public int getAlumno() {
    return alumno;
  }
  public void setAlumno(int alumno) {
    this.alumno= alumno;
  }



  public int getCurso() {
    return curso;
  }
  public void setCurso(int curso) {
    this.curso= curso;
  }

  
  public String getNombreA() {
    return nombreA;
  }
  public void setNombreA(String nombreA) {
    this.nombreA= nombreA;
  }


    
  public String getNombreC() {
    return nombreC;
  }
  public void setNombreC(String nombreC) {
    this.nombreC= nombreC;
  }







}
