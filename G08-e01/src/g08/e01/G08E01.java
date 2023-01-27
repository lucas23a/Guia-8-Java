/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package g08.e01;

import java.util.ArrayList;
import java.util.Scanner;
import newpackage.perro.Perro;
import newpackage.persona.Persona;

/**
 *
 * @author Cristian
 */
public class G08E01 {

    /**
     * Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a
     * contar de dos clases. Perro, que tendrá como atributos: nombre, raza,
     * edad y tamaño; y la clase Persona con atributos: nombre, apellido, edad,
     * documento y Perro. Ahora deberemos en el main crear dos Personas y dos
     * Perros. Después, vamos a tener que pensar la lógica necesaria para
     * asignarle a cada Persona un Perro y por ultimo, mostrar desde la clase
     * Persona, la información del Perro y de la Persona.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Persona s1 = new Persona();
        Persona s2 = new Persona();
        ArrayList<Perro> lista = new ArrayList();
        Perro p1 = new Perro();
        Perro p2 = new Perro();
        p1.crearPerro();
        p2.crearPerro();
        lista.add(p1);
        lista.add(p2);
        s1.crearPersona();
        s2.crearPersona();

        for (Perro aux : lista) {
            System.out.println(aux);
        }

        System.out.println("Que perro le asignara a la primer persona, 1 0 2?");
        int opc = leer.nextInt();
        if (opc == 1) {
            s1.agregarPerro(p1);
            s2.agregarPerro(p2);
        } else if (opc == 2) {
            s1.agregarPerro(p2);
            s2.agregarPerro(p1);
        } else {
            System.out.println("opcion no valida");
        }
        s1.mostrarPersona();
        s2.mostrarPersona();
    }

}
