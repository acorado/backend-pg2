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





@NamedNativeQuery(name="adm_catedraticos.findByIkey",
query="SELECT *FROM adm_catedraticos WHERE id_key = ? ",
resultClass = adm_catedraticos.class)
/*
@NamedNativeQuery(name="adm_contacto.findByPlantilla", 
query ="SELECT c.id,c.nombre,c.Apellido,cg.estado, c.def, c.tgid FROM adm_contacto c, adm_plantilla_contacto cg WHERE c.id=cg.contacto AND  cg.plantilla= ? ",
resultClass = adm_catedraticos.class)
*/
public class adm_catedraticos {
  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
  private Integer id;
  private String nombre;
  private String apellido;
  private int estado;
  private String idKey;
  private String telefono;
  private String dpi;


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



}
