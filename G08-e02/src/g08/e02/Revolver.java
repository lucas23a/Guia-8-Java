/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package g08.e02;

import java.util.Random;

/**
 *
 * @author Cristian
 */
public class Revolver {
     Random ale = new Random(); 
    private int posactual;
    private int posagua;

    public Revolver() {
    }

    public Revolver(int posactual, int posagua) {
        this.posactual = posactual;
        this.posagua = posagua;
    }

    public int getPosactual() {
        return posactual;
    }

    public void setPosactual(int posactual) {
        this.posactual = posactual;
    }

    public int getPosagua() {
        return posagua;
    }

    public void setPosagua(int posagua) {
        this.posagua = posagua;
    }
            
    public void llenarRevolver(){      
        posactual= ale.nextInt(5);
        posagua = ale.nextInt(5);        
    }
    
    public boolean mojar(){
        boolean x= false;
        if (posactual== posagua){
        x= true;
        }
        return x;
    }
    
    public void siguienteChorro(){
        posactual= ale.nextInt(7);
    }

    @Override
    public String toString() {
        return "Revolver{ posicion actual=" + posactual + ", posicion agua=" + posagua + '}';
    }
    
    
    
    
}
