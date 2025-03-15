/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mvc_sensordemovimiento;

import java.util.ArrayList;
import java.util.Random;

public class Sensordemovimiento {
    public static Random random = new Random();
    public static int numeroAleatorio = random.nextInt(2) + 1;
    public static int numerosensor=random.nextInt(2)+1;
    public static String tiempo;
    
    public Sensordemovimiento(){
        switch (Sensordemovimiento.numeroAleatorio) {
            case 1:
                Sensordemovimiento.tiempo="noche";
                break;
            case 2:
                Sensordemovimiento.tiempo="dia";
                break;
            default:
                throw new AssertionError();
        }
    }
    
    public  void validarsensor(ArrayList<Integer> Avisos,int contador){
            int numerosensor=random.nextInt(2)+1;
            if (numerosensor==1 && Sensordemovimiento.tiempo.equals("noche")){
                Avisos.add(contador);
            }
    }
}
    
