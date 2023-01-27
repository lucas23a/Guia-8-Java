/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpackage.voto;

import Alumnos.Alumno;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;

/**
 *
 * @author Cristian
 */
public class Voto {

    Alumno alu = new Alumno();
    HashSet<Alumno> votacion = new HashSet();

    public Voto() {
    }

    public Iterator<Alumno> getVotos() {
        return votacion.iterator();
    }

    public Alumno getAlu() {
        return alu;
    }

    public void setAlu(Alumno alu) {
        this.alu = alu;
    }

    public HashSet<Alumno> getVotacion() {
        return votacion;
    }

    public void setVotacion(Alumno alu) {
        this.votacion.add(alu);
    }

    @Override
    public String toString() {
        return "Voto{" + alu + ", votacion=" + votacion + '}';
    }

}
