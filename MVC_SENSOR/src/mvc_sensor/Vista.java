/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mvc_sensor;

import java.util.Scanner;

public class Vista {
    private Scanner objScanner=new Scanner(System.in);  
    private int temperatura;
    
    public int pedirDatos(){
        System.out.println("Ingrese la temperatura actual del invernadero");
        this.temperatura=this.objScanner.nextInt();
        return this.temperatura;
    }

    public void mostrarMensaje(String mensaje){
        System.out.println(mensaje);
    }
}
