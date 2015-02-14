package controllers;

import models.Trabajo;
import models.Usuario;
import play.mvc.Controller;
import play.mvc.With;

@With(Secure.class)
public class Trabajos extends Controller {

    public static void index() {
        render();
    }
    
    public static void guardar(String lugar,String telefono,String direccion, String email){
    	
    	Usuario usuario = Usuario.find("byEmail", Security.connected()).first();
    	Trabajo trabajo=new Trabajo(lugar, telefono, direccion, email, usuario);
    	trabajo.save();
    	redirect("/trabajos");
    }
}
