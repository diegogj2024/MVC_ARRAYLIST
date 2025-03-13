/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mvc_sensor;

import java.util.Arrays;

/**
 *
 * @author DIEGO
 */
public class Sensor {
    private int[] temperatura=new int[3];
    public Sensor(int temperaturas[]){
        this.temperatura=temperaturas;
        System.out.println(Arrays.toString(temperaturas));
    }
    
    public int[] getTemperatura(){
        return this.temperatura;
    }
}
