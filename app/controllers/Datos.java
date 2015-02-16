package controllers;

import java.text.DateFormat;
import java.text.FieldPosition;
import java.text.ParsePosition;
import java.util.Date;
import java.util.List;

import javax.swing.text.DateFormatter;

import models.Dato;
import models.Nacionalidad;
import models.Usuario;
import play.mvc.*;

public class Datos extends Controller {
	static Nacionalidad naci= new Nacionalidad();

    public static void index() { 
    	Usuario user = Usuario.find("byEmail", Security.connected()).first();
    	if (user.datos==null) {
    		List<String>nacion= naci.getNacional();
    		render(nacion);
		}
    	else {
			editar(user.id);
		}
    	
        
    }
    public static void nuevo(String ced, String fecha, String nac, String prov, String canton, String dir, String cel, String tel ){
    	Dato dat = new Dato(ced, fecha , nac, prov, canton, dir, cel, tel);
    	dat.save();      	
    	System.out.println(fecha);
    	Usuario user = Usuario.find("byEmail", Security.connected()).first();
    	user.datos= dat;
    	user.save();  
    	redirect("/");
    }
    public static void editar(Long id) {
    	Usuario user = Usuario.find("byEmail", Security.connected()).first();
    	List<String>nacion= naci.getNacional();
    	render(user,nacion);
	}

    public static void modif(String ced, String fecha, String nac, String prov, String canton, String dir, String cel, String tel ){
    	Usuario user = Usuario.find("byEmail", Security.connected()).first();
    	Dato dat = Dato.findById(user.datos.id);
    	dat.change(ced, fecha , nac, prov, canton, dir, cel, tel);    	
    	redirect("/");
    }
}
