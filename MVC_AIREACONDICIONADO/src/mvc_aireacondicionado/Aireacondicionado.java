/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mvc_aireacondicionado;

import java.util.ArrayList;

/**
 *
 * @author DIEGO
 */
public class Aireacondicionado {
    
    private ArrayList<String> estado =new ArrayList<String>();
    public Aireacondicionado(){
        
    }
    
    public void recibirEstado(ArrayList<String> registros){
        this.estado.addAll(registros);
    }
}
