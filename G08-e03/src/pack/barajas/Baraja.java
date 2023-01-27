/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pack.barajas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import newpackage.cartas.Carta;

/**
 *
 * @author Cristian
 */
public class Baraja {

    Scanner leer = new Scanner(System.in);
    private ArrayList<Carta> naipes = new ArrayList();
    private ArrayList<Carta> repartidas = new ArrayList();
    private int sigCarta;
    private int num;

    public int getSigCarta() {
        return sigCarta;
    }

    public void setSigCarta(int sigCarta) {
        this.sigCarta = sigCarta;
    }

    @Override
    public String toString() {
        return "Baraja{" + "naipes=" + naipes + ", sigCarta=" + sigCarta + '}';
    }

    public Baraja() {
    }

    public void crearBaraja() {

        for (int i = 0; i < 12; i++) {
            Carta c = new Carta();
            c.setNum(i + 1);
            c.setPalo("Oro");
            naipes.add(c);
            if (c.getNum() == 8 || c.getNum() == 9) {
                naipes.remove(c);
            }
        }
        for (int i = 0; i < 12; i++) {
            Carta c = new Carta();
            c.setNum(i + 1);
            c.setPalo("Espada");
            naipes.add(c);
            if (c.getNum() == 8 || c.getNum() == 9) {
                naipes.remove(c);
            }
        }

        for (int i = 0; i < 12; i++) {
            Carta c = new Carta();
            c.setNum(i + 1);
            c.setPalo("Copa");
            naipes.add(c);
            if (c.getNum() == 8 || c.getNum() == 9) {
                naipes.remove(c);
            }
        }
        for (int i = 0; i < 12; i++) {
            Carta c = new Carta();
            c.setNum(i + 1);
            c.setPalo("Basto");
            naipes.add(c);
            if (c.getNum() == 8 || c.getNum() == 9) {
                naipes.remove(c);
            }
        }
        for (Carta aux : naipes) {
            System.out.println(aux);
        }
    }

    public void barajar() {
        Collections.shuffle(naipes);
        System.out.println("Se barajaron las cartas");
    }

    public Carta siguienteCarta(int sigCarta) {
        Carta n = null;
        sigCarta = sigCarta + num;
        if (sigCarta == naipes.size()) {
            System.out.println("No hay mas cartas para dar, barajar de nuevo");
        } else {
            n = naipes.get(sigCarta++);
            // naipes.remove(n);
        }
        return n;
    }

    public int cartasDisponibles() {
        return (naipes.size() - sigCarta);
    }

    public ArrayList<Carta> darCartas() {
        ArrayList<Carta> repartir = new ArrayList();
        System.out.println("Cuantas cartas quiere recibir?");
        sigCarta = leer.nextInt();

        if (sigCarta > naipes.size()) {
            System.out.println("No se puede dar mas cartas de las que hay");
        } else if (sigCarta > cartasDisponibles()) {
            System.out.println("No hay suficientes cartas");
        } else {
            for (int i = 0; i < sigCarta; i++) {
                repartidas.add(siguienteCarta(i));
                 naipes.remove(siguienteCarta(i));             
            }
            return repartir;
        }
        return null;
    }

    public void cartasMonton() {
        System.out.println("");
        if (cartasDisponibles() == naipes.size()) {
            System.out.println("No se saco ninguna carta");
        } else {
            System.out.println("Sus cartas son:");
            for (Carta aux : repartidas) {
                System.out.println(aux);
            }
        }
    }

    public void mostrarBaraja() {
        if (cartasDisponibles() == 0) {
            System.out.println("No quedan cartas en la baraja");
        } else {
            System.out.println("");
            System.out.println("----Resto de la baraja----");
            for (int i = 0; i < naipes.size(); i++) {
                System.out.println(naipes.get(i));
            }
        }
    }
}
