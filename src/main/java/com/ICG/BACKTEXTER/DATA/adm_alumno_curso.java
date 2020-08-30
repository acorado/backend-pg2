package com.ICG.BACKTEXTER.DATA;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import javax.persistence.CascadeType;
import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.ManyToMany;
//import com.ICG.BACKTEXTER.DATA.adm_telefono;
import javax.persistence.OneToMany;
import java.util.Set;
import javax.persistence.NamedQuery;
import java.io.Serializable;
//10/03/20

@Entity // This tells Hibernate to make a table out of this class
public class adm_alumno_curso implements Serializable{ 
  @EmbeddedId
  private alumnocursoID ID;
  
  private Integer estado;
 
  /*
  public Integer getContacto() {
    return contacto;
  }
  
  public void setContacto(Integer contacto) {
    this.contacto = contacto;
  }

  public Integer getGrupo() {
    return grupo;
  }
  public void setGrupo(Integer grupo) {
    this.grupo = grupo;
  }
*/
  public void setId(alumnocursoID alumnocursoID) {
	  this.ID=alumnocursoID;
  }
  public alumnocursoID getId() {
	  return ID;
  }
  public Integer getEstado() {
    return estado;
  }
  public void setEstado(Integer estado) {
    this.estado = estado;
  }

}
