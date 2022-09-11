package ar.edu.unju.escmi.poo.ejercicio4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        List<Producto> products = new ArrayList<>();
        int option = -1;
        Scanner scanner = new Scanner(System.in);

        do {

            System.out.println("Digite 1 para dar de alta un producto");
            System.out.println("Digite 2 para mostrar los productos registrados");
            System.out.println("Digite 3 para incrementar el precio de los productos");
            System.out.println("Digite 4 para ordenar los productos por código de producto");
            System.out.println("Digite 5 para terminar el programa");

            System.out.println("Digite su opcion: ");
            option = scanner.nextInt();

            if (option == 1) {

                System.out.println("Digite el codigo(numerico) del producto: ");
                Integer code = scanner.nextInt();
                System.out.println("Digite la descripcion del producto: ");
                String description = scanner.next();
                System.out.println("Digite el precio del producto: ");
                double price = scanner.nextDouble();
                System.out.println("Digite la marca del producto: ");
                String brand = scanner.next();
                Producto product = new Producto(code, description, price, brand);

                products.add(product);

            } else if (option == 2) {
                products.stream().forEach(product -> {
                    System.out.println("Codigo: " + product.getCode() + " , Marca : " + product.getBrand());
                    System.out
                            .println("Descripcion: " + product.getDescription() + " , Precio : " + product.getPrice());

                });
            } else if (option == 3) {
                products.stream().map(product -> {
                    product.setPrice(product.getPrice() + 120);
                    return product;
                }).forEach(product -> System.out.println("Nuevo precio: " + product.getPrice()));
            } else if (option == 4) {
                // * (Mayor a menor)
                products.stream().sorted((x, y) -> y.compareTo(x)).forEach(product -> {
                    System.out.println("Codigo: " + product.getCode() + " , Marca : " + product.getBrand());
                });

            } else if (option == 5)
                break;
            else
                System.out.println("Entrada incorrecta");

            System.out.println("\n\n");
        } while (1 == 1);

        scanner.close();
    }
}
