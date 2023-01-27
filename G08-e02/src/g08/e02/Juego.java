/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package g08.e02;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Cristian
 */
public class Juego {
    Scanner leer = new Scanner (System.in);
    ArrayList <Jugador> players = new ArrayList();
    Jugador j = new Jugador();
    Revolver r = new Revolver();
    
    public void llenarJuego(){    
        do{
        j.crearJugador();
        players.add(j);
            System.out.println("Desea crear un nuevo jugador?");
        }while(leer.next().equalsIgnoreCase("si")) ;
        
    }
    
    public void ronda(){
        System.out.println("Comienza la ronda");
        for (Jugador aux : players) {
            if (aux.disparo()== false){
                System.out.println("El  jugador " + aux.getNombre() + " recibio el tiro " + aux.getTiro());
                break;
            }
        }
   
        System.out.println("---Fin del juego---");
    }

    @Override
    public String toString() {
        return "Juego{" + "leer=" + leer + ", players=" + players + ", j=" + j + ", r=" + r + '}';
    }
    
    
}
