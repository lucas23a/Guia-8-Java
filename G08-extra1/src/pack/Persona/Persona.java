/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pack.Persona;

import java.util.Scanner;
import pack.perro.Perro;

/**
 *
 * @author Cristian
 */
public class Persona {
    Scanner leer = new Scanner(System.in);
    private String nombre;
    private String apellido;
    private int edad;
    private long dni;
    private Perro dog;

    public Persona() {
    }

    public Scanner getLeer() {
        return leer;
    }

    public void setLeer(Scanner leer) {
        this.leer = leer;
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public Perro getDog() {
        return dog;
    }

    public void setDog(Perro dog) {
        this.dog = dog;
    }

    public Persona(String nombre, String apellido, int edad, long dni, Perro dog) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.dni = dni;
        this.dog = dog;
    }

    public void agregarPerro(Perro dog) {
        this.dog = dog;
    }

    public void mostrarPersona() {
        System.out.println("--- Datos de persona---");
        System.out.println("Nombre " + nombre + "Apellido " + apellido);
        System.out.println("Edad " + edad + "DNI " + dni);
        System.out.println(dog);
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", dni=" + dni + ", Perro=" + dog + '}';
    }
}
