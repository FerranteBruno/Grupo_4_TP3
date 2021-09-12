package Ejercicio2;

import java.util.Iterator;
import java.util.TreeSet;

import Ejercicio1.Archivo;
import Ejercicio1.DNI;
import Ejercicio1.DNI_Invalido;
import Ejercicio1.Personas;

public class Principal {

	public static void main(String[] args) {
		
		Archivo archivin = new Archivo();
		
		archivin.setRuta("Personas.txt");
		
		if(archivin.existe()) {
			System.out.println("Existe el archivo");
		}
		else
		{
			System.out.println("No existe el archivo");
			archivin.creaArchivo();
		}
		
		//archivin.lee_lineas();
		
		
		
		TreeSet<Personas> perLst = new TreeSet<Personas>();
		
		archivin.devuelve_lineas(perLst);
		
		Iterator<Personas> it = perLst.iterator();
		while(it.hasNext()) {
			Personas per = (Personas) it.next();
			
			System.out.println(per.toString());
		}
		
	}

	
}
