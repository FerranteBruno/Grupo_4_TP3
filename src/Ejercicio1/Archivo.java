package Ejercicio1;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.TreeSet;

public class Archivo {


	
	private String ruta;

	public boolean existe()
	{
		File archivo = new File(ruta); 
		if(archivo.exists())
		      return true;
		return false;
	}
	
	public boolean creaArchivo()
	{
		FileWriter escritura;
		try {
			escritura = new FileWriter(ruta, true);
			escritura.write("");
			escritura.close();
			return true;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return false;
			
	}
	

	public void escribe_letra_x_letra(String frase) {
		try {
			FileWriter fw = new FileWriter(ruta, true);
	
			for (int i = 0; i < frase.length(); i++) {
					fw.write(frase.charAt(i));
				}
				
			fw.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void lee_letra_x_letra() {

		FileReader entrada;
		try {
			entrada = new FileReader(ruta);
			int c = entrada.read(); 
			while (c != -1) 
			{
				char letra = (char) c;
				System.out.println(letra);
				c = entrada.read();
			}
			entrada.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
	public void escribe_lineas(String frase) {
		try 
		{	
			FileWriter entrada = new FileWriter(ruta, true);
			BufferedWriter miBuffer = new BufferedWriter(entrada);
			miBuffer.write(frase);
			miBuffer.close();
			entrada.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void lee_lineas() {
		FileReader entrada;
		try {
			entrada = new FileReader(ruta);
			BufferedReader miBuffer = new BufferedReader(entrada);
			
		   String linea = "";
			while (linea != null) {
				System.out.println(linea);
				linea = miBuffer.readLine();
			}
			miBuffer.close();
			entrada.close();

		} catch (IOException e) {
			System.out.println("No se encontro el archivo");
		}
	}
	
	public TreeSet<Personas> devuelve_lineas(TreeSet<Personas> perLst){		
		
		FileReader entrada;
		try {
			   entrada = new FileReader(ruta);
			   BufferedReader miBuffer = new BufferedReader(entrada);
				
			   String linea = "";
			   		   
			   String name ="";
			   String lastname = "";
			   String dni = "";
			   
			   boolean dniInvalid = false;
			   
			   while (linea != null) {
				   
				   	dniInvalid = false;
				   	
					linea = miBuffer.readLine();
					Personas personas = new Personas(name, lastname, dni);
					if(linea != null) {
						String parts [] = linea.split("-",3);
						
						name = parts[0];
						lastname = parts[1];
						dni = parts[2];
						
						
						try {
							DNI.verificarDniInvalido(dni);
						}
						catch(DNI_Invalido d) {
							dniInvalid = true;
							d.printStackTrace();
						}
						finally {
							if(dniInvalid == false) {
								personas.setNombre(name);
								personas.setApellido(lastname);
								personas.setDni(dni);
								perLst.add(personas);
							}
						}
					}			 
			   	}
				miBuffer.close();
				entrada.close();
		    }
		   
		   catch (IOException e) {
			System.out.println("No se encontro el archivo");
		}
		return perLst;
	}
	
	public String getRuta() {
		return ruta;
	}

	public void setRuta(String ruta) {
		this.ruta = ruta;
	}
}