package desarrollo;

import java.util.Scanner;

public class Eje4 {

	public static boolean valdnum(String num) {
		return num.matches("^[0-9]$");
		
		
	}
	public static void main (String [] args) {
		System.out.println("Escribe hasta el numero que quieres sumar");
		Scanner leer = new Scanner (System.in);
		String numero= leer.next();
		System.out.println(numero);
		int suma=0;// Creamos la varialbe suma para poder ir sumando los numeros 
		
	if (!valdnum(numero)) {
		System.out.println("Incorrecto");
		
	}
		
		//for (int i=0 ;i=numero;i++) { //Bucle para ir sumando los numeros 
			suma=i+suma;
			
		}
		
		System.out.println(suma);
		
	}
	
	
}
