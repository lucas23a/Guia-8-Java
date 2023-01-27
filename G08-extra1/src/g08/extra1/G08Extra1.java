/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package g08.extra1;

import Servicio.Service;

/**
 *
 * @author Cristian
 */
public class G08Extra1 {

    /**Ahora se debe realizar unas mejoras al ejercicio de Perro y Persona. Nuestro programa va a
tener que contar con muchas personas y muchos perros. El programa deberá preguntarle a
cada persona, que perro según su nombre, quiere adoptar. Dos personas no pueden adoptar
al mismo perro, si la persona eligió un perro que ya estaba adoptado, se le debe informar a la
persona.
Una vez que la Persona elige el Perro se le asigna, al final deberemos mostrar todas las
personas con sus respectivos perros.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Service usuario = new Service();
        usuario.agregarPersona();
        usuario.agregarPerro();
        usuario.mostrarPerros();
        usuario.adoptarMascota();
        usuario.mostrarPersonas();
}
}