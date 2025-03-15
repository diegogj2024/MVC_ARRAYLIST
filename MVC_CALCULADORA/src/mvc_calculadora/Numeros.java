/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mvc_calculadora;

import java.util.ArrayList;

/**
 *
 * @author DIEGO
 */
public class Numeros {
    private static ArrayList<Integer> objguardar;
    public Numeros(ArrayList<Integer> objlista,int contador){
        Numeros.objguardar = new ArrayList<>();
        Numeros.objguardar.addAll(objlista);
    }
}
