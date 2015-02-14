package controllers;

import java.util.List;

import models.Estudio;
import models.Pais;
import models.Usuario;
import play.mvc.Controller;
import play.mvc.With;

@With(Secure.class)
public class Estudios extends Controller {
	static Pais paises=new Pais();
	

	
	public static void index(){
		List<String> listaPaises=paises.obtenerListado();
		
		render(listaPaises);
	}
	
	public static void guardar(String titulo, String universidad, String pais, String provincia, String ciudad){
		Usuario usuario = Usuario.find("byEmail", Security.connected()).first();
		Estudio estudio=new Estudio(titulo, universidad, pais, provincia, ciudad, usuario);
		estudio.save();
		redirect("/estudios");
	}

}
