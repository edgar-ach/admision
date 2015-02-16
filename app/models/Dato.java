package models;

import play.*;
import play.db.jpa.*;

import javax.persistence.*;

import java.util.*;

@Entity
public class Dato extends Model {
	public String cedula;
	public String fechaNac;
	public String nacionalidad;
	public String provincia;
	public String canton;
	public String direccionDom;
	public String celular;
	public String telefono;
	public Dato(String cedula, String fechaNac, String nacionalidad,
			String provincia, String canton, String direccionDom,
			String celular, String telefono) {
		super();
		this.cedula = cedula;
		this.fechaNac = fechaNac;
		this.nacionalidad = nacionalidad;
		this.provincia = provincia;
		this.canton = canton;
		this.direccionDom = direccionDom;
		this.celular = celular;
		this.telefono = telefono;
	}
	
	public void change(String cedula, String fechaNac, String nacionalidad,
			String provincia, String canton, String direccionDom,
			String celular, String telefono){
		this.cedula = cedula;
		this.fechaNac = fechaNac;
		this.nacionalidad = nacionalidad;
		this.provincia = provincia;
		this.canton = canton;
		this.direccionDom = direccionDom;
		this.celular = celular;
		this.telefono = telefono;
		this.save();		
	}
	
    
}