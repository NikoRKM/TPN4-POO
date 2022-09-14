package ar.edu.unju.escmi.poo.ejercicio1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        List<Jugador> players = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int option;

        do{

            System.out.println("\n1- Alta de jugador");
            System.out.println("2- Mostrar los datos del jugador (debe ingresar nombre y apellido)");
            System.out.println("3- Mostrar todos los jugadores ordenados por apellido");
            System.out.println("4- Modificar los datos de un jugador (debe ingresar el nombre y apellido)");
            System.out.println("5- Eliminar un jugador (debe ingresar nombre y apellido)");
            System.out.println("6- Mostrar la cantidad total de jugadores que tiene la collection");
            System.out.println("7- Mostrar la cantidad de jugadores que pertenecen a una nacionalidad (debe ingresar la nacionalidad)");
            System.out.println("8- Salir\n");

            System.out.println("Ingrese su opcion: ");
            option = scanner.nextInt();

            if(option == 1){
                
            scanner.nextLine();

            System.out.println("\nIngrese el nombre del jugador: ");
            String name = scanner.next();
            name = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();

            System.out.println("\nIngrese el apellido del jugador: ");
            String surname = scanner.next();
            surname = surname.substring(0, 1).toUpperCase() + surname.substring(1).toLowerCase();    

            System.out.println("\nIngrese la nacionalidad del jugador: ");
            String nationality = scanner.next();
            nationality = nationality.substring(0, 1).toUpperCase() + nationality.substring(1).toLowerCase();

            System.out.println("\nIngrese el peso del jugador: ");
            float weight = scanner.nextFloat();

            System.out.println("\nIngrese la altura del jugador: ");
            float height = scanner.nextFloat();

            System.out.println("\nIngrese la posicion del jugador: ");
            String position = scanner.next();
            position = position.substring(0, 1).toUpperCase() + position.substring(1).toLowerCase();

            System.out.println("\nIngrese la fecha de nacimiento del jugador usando el siguiente formato (YYYY-mm-dd): ");
            String dateOfBirthday = scanner.next();
            LocalDate parsedDate = LocalDate.parse(dateOfBirthday);

            Jugador player = new Jugador(name, surname, parsedDate, nationality, weight, height, position);
            players.add(player);

            }else if(option == 2){

            scanner.nextLine();
            
            System.out.println("\nIngrese el nombre y apellido del jugador: ");
            String name = scanner.next();
            String surname = scanner.next();

            if(players.stream().anyMatch(p -> p.getName().equals(name) && p.getSurname().equals(surname)) == true){
            players.stream().filter(p -> p.getName().equals(name) && p.getSurname().equals(surname)).forEach(player -> {

                System.out.println("\nNombre: " + player.getName() + " , Apellido: " + player.getSurname() + " , Nacionalidad: " + player.getNationality());
                System.out.println("Peso: " + player.getWeight() + " , Altura: " + player.getHeight() + " , Posicion: " + player.getPosition() + " , Fecha de nacimiento: " + player.getDateOfBirthday());
            });

            }else System.out.println("\nNo existe ningun jugador registrado con ese nombre y apellido (recuerde usar el formato Nombre Apellido)\n");

            }else if(option == 3){

            Collections.sort(players);

            players.stream().forEach(player -> {

                System.out.println("\nNombre: " + player.getName() + " , Apellido: " + player.getSurname() + " , Nacionalidad: " + player.getNationality());
                System.out.println("Peso: " + player.getWeight() + " , Altura: " + player.getHeight() + " , Posicion: " + player.getPosition() + " , Fecha de nacimiento: " + player.getDateOfBirthday());
            });
                
            }else if(option == 4){

            scanner.nextLine();
            
            System.out.println("\nIngrese el nombre y apellido del jugador que desea modificar: ");
            String name = scanner.next();
            String surname = scanner.next();

            if(players.stream().anyMatch(p -> p.getName().equals(name) && p.getSurname().equals(surname)) == true){
            players.stream().filter(p -> p.getName().equals(name) && p.getSurname().equals(surname)).forEach(player -> {

                do{

                    System.out.println("\n1. Nombre");
                    System.out.println("2. Apellido");
                    System.out.println("3. Nacionalidad");
                    System.out.println("4. Peso");
                    System.out.println("5. Altura");
                    System.out.println("6. Posicion");
                    System.out.println("7. Fecha de Nacimiento");
                    System.out.println("8. Salir");
                    System.out.println("\nIngrese el dato que desea modificar: ");
                    int op = scanner.nextInt(); 
                    
                    if(op == 1){
                        
                        scanner.nextLine();

                        System.out.println("\nIngrese el nuevo nombre del jugador: ");
                        String newName = scanner.next();
                        newName = newName.substring(0, 1).toUpperCase() + newName.substring(1).toLowerCase();
                        
                        player.setName(newName);

                    }else if(op == 2){

                        scanner.nextLine();

                        System.out.println("Ingrese el nuevo apellido del jugador: ");
                        String newSurname = scanner.next();
                        newSurname = newSurname.substring(0, 1).toUpperCase() + newSurname.substring(1).toLowerCase();

                        player.setSurname(newSurname);

                    }else if(op == 3){

                        scanner.nextLine();
                        
                        System.out.println("Ingrese la nueva nacionalidad del jugador: ");
                        String newNationality = scanner.next();
                        newNationality = newNationality.substring(0, 1).toUpperCase() + newNationality.substring(1).toLowerCase();

                        player.setNationality(newNationality);

                    }else if(op == 4){

                        scanner.nextLine();

                        System.out.println("Ingrese el nuevo peso del jugador: ");
                        float newWeight = scanner.nextFloat();

                        player.setWeight(newWeight);

                    }else if(op == 5){

                        scanner.nextLine();

                        System.out.println("Ingrese la nueva altura del jugador: ");
                        float newHeight = scanner.nextFloat();

                        player.setHeight(newHeight);

                    }else if(op == 6){

                        scanner.nextLine();

                        System.out.println("Ingrese la nueva posicion del jugador: ");
                        String newPosition = scanner.next();
                        newPosition = newPosition.substring(0, 1).toUpperCase() + newPosition.substring(1).toLowerCase();

                        player.setPosition(newPosition);

                    }else if(op == 7){

                        scanner.nextLine();

                        System.out.println("Ingrese la nueva fecha de nacimiento del jugador usando el siguiente formato (YYYY-mm-dd): ");
                        String newDateOfBirthday = scanner.next();
                        LocalDate newParsedDate = LocalDate.parse(newDateOfBirthday);
                    
                        player.setDateOfBirthday(newParsedDate);

                    }else if(op == 8){

                        System.out.println("\nHa salido correctamente del menu");
                        break;

                    }else System.out.println("\nOpcion invalida");

                }while(1 == 1);

                });
            }else System.out.println("\nNo existe ningun jugador registrado con ese nombre y apellido (recuerde usar el formato Nombre Apellido)\n");

            }else if(option == 5){

            scanner.nextLine();
            
            System.out.println("\nIngrese el nombre y apellido del jugador que desea eliminar: ");
            String name = scanner.next();
            String surname = scanner.next();
    
            if(players.removeIf(p -> p.getName().equals(name) && p.getSurname().equals(surname)) == true) System.out.println("\nJugador eliminado correctamente\n");
            else System.out.println("\nNo existe ningun jugador registrado con ese nombre y apellido (recuerde usar el formato Nombre Apellido)\n");
            
            }else if(option == 6){

            System.out.println("El tamanio de la collection es: " + players.size());

            }else if(option == 7){

            scanner.nextLine();
            
            System.out.println("\nIngrese la nacionalidad: ");
            String nationality = scanner.next();
    
            players.stream().filter(p -> p.getNationality().equals(nationality)).forEach(player -> {
    
                long size = players.stream().count();

                if(size == 0) System.out.println("No hay ningun jugador en la collection que pertenezca a esa nacionalidad (recuerde usar el formato Nacionalidad)\n"); 
                else System.out.println("La cantidad de jugadores que tienen de nacionalidad " + nationality + " son: " + size);
            });

            }else if(option == 8){

                System.out.println("\nHa salido correctamente del programa");
                break;

            }else System.out.println("\nOpcion invalida");

        }while(1 == 1);

        scanner.close();
    }
}