package models;

import java.util.Date;

import javax.persistence.Entity;

import play.db.jpa.Model;

@Entity
public class Usuario extends Model{
	public String nombre;
	public String apellido;
	public String email;
	public String clave;
	public Usuario(String nombre, String apellido, String email, String clave) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
		this.clave = clave;
	}
	
	
}
