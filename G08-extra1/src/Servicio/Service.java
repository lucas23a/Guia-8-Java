/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import java.util.ArrayList;
import java.util.Scanner;
import pack.Persona.Persona;
import pack.perro.Perro;

/**
 *
 * @author Cristian
 */
public class Service {

    Scanner leer = new Scanner(System.in);
    ArrayList<Persona> lista = new ArrayList();
    ArrayList<Perro> mascotas = new ArrayList();

    private Persona crearPersona() {
        Persona p = new Persona();
        System.out.println("--- Persona ---");
        System.out.println("Nombre");
        p.setNombre(leer.next());
        System.out.println("Apellido");
        p.setApellido(leer.next());
        System.out.println("Edad");
        p.setEdad(leer.nextInt());
        System.out.println("Dni");
        p.setDni(leer.nextLong());
        return p;
    }

    private Perro crearPerro() {
        System.out.println("");
        Perro d = new Perro();
        System.out.println("--- Perro ---");
        System.out.println("Nombre");
        d.setNombre(leer.next());
        System.out.println("Raza");
        d.setRaza(leer.next());
        System.out.println("Edad");
        d.setEdad(leer.nextInt());
        System.out.println("Tamaño");
        d.setTamaño(leer.next());
        return d;
    }

    public void agregarPersona() {
        do {
            lista.add(crearPersona());
            System.out.println("Desea agregar otra persona?");
        } while (leer.next().equalsIgnoreCase("si"));
    }

    public void agregarPerro() {
        do {
            mascotas.add(crearPerro());
            System.out.println("Desea agregar otro perro?");
        } while (leer.next().equalsIgnoreCase("si"));
    }

    public void mostrarPerros() {
        System.out.println("");
        for (Perro aux : mascotas) {
            System.out.println(aux);
        }
    }

    public void adoptarMascota() {
        System.out.println("");
        String perri;
       boolean x= false;
        for (int i = 0; i < lista.size(); i++) {
            System.out.println("Que perro quiere adoptar " + lista.get(i).getNombre()+ "?");
            perri = leer.next();
            for (int j = 0; j < mascotas.size(); j++) {
                if (perri.equalsIgnoreCase(mascotas.get(j).getNombre())) {
                    lista.get(i).setDog(mascotas.get(j));
                    mascotas.remove(mascotas.get(j));      
                    x= true;
                }else{
                x=false;
                }
            }
        }
        if (x==false){
         System.out.println("El perro ya fue adoptado");
        }
    }
    
    public void mostrarPersonas(){
        for (Persona aux : lista) {
            System.out.println(aux);
        }
    }
}
