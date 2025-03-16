/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mvc_aireacondicionado;

import java.util.Random;

/**
 *
 * @author DIEGO
 */
public class Sensor {
     public static Random random = new Random();
    public static int humedad = random.nextInt(100) + 1;
    public static int temperatura=random.nextInt(50)+1;
    public Sensor(){
        
    }
    
    
    public static String Validartemperatura(){
        if (Sensor.humedad>60 && Sensor.temperatura>28 && Sensor.temperatura<=34){
            System.out.println(".");
            return("aire encendido");
        }else if (temperatura>34){
            return ("aire encendido");
        }else{
            return ("aire apagado");
        }
    }
}
