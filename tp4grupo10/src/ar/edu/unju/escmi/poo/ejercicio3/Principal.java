package ar.edu.unju.escmi.poo.ejercicio3;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Principal {
	
	public static void main(String[] args) {
		
		Set<Paciente> conjuntoPacientes = new TreeSet<Paciente>();
		int opcion=0;
		
		Scanner scanner = new Scanner(System.in);
		
		do {
			System.out.println("*****************************");
			System.out.println("1) Dar de alta un paciente");
			System.out.println("2) Mostrar todos los pacientes");
			System.out.println("3) Mostrar pacientes por N° de Historia Clinica");
			System.out.println("4) Salir");
			System.out.println("\nElija una opcion: ");
			opcion = scanner.nextInt();
			System.out.println("\n");
			
			switch (opcion) {
			case 1:
				Paciente paciente = new Paciente();
				long dni;
				String nombre, apellido, obraSocial;
				long nroHistoriaClinica;
				
				System.out.println("Ingrese DNI del paciente: ");
				dni = scanner.nextLong();
				System.out.println("Ingrese nombre del paciente: ");
				nombre = scanner.next();
				System.out.println("Ingrese apellido del paciente: ");
				apellido = scanner.next();
				System.out.println("Ingrese el N° de historia clinica del paciente: ");
				nroHistoriaClinica = scanner.nextLong();
				System.out.println("Ingrese obra social del paciente: ");
				obraSocial = scanner.next();
				
				paciente.setDni(dni);
				paciente.setNombre(nombre);
				paciente.setApellido(apellido);
				paciente.setNroHistoriaClinica(nroHistoriaClinica);
				paciente.setObraSocial(obraSocial);
				
				conjuntoPacientes.add(paciente);
				
				System.out.println("\n");
				break;
			case 2:
				System.out.println("PACIENTES: ");
				
				conjuntoPacientes.stream().forEach( p -> {
					System.out.println("N° de Historia Clinica: " + p.getNroHistoriaClinica() + " Obra Social: " + p.getObraSocial()
					+ "\n" + p.getApellido() + ", " + p.getNombre() + " DNI: " + p.getDni() + "\n");
				});
				
				System.out.println("\n");
				break;
			case 3:
				int filtro;
				System.out.println("Ingrese un N° de historia clinica: ");
				filtro = scanner.nextInt();
				System.out.println("PACIENTES CON N° DE HISTORIA CLINICA MAYOR A " + filtro + ":\n");
				
				conjuntoPacientes.stream().filter( p -> p.getNroHistoriaClinica() > filtro).forEach( p -> {
					System.out.println("N° de Historia Clinica: " + p.getNroHistoriaClinica() + " Obra Social: " + p.getObraSocial()
					+ "\n" + p.getApellido() + ", " + p.getNombre() + " DNI: " + p.getDni() + "\n");
				});
				
				System.out.println("\n");
				break;
			case 4:
				System.out.println("Saliendo......");
				
				System.out.println("\n");
				break;
			default:
				System.out.println("Error al elegir una opcion");
				System.out.println("\n");
			}

		} while(opcion != 4);
	
		scanner.close();
	}

}
