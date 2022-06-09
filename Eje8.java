package desarrollo;

import java.util.Scanner;

public class Eje8 {

	
public static boolean Validacion(String nombre) {
		
		return nombre.matches("^[a-zA-Z!]+$");	
	}
	
	public static void main (String [] args){
		Scanner s= new Scanner (System.in); 
		System.out.println("EScribe palabras");
		String palabra=s.nextLine();
	
	while (palabra.matches("^[a-zA-Z!]+$"))	{
		
		while (!palabra.matches("BASTA!")) {
			System.out.println(palabra);
			Scanner se= new Scanner (System.in);
			System.out.println(palabra);
			String palabras=se.nextLine();
			 palabra=palabras;
		
		}
		
	}
		
		
	}

}
