package Ejercicio1;

public class Personas {

	private String nombre;
	private String apellido;
	private String dni;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public Personas(String nombre, String apellido,String dni) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
	}
	
	@Override
	public String toString() {
		return "Personas nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + "";
	}
	
	
	
}
