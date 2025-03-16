/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mvc_controltienda;

import java.util.Random;

/**
 *
 * @author DIEGO
 */
public class Cliente {
    private static Random random = new Random();
    private static int membresia = random.nextInt(3) + 1;
    private static int hora=random.nextInt(24)+1;
    public Cliente(){
        
    }
    
    public static String Validarentrada(){
        if(Cliente.membresia==1 && Cliente.hora>=6 && Cliente.hora<=18){
            return ("el cliente tiene membresia y pudo entrar");
        }else if (Cliente.membresia==2 && Cliente.hora>=6 && Cliente.hora<=18){
            return ("el cliente es empleado y pudo entrar");
        }else{
            return ("el cliente no pudo entrar");
        }
    }
    
}
