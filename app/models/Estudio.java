package models;

import javax.persistence.Entity;

import play.db.jpa.Model;

@Entity
public class Estudio extends Model{
	
	
	String titulo;
	String universidad;
	String provincia;
	String ciudad;
	public Estudio(String titulo, String universidad, String provincia,String ciudad) {
		super();
		this.titulo = titulo;
		this.universidad = universidad;
		this.provincia = provincia;
		this.ciudad = ciudad;
	}
	
	
	
}
