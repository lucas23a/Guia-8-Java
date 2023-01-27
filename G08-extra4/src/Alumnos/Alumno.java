/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Alumnos;

import java.util.Comparator;
import java.util.Objects;

/**
 *
 * @author Cristian
 */
public class Alumno {

    private String nombreCompleto;
    private long dni;
    private int votos = 0;

    public Alumno() {
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public int getVotos() {
        return votos;
    }

    public void setVotos(int votos) {
        this.votos = votos;
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombreCompleto=" + nombreCompleto + ", dni=" + dni + ", votos=" + votos + '}';
    }

    public static Comparator<Alumno> cantVotos = (Alumno a1, Alumno a2)
            -> Integer.compare(a2.getVotos(), a1.getVotos());
}
