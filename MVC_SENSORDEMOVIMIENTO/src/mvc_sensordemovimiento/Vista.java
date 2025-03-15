/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mvc_sensordemovimiento;

import java.util.ArrayList;

/**
 *
 * @author DIEGO
 */
public class Vista {
    
    public Vista(){
        
    }
    
    public void mostrarSensor(String mensaje,ArrayList<Integer> Avisos){
        System.out.println("detecciones \n"+Avisos+"\n"+mensaje);
    }
}
