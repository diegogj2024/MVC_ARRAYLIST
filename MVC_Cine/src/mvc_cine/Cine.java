/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mvc_cine;



import java.util.ArrayList;

public class Cine {
    private ArrayList<Sala> salas;

    public Cine() {
        salas = new ArrayList<>();
        salas.add(new Sala(1, "SONIC 3"));
        salas.add(new Sala(2, "MUFASA"));
        salas.add(new Sala(3, "READY PLAYER ONE"));
        salas.add(new Sala(4, "OPENJAIME"));
    }

    public Sala getSala(int numero) {
        for (Sala s : salas) {
        if (s.getNumero() == numero) {
            return s;
        }
    }
    return null;
    }
}

    

