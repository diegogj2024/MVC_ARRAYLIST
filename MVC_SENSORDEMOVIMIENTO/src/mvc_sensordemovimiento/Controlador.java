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
public class Controlador {
    private Sensordemovimiento objSensordemovimiento;
    private Vista objVista;
    private Alarma objAlarma;
    private String mensaje;
    
    public Controlador(){
        this.objSensordemovimiento=new Sensordemovimiento();
        this.objVista=new Vista();
    }
    
    public void iniciar(ArrayList<Integer> Avisos,int contador){
        this.objSensordemovimiento.validarsensor(Avisos,contador);
        if((Avisos.contains(1) && Avisos.contains(2) && Avisos.contains(3)) || 
           (Avisos.contains(1)&& Avisos.contains(2)) || 
           (Avisos.contains(1) && Avisos.contains(3)) || 
           (Avisos.contains(2) && Avisos.contains(3))){
            mensaje="la alarma se activo";
            this.objAlarma=new Alarma(Avisos);
        }else{
            mensaje="la alarma no se activo";
        }
    }
    
    public void imprimir(ArrayList<Integer> Avisos){
        this.objVista.mostrarSensor(mensaje,Avisos);
    }
    
}
