package Ejercicio1;

public class Personas implements Comparable <Personas>{

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
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
	}
	
	@Override
	public String toString() {
		return "Personas nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + "";
	}	
	@Override
	public int compareTo(Personas arg0) {
		
		int aComparar = 0;
		
		if(arg0.getApellido().length() > this.getApellido().length()) {
			aComparar = this.getApellido().length();
		}
		else aComparar = arg0.getApellido().length();
		
		for(int i = 0 ; i < aComparar; i++) {
			
			if(arg0.getApellido().charAt(i) < this.getApellido().charAt(i)) {
				return 1;
			}
			else if(arg0.getApellido().charAt(i) > this.getApellido().charAt(i))
				return -1;
		}	
		return 0;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 0;
		result = prime * result + ((apellido == null) ? 0 : apellido.hashCode());
		result = prime * result + ((dni == null) ? 0 : dni.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Personas other = (Personas) obj;
		if (apellido == null) {
			if (other.apellido != null)
				return false;
		} else if (!apellido.equals(other.apellido))
			return false;
		if (dni == null) {
			if (other.dni != null)
				return false;
		} else if (!dni.equals(other.dni))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}
}
