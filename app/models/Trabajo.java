package models;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import play.db.jpa.Model;

@Entity
public class Trabajo extends Model {
	public String lugar;
	public String telefono;
	public String direccion;
	public String email;
	@ManyToOne
	public Usuario usuario;
	
	public Trabajo(String lugar, String telefono, String direccion,
			String email, Usuario usuario) {
		super();
		this.lugar = lugar;
		this.telefono = telefono;
		this.direccion = direccion;
		this.email = email;
		this.usuario = usuario;
	}
    
}
