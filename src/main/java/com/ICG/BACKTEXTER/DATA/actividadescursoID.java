package com.ICG.BACKTEXTER.DATA;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import javax.persistence.CascadeType;
import javax.persistence.Embeddable;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.ManyToMany;
//import com.ICG.BACKTEXTER.DATA.adm_telefono;
import javax.persistence.OneToMany;
import java.util.Set;
import javax.persistence.NamedQuery;
import java.io.Serializable;
//10/03/20
@Embeddable
public  class  actividadescursoID implements Serializable {
    private int actividad;
    private int curso;
 
    // default constructor
    public actividadescursoID() {
    
    }
    public actividadescursoID(int actividad, int curso) {
        this.actividad = actividad;
        this.curso = curso;
    }
    public int getCurso() {
    	return curso;
    }
    public int getActividad() {
    	return actividad;
    }
 
    // getters, equals() and hashCode() methods
}
