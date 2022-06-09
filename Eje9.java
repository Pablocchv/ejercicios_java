package desarrollo;
import java.util.Scanner;
public class Eje9 {

	public int contarletras (String frase) {
		char letras []= {'a','b','c','d','e','f','g','h','i','j','k','l','m','ñ','o','p','r','s','t','u','v','w','x','y','z'};
		int numeroletras=0;
		
		String frasemin=frase.toLowerCase();
		
		for (int i = 0 ; i < frasemin.length(); i++) {
			
			char letra=frasemin.charAt(i);
			for (int j=0; j < letras.length;j++) {
				if (letra==letras[j]) {
					numeroletras++;
					break;
				}
			}
			/*
			if (letra!= ' ' ) {
				numeroletras++; //Por cada caracter que sea distinto de un espacio en
			
			}
			*/
		}
		return numeroletras;
				
		
	}
	
	
	public static void main (String[]args) {
		
		Scanner leer=new Scanner(System.in);
		String frase;
		System.out.println("Escribe una frase");
		frase=leer.nextLine(); //usamos el next para que lea toda la frase y no se quede con el espacio en blanco 
		Eje9 contador=new Eje9 ();
		System.out.println(contador.contarletras(frase));
		
		
		
	}
}
