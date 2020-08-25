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
public  class  alumnocursoID implements Serializable {
    private int alumno;
    private int curso;
 
    // default constructor
    public alumnocursoID() {
    
    }
    public alumnocursoID(int alumno, int curso) {
        this.alumno = alumno;
        this.curso = curso;
    }
    public int getCurso() {
    	return curso;
    }
    public int getAlumno() {
    	return alumno;
    }
 
    // getters, equals() and hashCode() methods
}
