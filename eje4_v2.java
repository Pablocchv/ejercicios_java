package desarrollo;

import java.util.Scanner;



public class eje4_v2 {
	
public static boolean Validacion(String vali) {
		
		return vali.matches("[0-9]");
	}
	public static void main (String Args []) {
		int num,suma=0;
		Scanner t =new Scanner(System.in);
		System.out.println("Escribe hasta el numero que quieres sumar mayor de 0");
		num=t.nextInt();
		String numcad=String.valueOf(num); // Convermtimos el numero de int a un String para poder realizar esa validación
		
		
		if (!Validacion(numcad)) {
			System.out.println("Numero incorrecto");

		}else {
			 if  (num > 0) {
					for (int i=1;i<=num;i++) {
						suma=suma+i;	
					}
					System.out.println("el valor de la suma es"+suma);
				}else {
					System.out.println("El valor introducido no es numero o es menor de 0");
				}
		}

		
	}
	
}
//añadir la expresion regular de los numerosa antes de del if 