package models;

import java.util.ArrayList;
import java.util.List;

public class Nacionalidad {
public static List<String> paises=new ArrayList<String>();;
	
	public Nacionalidad(){
		paises.add("Canadiense");
		paises.add("EstedoUnidense");
		paises.add("Mexicana");
		paises.add("Belicenia");
		paises.add("Costaricense");
		paises.add("Guatemalteca");
		paises.add("Hondureña");
		paises.add("Nicaraguence");
		paises.add("Panameña");
		paises.add("Salvadoreña");
		paises.add("Cubana");
		paises.add("Arubana");
		paises.add("Bahameña");
		paises.add("Barbadense");
		paises.add("Dominiquesa");
		paises.add("Dominicana");
		paises.add("Haitiana");
		paises.add("Jamaiquina");
		paises.add("Puertoriqueña");
		paises.add("Santaluciana");
		paises.add("Sanvicentina");
		paises.add("Argentina");
		paises.add("Boliviana");
		paises.add("Brasileña");
		paises.add("Chilena");
		paises.add("Colombiana");
		paises.add("Ecuatoriana");
		paises.add("Paraguaya");
		paises.add("Peruana");
		paises.add("Surinamesa");
		paises.add("Uruguaya");
		paises.add("Venezolana");
		paises.add("Española");
	}
	
	public static List<String> getNacional(){
		return paises;
	}

}
