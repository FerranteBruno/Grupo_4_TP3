package Ejercicio1;

import java.io.IOException;

public class DNI_Invalido extends IOException  {

	public DNI_Invalido() {
	
	
	}
	
	@Override
	public String getMessage() {
		
		return "DNI invalido";
	}


	
	
}
