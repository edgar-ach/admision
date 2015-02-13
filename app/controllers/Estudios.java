package controllers;

import java.util.List;

import models.Pais;
import play.mvc.Controller;

public class Estudios extends Controller {
	static Pais paises=new Pais();
	

	
	public static void index(){
		List<String> listaPaises=paises.obtenerListado();
		render(listaPaises);
	}

}
