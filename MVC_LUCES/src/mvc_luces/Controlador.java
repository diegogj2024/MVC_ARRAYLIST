/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mvc_luces;

import java.util.ArrayList;

public class Controlador {
    private Sensorluces objSensorluces;
    private Vista objVista;
    private Casa objCasa;
    public Controlador(){
        this.objSensorluces=new Sensorluces();
        this.objVista=new Vista();
    }
    
    public void Iniciar(ArrayList<String> registros){
        String mensaje=this.objSensorluces.Validarmovimiento();
        registros.add(mensaje);
        this.objVista.mostrarEstados(registros);
        this.objCasa=new Casa(registros);
    }
            
}
