/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mvc_cine;

import java.util.Arrays;


public class Asientos {
    private int numero;

    public Asientos(int numero) {
        this.numero = numero;
    
    }
    public int  ocuparAsiento(int listaAsientosocupados[]){
        for(int i=0;i<listaAsientosocupados.length;i++){
            System.out.println(".");
            if(listaAsientosocupados[i]==0){
                listaAsientosocupados[i]=this.numero;
                break;
            }else if(listaAsientosocupados[i]==this.numero){
                    System.out.println("esta silla ya esta ocupada elija otra");
                    i= i-1;
                    return 0;
            }
        }
        System.out.println(Arrays.toString(listaAsientosocupados));
        return 1;
    }

    public int getNumero() {
        return numero; 
    }
}
