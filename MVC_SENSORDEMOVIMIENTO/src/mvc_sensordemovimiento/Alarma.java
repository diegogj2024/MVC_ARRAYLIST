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
public class Alarma {
    private static ArrayList<Integer> registroAvisos=new ArrayList<>();
    
    public Alarma(ArrayList<Integer> Avisos){
        Alarma.registroAvisos.addAll(Avisos);
    }
    
}
