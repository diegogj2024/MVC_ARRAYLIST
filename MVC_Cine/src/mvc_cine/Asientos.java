/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mvc_cine;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author SENA
 */
public class Asientos {
    private int numero;
    private boolean ocupado;
    private int [] listaAsientosdisponibles;

    public Asientos(int numero) {
        this.listaAsientosdisponibles=new int[20];
        for(int i=0;i<this.listaAsientosdisponibles.length;i++){
            this.listaAsientosdisponibles[i]=i+1;
        }
        System.out.println(Arrays.toString(this.listaAsientosdisponibles));
        this.numero = numero;
        this.ocupado = false;
    }

    public int getNumero() {
        return numero; 
    }
    public boolean isOcupado() { 
        return ocupado; 
    }
    public void ocuparAsiento() { 
        this.ocupado = true; 
    }
    
}
