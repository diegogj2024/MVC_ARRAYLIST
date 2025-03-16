/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mvc_controltienda;

import java.util.ArrayList;

/**
 *
 * @author DIEGO
 */
public class Tienda {
    private ArrayList<String> guardarregistro=new ArrayList<String>();
    public Tienda(ArrayList<String> registro){
        this.guardarregistro.addAll(registro);
    }
    
}
