package controllers;

import java.util.List;

import models.Documentacion;
import models.Estudio;
import models.Trabajo;
import models.Usuario;
import play.mvc.Controller;
import play.mvc.With;


@With(Secure.class)
public class Application extends Controller {
	

    public static void index() {

    	
        render();
    }
    
    public static void listado(){
    	List<Usuario> usuarios=Usuario.findAll();
    	render(usuarios);
    }
    
    public static void datos(Long id){
    	Usuario usuario=Usuario.findById(id);
    	Estudio estudios = Estudio.find("byUsuario_id", id).first();
    	Trabajo trabajo = Trabajo.find("byUsuario_id", id).first();
    	Documentacion documentos=Documentacion.find("byUsuario_id", id).first();
    	render(usuario,estudios,trabajo,documentos);
    }

}