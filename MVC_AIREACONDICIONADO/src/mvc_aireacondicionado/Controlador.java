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
public class Controlador {
    private Vista objVista;
    private Sensor objSensor;
    private Aireacondicionado objAireacondicionado;
    public Controlador(){
        this.objVista=new Vista();
        this.objSensor=new Sensor();
        this.objAireacondicionado=new Aireacondicionado();
    }
    
    public void Iniciar(ArrayList<String> registros){
        String mensaje=this.objSensor.Validartemperatura();
        registros.add(mensaje);
        this.objVista.mostrarEstado(registros);
        this.objAireacondicionado.recibirEstado(registros);
    }
    
}
