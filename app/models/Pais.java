package models;

import java.util.ArrayList;
import java.util.List;


public class Pais {
	public static List<String> paises=new ArrayList<String>();;
	
	public Pais(){
		paises.add("Ecuador");
		paises.add("Perú");
		paises.add("Colombia");
		paises.add("Chile");
		paises.add("Paraguay");
	}
	
	public static List<String> obtenerListado(){
		return paises;
	}

}
