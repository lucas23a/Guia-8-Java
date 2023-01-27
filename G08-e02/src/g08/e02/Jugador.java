/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package g08.e02;

import java.util.Scanner;

/**
 *
 * @author Cristian
 */
public class Jugador {
    Scanner leer = new Scanner (System.in).useDelimiter("\n");
    private int id;
    private String nombre;

    private Revolver tiro=new Revolver();

    public Jugador() {
    }

    public Scanner getLeer() {
        return leer;
    }

    public void setLeer(Scanner leer) {
        this.leer = leer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }   

    public Revolver getTiro() {
        return tiro;
    }

    public void setTiro(Revolver tiro) {
        this.tiro = tiro;
    }
    
    
    
   
    public void crearJugador(){
        System.out.println("Nuevo jugador");
        System.out.println("Ingrese ID (De 1 a 6)");
        id=leer.nextInt();
        if (id >6){
        id=6;
        }
        System.out.println("Nombre");
        nombre= leer.next();  
        tiro.llenarRevolver();
    }
    
    public boolean disparo(){
       boolean mojado;
        tiro.mojar();
        tiro.siguienteChorro();
        if (tiro.mojar()== true){
        mojado= false;
        }else{
            mojado = true;
        }
        return mojado;
    }

    @Override
    public String toString() {
        return "Jugador{" + "leer=" + leer + ", id=" + id + ", nombre=" + nombre + ", tiro=" + tiro + '}';
    }
    
    
    
    
    
    
}
