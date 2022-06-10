package desarrollo;

import java.util.Scanner;

public class Eje11 {
	
	
    public static boolean valfac(String cadena) {
        return cadena.matches("^[0-9.]+$");
        }
    
    public static boolean valiva(String cadena) {
        return cadena.matches("^[0-9]+$");
        }

    
    public static void main(String[] args) {
        Scanner entrada = new Scanner( System.in);
        
        System.out.println("Dime el total de la fact");
        String fact = entrada.next();
        
        
        if(!valfac(fact)){
            System.out.println("Has introducido caracteres no validos");
            System.exit(0);
        }
        
        double fact1 = Double.parseDouble(fact);
        
        System.out.println("Dime el porcentaje de IVA");
        String iva = entrada.next();
      
        /*
        if (!(iva=null) ) {
        	
        }
        */
        if(!valiva(iva)){
            System.out.println("Has introducido caracteres no validos");
            System.exit(0);
        }
        
        double iva1 = Double.parseDouble(iva);
        
        double porcen = fact1/100;
        
        double totiva = iva1 * porcen;
        
        double total = fact1 + totiva;
        
        System.out.println("El total de la factura es: "+total+" y lo que representa el iva sobre el total es: "+totiva);
    }
    
    
}
