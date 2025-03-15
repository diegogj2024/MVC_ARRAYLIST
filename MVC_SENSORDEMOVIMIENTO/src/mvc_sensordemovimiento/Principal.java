/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mvc_sensordemovimiento;

import java.util.ArrayList;

/**
 *
 * @author DIEGO
 */
public class Principal {

    private static Controlador objControlador;
    private static ArrayList<Integer> Avisos =new ArrayList<>();
    public static void main(String[] args) {
       Principal.objControlador=new Controlador();
       int contador=0;
        do {            
            contador +=1;
            Principal.objControlador.iniciar(Principal.Avisos,contador);
        } while (contador<3);
        Principal.objControlador.imprimir(Avisos);
    }
    
}
