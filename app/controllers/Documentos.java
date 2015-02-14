package controllers;

import play.mvc.Controller;
import play.mvc.With;

@With(Secure.class)
public class Documentos extends Controller {

    public static void index() {
        render();
    }
    
    public static void guardar(){
    	index();
    }

}
