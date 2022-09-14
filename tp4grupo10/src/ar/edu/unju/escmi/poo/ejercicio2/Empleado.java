package ar.edu.unju.escmi.poo.ejercicio2;

public class Empleado {
	
	private Integer dni;
	private String nombre;
	private String apellido;
	private float sueldo;
	private char categoria;
	private String key;
	
	public Empleado(Integer dni, String nombre, String apellido, float sueldo, char categoria) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.sueldo = sueldo;
		this.categoria = categoria;
	}

	public Integer getDni() {
		return dni;
	}

	public void setDni(Integer dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
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

	public float getSueldo() {
		return sueldo;
	}

	public void setSueldo(float sueldo) {
		this.sueldo = sueldo;
	}

	public char getCategoria() {
		return categoria;
	}

	public void setCategoria(char categoria) {
		this.categoria = categoria;
	}

	@Override
	public String toString() {
		return " - Empleado: Dni = " + dni + "  - Nombre = " + nombre + " - Apellido = " + apellido + " - Sueldo = " + sueldo + " - Categoria = " + categoria + " - Clave = " + key ;
	}

}
