/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mvc_controltienda;

import java.util.ArrayList;

public class Principal {

    private static ArrayList<String> registros =new ArrayList<>();
    private static Controlador objcoControlador;
    public static void main(String[] args) {
        Principal.objcoControlador=new Controlador();
        Principal.objcoControlador.Iniciar(registros);
    }
}
