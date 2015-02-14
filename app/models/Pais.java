package models;

import java.util.ArrayList;
import java.util.List;


public class Pais {
	public static List<String> paises=new ArrayList<String>();;
	
	public Pais(){
		paises.add("Argentina");
		paises.add("Bolivia");
		paises.add("Chile");
		paises.add("Colombia");
		paises.add("Costa Rica");
		paises.add("Cuba");
		paises.add("Ecuador");
		paises.add("El Salvador");
		paises.add("España");
		paises.add("Guatemala");
		paises.add("Honduras");
		paises.add("México");
		paises.add("Nicaragua");
		paises.add("Panamá");
		paises.add("Paraguay");
		paises.add("Perú");
		paises.add("Puerto Rico");
		paises.add("República Dominicana");
		paises.add("Uruguay");
		paises.add("Venezuela");

	}
	
	public static List<String> obtenerListado(){
		return paises;
	}

}
