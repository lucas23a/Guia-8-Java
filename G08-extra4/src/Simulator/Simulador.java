/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Simulator;

import Alumnos.Alumno;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;
import newpackage.voto.Voto;

/**
 *
 * @author Cristian
 */
public class Simulador {

    Scanner leer = new Scanner(System.in);
    private ArrayList<String> apellidos = new ArrayList();
    private ArrayList<String> nombres = new ArrayList();
    ArrayList<Alumno> alumnos = new ArrayList();
    private Random ale = new Random();
    private int cant;

    private void llenarListas() {
        apellidos.add("Gimenez");
        apellidos.add("Lazo");
        apellidos.add("Galarga");
        apellidos.add("Bessona");
        apellidos.add("Perez");
        apellidos.add("Diaz");
        apellidos.add("Palermo");
        nombres.add("Anahi");
        nombres.add("Elba");
        nombres.add("Elver");
        nombres.add("Mica");
        nombres.add("Pablo");
        nombres.add("Ramon");
        nombres.add("Martina");
    }

    public ArrayList<String> NombresAlumnos() {
        llenarListas();
        ArrayList<String> lista = new ArrayList();
        do {
            for (int j = 0; j < cant; j++) {
                int num = ale.nextInt(nombres.size());
                int n = ale.nextInt(apellidos.size());
                lista.add(j, nombres.get(num).concat(" ".concat(apellidos.get(n))));
            }
        } while (lista.size() < cant);
        return lista;
    }

    public ArrayList<Integer> generarDni() {
        ArrayList<Integer> nums = new ArrayList();
        do {
            int n = (int) (Math.random() * 85000000);
            if (n > 30000000) {
                nums.add(n);
            }
        } while (nums.size() < cant);
        return nums;
    }

    public void crearAlumno() {
        System.out.println("Cuantos alumnos quiere agregar?");
        cant = leer.nextInt();
        for (int i = 0; i < cant; i++) {
            Alumno a= new Alumno();
          a.setNombreCompleto(NombresAlumnos().get(i));
          a.setDni(generarDni().get(i));
          alumnos.add(a);
        }
    }
    
      public void mostrar() {
          for (Alumno aux : alumnos) {
              System.out.println(aux);
          }
}
      
      public HashSet<Voto> votacion(){  
          HashSet votacion= new HashSet();          
          for (int i = 0; i < alumnos.size(); i++) {
             Voto nuevo = new Voto();
              nuevo.setAlu(alumnos.get(i));
              for (int j = 0; j < 3; j++) {
                  int a= (int) (Math.random()*alumnos.size());                
                  if (a!=(i)) {
                     nuevo.setVotacion(alumnos.get(a));
                     alumnos.get(a).setVotos(alumnos.get(a).getVotos()+1);
                  }
              }
              votacion.add(nuevo);
          }
          return votacion;
      }
      
      public void verVotacion(){
          System.out.println("");
          System.out.println("Los alumnos votaron de la siguiente manera:");
          for (Voto aux : votacion()){
              System.out.println(aux);
          }
      }
      
      public void conteo(){
          System.out.println("");
          System.out.println("Conteo de votos");
          alumnos.sort(Alumno.cantVotos);
          mostrar();
      }

      public void facilitadores(){
          System.out.println("---Facilitadores---");
          for (int i = 0; i < 5; i++) {
              System.out.println(alumnos.get(i));
          }
          System.out.println("----Facilitadores suplentes----");
          for (int i = 5; i < 10; i++) {
              System.out.println(alumnos.get(i));
          }
      }
      
}