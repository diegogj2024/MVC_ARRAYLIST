/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mvc_calculadora;

import java.util.ArrayList;

/**
 *
 * @author DIEGO
 */
public class Controlador {
    
    private Vista objVista;
    private Calculadora objCalculadora;
    public Controlador() {
        this.objVista=new Vista();
        this.objCalculadora=new Calculadora();
    }
    
    public int Iniciar(String[] Datos, ArrayList<Integer> objlista){
        this.objVista.pedirDatos(Datos);
        this.objCalculadora.haceroperacion(Datos,objlista);
        int resultado=this.objVista.mostrarResultado(objlista);
        return resultado;
        
    }
    
}
