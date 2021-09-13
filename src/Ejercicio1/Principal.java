package Ejercicio1;

import javax.swing.JOptionPane;


public class Principal {

	///comienza el programa
	public static void main(String[] args) throws DNI_Invalido{
		
	String dni;
		
    dni = JOptionPane.showInputDialog("Ingrese el dni");
    
    DNI.verificarDniInvalido(dni);
    
    
    System.out.println("Program OK");

	}

}
