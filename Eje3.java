package desarrollo;

import java.util.Scanner;

public class Eje3 {

public static boolean Validacion(String vali) {
		
		return vali.matches("[A-Za-z]");
	}
	
	public static void main (String[]args) {
		Scanner leer = new Scanner (System.in);
		System.out.println("Escribe los animales en el siguiente formato *animal*animal*animal");
		String animal = leer.next();
	if (!Validacion(animal)) {
			System.out.println("invalido");
			
		}
	String animalseparado[]= animal.split("\\*");
	//Quitamos el asterisco de los animales 
	for (String separar:animalseparado) {
		System.out.println(separar);
		//Con el bucle for recorremos la cadena 
	}
	}
}
	
