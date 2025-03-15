/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mvc_calculadora;

import java.util.ArrayList;
public class Principal {
    private static ArrayList<Integer> objlista;
    private static String [] Datos;
    private static Controlador objControlador;
    private static Numeros objNumeros;
    public static void main(String[] args) {
       Principal.Datos=new String[3];
       Principal.objlista = new ArrayList<>();
       Principal.objControlador=new Controlador();
       int contador=0;
       int resultado;
        do {    
            contador +=1;
            resultado = objControlador.Iniciar(Principal.Datos,Principal.objlista);
        } while (resultado==1);
        Principal.objNumeros=new Numeros(objlista,contador);
    }
    
}
