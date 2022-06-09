package desarrollo;

import java.util.Scanner;

public class Eje7 {

	public static void main (String [] args) {
		double  malp=0.0;
		double  acep=0.4;
		double rese=0.6;
		double val=1.5;
		
		Scanner s= new Scanner (System.in); 
		System.out.println("EScribe la puntuación del producto");
		String punt=s.nextLine();
		
		while (!punt.matches("\\d{1,}\\.\\d")){ //la expresion regular lo que dice es que tenga un numero con un punto y despues del punto un solo digito
			double puntuacion = Double.parseDouble(punt);//Convertimos el valor a double para poder operar con 
			if (puntuacion==0) {
				   double notfin = puntuacion*val;
				   System.out.println("La nota del  producto es "+notfin+" y un nivel de mal producto");
		            System.exit(0);
			}else if (puntuacion==0.4) {
				 double notfin = puntuacion*val;
				   System.out.println("La nota del  producto es "+notfin+" y un nivel es aceptable");
		            System.exit(0);
			}else if (puntuacion==0.6) {
				 double notfin = puntuacion*val;
				   System.out.println("La nota del  producto es "+notfin+" y un nivel es aceptable");
		            System.exit(0);
				
			}
			
			System.out.println("EScribe una puntuacion dentro de los valores");
		
		}
		
		
	}
	
	
}
