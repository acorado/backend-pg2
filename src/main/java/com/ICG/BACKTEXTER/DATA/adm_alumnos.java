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



@NamedNativeQuery(name="adm_alumnos.findByCurso",
query="select c.id,c.nombre,c.apellido,cg.estado,c.id_key, c.telefono, c.dpi,c.municipio, c.carrera, c.semestre FROM adm_alumnos c inner join adm_alumno_curso cg on cg.alumno=c.id WHERE cg.curso = ? ",
resultClass = adm_alumnos.class)

@NamedNativeQuery(name="adm_alumnos.searchByMunicipio", 
query ="SELECT *FROM adm_alumnos WHERE municipio =? ",
resultClass = adm_alumnos.class)



@NamedNativeQuery(name="adm_alumnos.findByIkey",
query="SELECT *FROM adm_alumnos WHERE id_key = ? ",
resultClass = adm_alumnos.class)


public class adm_alumnos {
  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
  private Integer id;
  private String nombre;
  private String apellido;
  
  private int estado;

  private String idKey;
  private String telefono;
  private String dpi;
  private int municipio;
  private String carrera;
  private int semestre;

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
  public String getApellido() {
    return apellido;
  }
  public void setApellido(String apellido) {
    this.apellido = apellido;
  }
  public int getEstado() {
    return estado;
  }
  public void setEstado(int estado) {
    this.estado = estado;
  }
  public String getIdkey() {
    return idKey;
  }
  public void setIdkey(String idKey) {
    this.idKey= idKey;
  }
  public String getTelefono() {
    return telefono;
  }
  public void setTelefono(String telefono) {
    this.telefono= telefono;
  }

  public String getDpi() {
    return dpi;
  }
  public void setDpi(String dpi) {
    this.dpi=dpi;
  }
  public String getCarrera() {
    return carrera;
  }
  public void setCarrera(String carrera) {
    this.carrera=carrera;
  }

  public int getMunicipio() {
    return municipio;
  }
  public void setMunicipio(int municipio) {
    this.municipio=municipio;
  }

  public int getSemestre() {
    return semestre;
  }
  public void setSemestre(int semestre) {
    this.semestre=semestre;
  }




}
