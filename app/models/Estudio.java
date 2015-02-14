package models;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import play.db.jpa.Model;

@Entity
public class Estudio extends Model{
	
	
	public String titulo;
	public String universidad;
	public String pais;
	public String provincia;
	public String ciudad;
	@ManyToOne
	public Usuario usuario;
	
	public Estudio(String titulo, String universidad, String pais,
			String provincia, String ciudad, Usuario usuario) {
		super();
		this.titulo = titulo;
		this.universidad = universidad;
		this.pais = pais;
		this.provincia = provincia;
		this.ciudad = ciudad;
		this.usuario = usuario;
	}
	

	
	
}
