package controllers;

import java.awt.image.renderable.RenderableImageProducer;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import com.sun.org.apache.bcel.internal.generic.Type;

import models.Documentacion;
import models.Usuario;
import play.db.jpa.Blob;
import play.libs.MimeTypes;
import play.mvc.Controller;
import play.mvc.With;

@With(Secure.class)
public class Documentos extends Controller {

    public static void index() {
        render();
    }
    
    /*
    public static void nuevo(File archivo) throws FileNotFoundException {
		Archivo archi = new Archivo();
		archi.nombre = archivo.getName();
		archi.file = new Blob();
		archi.file.set(new FileInputStream(archivo),MimeTypes.getContentType(archivo.getName()));
		archi.save();
		index();

	}
    */
    public static void guardar(String maestria,File recibo,File curriculum,File cedula,File votacion,
    		File titulo,File registro,File suficiencia,File articulos) throws FileNotFoundException {
    	Usuario usuario = Usuario.find("byEmail", Security.connected()).first();
    	Documentacion documentos=new Documentacion();
    	System.out.println(recibo);
    	
    	documentos.programaMaestria=maestria;
    	
    	documentos.reciboPago=new Blob();
    	documentos.reciboPago.set(new FileInputStream(recibo), MimeTypes.getContentType(recibo.getName()));
    	
    	documentos.curriculum=new Blob();
    	documentos.curriculum.set(new FileInputStream(curriculum), MimeTypes.getContentType(curriculum.getName()));
    	
    	documentos.copiaCedula=new Blob();
    	documentos.copiaCedula.set(new FileInputStream(cedula), MimeTypes.getContentType(cedula.getName()));
    	
    	documentos.copiaVotacion=new Blob();
    	documentos.copiaVotacion.set(new FileInputStream(votacion), MimeTypes.getContentType(votacion.getName()));
    	
    	documentos.copiaTitulo=new Blob();
    	documentos.copiaTitulo.set(new FileInputStream(titulo), MimeTypes.getContentType(titulo.getName()));
    	
    	documentos.registroTitulo=new Blob();
    	documentos.registroTitulo.set(new FileInputStream(registro), MimeTypes.getContentType(registro.getName()));
    	
    	documentos.suficienciaIdiomaExtranjero=new Blob();
    	documentos.suficienciaIdiomaExtranjero.set(new FileInputStream(suficiencia), MimeTypes.getContentType(suficiencia.getName()));
    	

    	documentos.articulosPublicados=new Blob();
    	documentos.articulosPublicados.set(new FileInputStream(articulos), MimeTypes.getContentType(articulos.getName()));
    	
    	documentos.usuario=usuario;
    	
    	documentos.save();
    	
    	redirect("/documentacion");
    }
    
    public static void verRecibo(Long id){
    	final Documentacion documentos=Documentacion.findById(id);
    	notFoundIfNull(documentos);
    	response.setContentTypeIfNotSet(documentos.reciboPago.type());
    	renderBinary(documentos.reciboPago.get());
    	
    }
    public static void verRegistro(Long id){
    	final Documentacion documentos=Documentacion.findById(id);
    	notFoundIfNull(documentos);
    	response.setContentTypeIfNotSet(documentos.registroTitulo.type());
    	renderBinary(documentos.registroTitulo.get());
    	
    }
    public static void visualizar(){
    	
    	/*final Documentacion documentos=Documentacion.findById(15L);
    	notFoundIfNull(documentos);
    	response.setContentTypeIfNotSet(documentos.reciboPago.type());
    	InputStream imagen = documentos.reciboPago.get();
    	renderBinary(imagen);*/
    	
    	render();
    	
    	
    	
    }

}
