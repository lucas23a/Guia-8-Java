/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpackage.persona;

import java.util.Scanner;
import newpackage.perro.Perro;

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

    public Persona(String nombre, String apellido, int edad, long dni, Perro dog) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.dni = dni;
        this.dog = dog;
    }

    public void crearPersona() {
        System.out.println("");
        System.out.println("---Persona---");
        System.out.println("Ingrese nombre");
        nombre = leer.next();
        System.out.println("Ingrese apellido");
        apellido = leer.next();
        System.out.println("Edad");
        edad = leer.nextInt();
        System.out.println("Dni");
        dni = leer.nextLong();
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
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", dni=" + dni + ", dog=" + dog + '}';
    }

}
