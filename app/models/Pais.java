package models;

import javax.persistence.Entity;

import play.data.validation.Required;

@Entity
public class Pais {
	public String nombre;

	public Pais(String nombre) {
		super();
		this.nombre = nombre;
	}
	
	

}
