package desarrollo;

import java.util.Scanner;


public class Eje6 {

	public static void main (String[] args) {
		
		int mascarilla=112;
		int gel=250;
		
		Scanner leer = new Scanner (System.in);
		System.out.println("Escribe el numero de mascarillas vendidas ");
		String cantidm = leer.next();
		Scanner leer2 = new Scanner (System.in);
		System.out.println("Escribe el numero de geles vendidos: ");
		String cantidg = leer2.next();
		boolean isNumeric = cantidm.chars().allMatch( Character::isDigit );
		if (isNumeric == true) {
			System.out.println("la cantidad de mascarillas es correcta ");
            int mas = Integer.parseInt(cantidm);
			boolean  isNumerico = cantidg.chars().allMatch( Character::isDigit );
			if (isNumeric == true) {
				System.out.println("la cantidad de geles es correcta ");
				int geles= Integer.parseInt(cantidg);
				int pesom= mascarilla*mas;
				int pesog=gel*geles;
				int tamto=pesom+pesog;
				
				 System.out.println("el peso de mascarrilas es de"+ pesom +"el de geles"+ pesog +"y el peso total es de"+ tamto);
						
			}
			else {
				System.out.println("Datos introducidos incorrectos ");
			}		
		}else {
			System.out.println("Datos introducidos incorrectos ");
		}
		
		
	}
	
	
	//pedir por teclado cuantos geles y mascarillas se necesitan y despues multiplcar por el peso, validar que son numeros, con
	
}
