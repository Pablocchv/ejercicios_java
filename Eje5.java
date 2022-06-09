package desarrollo;

import java.util.Scanner;

public class Eje5 {

	 public static void main(String[] args) {
			Scanner leer = new Scanner (System.in);
			System.out.println("Escribe el numero: ");
			String n1 = leer.next();
			Scanner leer2 = new Scanner (System.in);
			System.out.println("Escribe el numero: ");
			String n2 = leer2.next();
	        boolean isNumeric = n1.chars().allMatch( Character::isDigit );
	        System.out.println(isNumeric);
	        isNumeric = n2.chars().allMatch( Character::isDigit );
	        System.out.println(isNumeric);
	        if (isNumeric == true && isNumeric==true) {
	        	System.out.println("Correcto ");
	        	     
	            int num = Integer.parseInt(n1);
	            int num2= Integer.parseInt(n2);
	            
	            int div= num/num2;
	            int res= num%num2;
	            System.out.println("la division de"+ num +"entre"+ num2 +"da un resultado de "+ div +"con un resto de"+ res);
	        	
	        }else {
	        	
	        	System.out.println("Los datos introducidos no son numeros");
	        }
	        	
	    }
	
	
}
