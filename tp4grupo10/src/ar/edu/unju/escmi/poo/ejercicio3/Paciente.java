package ar.edu.unju.escmi.poo.ejercicio3;

public class Paciente implements Comparable<Paciente> {

	private long dni;
	private String nombre;
	private String apellido;
	private long nroHistoriaClinica;
	private String obraSocial;
	
	public Paciente() {
	}

	public long getDni() {
		return dni;
	}

	public void setDni(long dni) {
		this.dni = dni;
	}

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

	public long getNroHistoriaClinica() {
		return nroHistoriaClinica;
	}

	public void setNroHistoriaClinica(long nroHistoriaClinica) {
		this.nroHistoriaClinica = nroHistoriaClinica;
	}

	public String getObraSocial() {
		return obraSocial;
	}

	public void setObraSocial(String obraSocial) {
		this.obraSocial = obraSocial;
	}

	@Override
	public int compareTo(Paciente o) {
		// TODO Auto-generated method stub
		if(this.nroHistoriaClinica > o.getNroHistoriaClinica()) {
			return 1;
		}else if(this.nroHistoriaClinica < o.getNroHistoriaClinica()) {
			return -1;
		}else{
			return 0;
		}
	}
	
}
