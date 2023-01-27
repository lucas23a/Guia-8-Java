/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package g08.e03;

import java.util.Scanner;
import pack.barajas.Baraja;

/**
 * Realizar una baraja de cartas españolas orientada a objetos. Una carta tiene
 * un número entre 1 y 12 (el 8 y el 9 no los incluimos) y un palo (espadas,
 * bastos, oros y copas). Esta clase debe contener un método toString() que
 * retorne el número de carta y el palo. La baraja estará compuesta por un
 * conjunto de cartas, 40 exactamente. Las operaciones que podrá realizar la
 * baraja son: • barajar(): cambia de posición todas las cartas aleatoriamente.
 * • siguienteCarta(): devuelve la siguiente carta que está en la baraja, cuando
 * no haya más o se haya llegado al final, se indica al usuario que no hay más
 * cartas. • cartasDisponibles(): indica el número de cartas que aún se puede
 * repartir. • darCartas(): dado un número de cartas que nos pidan, le
 * devolveremos ese número de cartas. En caso de que haya menos cartas que las
 * pedidas, no devolveremos nada, pero debemos indicárselo al usuario. •
 * cartasMonton(): mostramos aquellas cartas que ya han salido, si no ha salido
 * ninguna indicárselo al usuario • mostrarBaraja(): muestra todas las cartas
 * hasta el final. Es decir, si se saca una carta y luego se llama al método,
 * este no mostrara esa primera carta.
 *
 * @author Cristian
 */
public class G08E03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int opc = 1;
        Baraja jugar = new Baraja();
        jugar.crearBaraja();

        do {
            System.out.println("Ingrese una opción");
            System.out.println("1- Barajar las cartas");
            System.out.println("2- Repartir");
            System.out.println("3- Ver las cartas");
            System.out.println("4- Cantidad de cartas disponibles");
            System.out.println("5- Mostrar la baraja");
            System.out.println("6- Salir");
            opc = leer.nextInt();
            switch (opc) {
                case 1:
                    jugar.barajar();
                    break;
                case 2:
                    jugar.darCartas();
                    jugar.siguienteCarta(jugar.getSigCarta());
                    break;
                case 3:
                    jugar.cartasMonton();
                    break;
                case 4:
                    System.out.println(jugar.cartasDisponibles());
                    break;
                case 5:
                    jugar.mostrarBaraja();
                    break;
                case 6:
                    break;
                default:
                    System.out.println("opcion no valida");
                    break;
            }
        } while (opc != 6);
    }
}
