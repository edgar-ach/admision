package controllers;

import java.util.List;

import models.Pais;
import play.mvc.Controller;
import play.mvc.With;


@With(Secure.class)
public class Application extends Controller {
	

	

    public static void index() {
    	Pais paises=new Pais();
    	List<String> listaPaises=paises.obtenerListado();
    	
        render(listaPaises);
    }

}