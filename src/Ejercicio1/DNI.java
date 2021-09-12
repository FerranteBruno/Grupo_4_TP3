package Ejercicio1;

public class DNI {

	private String dni;

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public DNI(String dni) {
		super();
		this.dni = dni;
	}
	
	public static boolean verificarDniInvalido(String dni) throws DNI_Invalido{
			
			boolean auxDNI = false;
			
			for(int x=0; x<dni.length();x++) {
				
				if(contieneSoloLetras(dni) == true || dni.isEmpty() == true){
					auxDNI=true;
				};
				
			}
			
			if(auxDNI == true) {
				DNI_Invalido exc1 = new DNI_Invalido();
				throw exc1;
			}
			return false;
	}

	public static boolean contieneSoloLetras(String cadena) {
	    for (int x = 0; x < cadena.length(); x++) {
	        char c = cadena.charAt(x);
	        // Si no está entre a y z, ni entre A y Z, ni es un espacio
	        if (!((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || c == ' ')) {
	            return false;
	        }
	    }
	    return true;
	}
	
}
