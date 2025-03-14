/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mvc_fizzbuzz;

/**
 *
 * @author DIEGO
 */
public class Numeros {
    
    public Numeros(){
        
    }
    
    public void procesarNumeros(String resultado[]){
        for(int i = 1; i <= 100; i++){
        if (i % 3 == 0 && i % 5 == 0) {
            resultado[i-1] = "fizzbuzz";
        } else if (i % 3 == 0) {
            resultado[i-1] = "fizz";
        } else if (i % 5 == 0) {
            resultado[i-1] = "buzz";
        } else {
            resultado[i-1] = String.valueOf(i);
        }
    }
    }
}    
