package desarrollo;

import java.util.Scanner;

public class Eje2 {
	
public static boolean Validacion(String nombre) {
		
		return nombre.matches("^[+]{0,1}[0-9]{2}-[0-9]{9}-[0-9]{2}$");
	}
	public static void main (String[]args) {
		Scanner leer = new Scanner (System.in);
		System.out.println("Escribe el telefono en el siguiente formato +34");
		String telefono = leer.next();	
			if (!Validacion(telefono)) {
				System.out.println("Incorrecto");
				System.exit(0);
			}
		String comu = telefono.substring(4,7);
		String telf= telefono.substring(4,13);
		System.out.println(comu);
		System.out.println(telf);
		int com=Integer.parseInt(comu);
		switch(com){
	    case 911:case 912:case 913:case 914:case 915:case 916:case 917:case 918:
	        System.out.println("Este numero pertenece a Madrid");
	        break;
	    case 950:case 951:case 952:case 953:case 954:case 955:case 956:case 957:case 958:case 959:
	        System.out.println("Este numero pertenece a Andalucia");
	        break;
	    case 974:case 976:case 978:
	        System.out.println("Este numero pertenece a Aragon");
	        break;
	    case 984:case 985:
	        System.out.println("Este numero pertenece a Asturias");
	        break;
	    case 942:
	        System.out.println("Este numero pertenece a Cantabria");
	        break;
	    case 925:case 926:case 949:case 967:case 969:
	        System.out.println("Este numero pertenece a Castilla-La Mancha");
	        break;
	    case 921:case 923:case 947:case 975:case 979:case 980:case 983:case 987:
	        System.out.println("Este numero pertenece a Castilla y Leon");
	        break;
	    case 931:case 937:case 972:case 973:case 977:
	        System.out.println("Este numero pertenece a Cataluña");
	        break;
	    case 924:case 927:
	        System.out.println("Este numero pertenece a Extremadura");
	        break;
	    case 981:case 982:case 986:case 988:
	        System.out.println("Este numero pertenece a Galicia");
	        break;
	    case 941:
	        System.out.println("Este numero pertenece a La Rioja");
	        break;
	    case 968:
	        System.out.println("Este numero pertenece a Murcia");
	        break;
	    case 948:
	        System.out.println("Este numero pertenece a Navarra");
	        break;
	    case 943:case 945:
	        System.out.println("Este numero pertenece a Pais Vasco");
	        break;
	    case 960:case 965:case 966:
	        System.out.println("Este numero pertenece a la Comunidad Valenciana");
	        break;
			
	}
	}
	
}
