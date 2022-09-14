package ar.edu.unju.escmi.poo.ejercicio2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Principal {

	public static void main(String args[]) {

		HashMap<String, Empleado> empleado= new HashMap<String, Empleado>(); 
		
	        int option = -1;
	        String clave,lista,eliminado;
	        Scanner scanner = new Scanner(System.in);

	        do {

	            System.out.println("Digite 1 para dar de alta un empleado");
	            System.out.println("Digite 2 para mostrar los empleados registrados");
	            System.out.println("Digite 3 para ingresar clave para eliminar empleado");
	            System.out.println("Digite 4 para terminar el programa");

	            System.out.println("Digite su opcion: ");
	            option = scanner.nextInt();

	            if (option == 1) {

	                System.out.println("Digite el dni del empleado: ");
	                Integer dni  = scanner.nextInt();
	                System.out.println("Digite el nombre del empleado: ");
	                String nombre = scanner.next();
	                System.out.println("Digite el apellido del empleado: ");
	                String apellido = scanner.next();
	                System.out.println("Digite el sueldo del empleado: ");
	                float sueldo = scanner.nextFloat();
	                System.out.println("Digite la categoria del empleado: ");
	                char categoria = scanner.next().charAt(0);
	                Empleado variante = new Empleado(dni,nombre,apellido,sueldo,categoria);

	                //Aquí se asigna a la variable clave la clave del empleado (concatenacion entre el dni y la categoria)
	                clave=dni+""+categoria;
	                variante.setKey(clave);

	                if ( empleado.containsKey(clave)) {
	        	        System.out.println("No se puede introducir el empleado. La clave esta repetido.");
	        	    } else {
	        	    	empleado.put(clave, variante); 

	        	    }
	                
	            } else if (option == 2) {
	            	
	              	Iterator<String> listado = empleado.keySet().iterator();
	                System.out.println("Hay los siguientes empleados:");
	                while(listado.hasNext()){
	                    lista = listado.next();
	                    System.out.println(empleado.toString());
	                } 
	                	
	            } else if (option == 3) {
	            	
	            	System.out.println("Digite la clave para eliminar empleado: ");
	            	eliminado = scanner.next();
	            	if (empleado.containsKey(eliminado)) {
	            	        empleado.remove(eliminado);
	            	        System.out.println("Empleado eliminado"); 
	            	    } else {
	            	        System.out.println("No hay ningun empleado con esa clave.");  
	            	    }      
	            	
	            } else if (option == 4)
	                break;
	            else
	                System.out.println("Entrada incorrecta");

	            System.out.println("\n\n");
	        }while(1==1);

	        scanner.close();
	}
	
}
