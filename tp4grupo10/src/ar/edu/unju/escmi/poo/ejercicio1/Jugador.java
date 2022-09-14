package ar.edu.unju.escmi.poo.ejercicio1;

import java.time.LocalDate;
import java.time.Period;

public class Jugador implements Comparable<Jugador>{

    private String name;
    private String surname;
    private LocalDate dateOfBirthday;
    private String nationality;
    private float weight; 
    private float height;
    private String position;


    public Jugador() {
    }

    public Jugador(String name, String surname, LocalDate dateOfBirthday, String nationality, float weight, 
    float height, String position) {

        this.name = name;
        this.surname = surname;
        this.dateOfBirthday = dateOfBirthday;
        this.nationality = nationality;
        this.weight = weight;
        this.height = height;
        this.position = position;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public LocalDate getDateOfBirthday() {
        return dateOfBirthday;
    }

    public void setDateOfBirthday(LocalDate dateOfBirthday) {
        this.dateOfBirthday = dateOfBirthday;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getAge(){

        return Period.between(dateOfBirthday, LocalDate.now()).getYears();
    }

    @Override
    public int compareTo(Jugador p) {
        
        return surname.compareTo(p.getSurname());
    }    
}
