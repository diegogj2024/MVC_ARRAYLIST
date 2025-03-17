/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mvc_fizzbuzz;

import java.util.Arrays;

/**
 *
 * @author DIEGO
 */
public class Fizzbuzz {
    private String[] guardar;
    public Fizzbuzz(String resultado[]){
    this.guardar=new String[100];
    for(int i=0;i<100;i++){
        this.guardar[i]=resultado[i];
    }
    }
    
}
