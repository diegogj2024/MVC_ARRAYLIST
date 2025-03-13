/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mvc_cine;

import java.util.Scanner;

public class Vista {
    private Scanner objScanner = new Scanner(System.in);

    public Usuario pedirDatosUsuario() {
        System.out.println("Ingrese su nombre:");
        String nombre = objScanner.nextLine();
        System.out.println("Ingrese su edad:");
        int edad = objScanner.nextInt();
        System.out.println("Ingrese su cedula:");
        int cedula = objScanner.nextInt();
        objScanner.nextLine();
        System.out.println("Ingrese su correo:");
        String correo = objScanner.nextLine();

        return new Usuario(nombre, edad, cedula, correo);
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }
}