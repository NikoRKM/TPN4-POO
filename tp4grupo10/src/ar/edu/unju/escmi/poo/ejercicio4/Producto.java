package ar.edu.unju.escmi.poo.ejercicio4;

public class Producto implements Comparable<Producto> {
    private Integer code;
    private String description;
    private double price;
    private String brand;

    public Producto() {
    }

    public Producto(Integer code, String description, double price, String brand) {
        this.code = code;
        this.description = description;
        this.price = price;
        this.brand = brand;
    }

    public Integer getCode() {
        return this.code;
    }

    public String getDescription() {
        return this.description;
    }

    public double getPrice() {
        return this.price;
    }

    public String getBrand() {
        return this.brand;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public int compareTo(Producto object) {
        if (this.code > object.getCode())
            return 1;
        else if (this.code < object.getCode())
            return -1;
        return 0;
    }

}
