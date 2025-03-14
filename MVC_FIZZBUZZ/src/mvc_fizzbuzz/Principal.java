/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mvc_fizzbuzz;

public class Principal {

    public static String [] resultados; 
    
    public static void main(String[] args) {
        Principal.resultados=new String[100];
        Controlador objControlador=new Controlador();
        objControlador.iniciar(Principal.resultados);
    }
    
}
