/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mvc_sensor;

/**
 *
 * @author DIEGO
 */
public class Principal {
    private static int [] temperaturas;

    public static void main(String[] args) {
        Principal.temperaturas=new int[3];
        Controlador objControlador=new Controlador();
        objControlador.iniciar(Principal.temperaturas);
        
    }
    
}
