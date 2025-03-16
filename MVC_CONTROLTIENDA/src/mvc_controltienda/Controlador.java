/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mvc_controltienda;

import java.util.ArrayList;

/**
 *
 * @author DIEGO
 */
public class Controlador {
    private Cliente objcCliente;
    private Vista objVista;
    private Tienda objtiTienda;
    
    public Controlador(){
        this.objcCliente=new Cliente();
        this.objVista=new Vista();
    }
    
    public void Iniciar(ArrayList<String> registros){
        String mensaje=this.objcCliente.Validarentrada();
        registros.add(mensaje);
        this.objVista.mostrarMrnsaje(registros);
        this.objtiTienda=new Tienda(registros);
    }
    
}
