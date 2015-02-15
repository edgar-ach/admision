package models;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import play.db.jpa.Blob;
import play.db.jpa.Model;

@Entity
public class Documentacion extends Model {
	public String programaMaestria;
	public Blob reciboPago;
	public Blob curriculum;
	public Blob copiaCedula;
	public Blob copiaVotacion;
	public Blob copiaTitulo;
	public Blob registroTitulo;
	public Blob suficienciaIdiomaExtranjero;
	public Blob articulosPublicados;
	@ManyToOne
	public Usuario usuario;
	
	
	
	
    
}
