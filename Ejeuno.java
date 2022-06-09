package desarrollo;

import java.util.Scanner;//Para poder pedir elementos por teclado
import java.util.*;

public class Ejeuno {
	
	public static boolean Validacion(String nombre) {
		
		return nombre.matches("^[a-zA-Z]+$");	
	}
	
	public static void main (String[] args){

		Scanner leer = new Scanner (System.in);
		System.out.println("Ingrese su nombre: ");
		String nombre = leer.next();
		if (!Validacion(nombre)) {
			System.out.println("Incorrecto");
			System.exit(0);
		}System.out.println("Escribe tu apellido");
		String apellido1 = leer.next();
		if (!Validacion(apellido1)) {
			System.out.println("Incorrecto");
			System.exit(0);
			
		}
		System.out.println("Escribe tu otro apellido");
		String apellido2 = leer.next();	
		if (!Validacion(apellido2)) {
			System.out.println("Incorrecto");
			System.exit(0);
		}	
		
		String nombrecomp=nombre+ " "+apellido1+" "+apellido2;/*
		 * Juntamos el nombre y apellido en una sola variable las comillas son para crear un espacio
		 */
		System.out.println(nombrecomp);
		System.out.println(nombrecomp.toUpperCase());//Imprimimos el nombre en mayusculas
		System.out.println(nombrecomp.toLowerCase());//Imprimimos el nombre en minusculas
		String name  = "stackoverflow"; 
		name = name.substring(0,1).toUpperCase() + name.substring(1).toLowerCase();
		
		}
	

}

