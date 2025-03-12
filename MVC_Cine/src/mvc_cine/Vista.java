/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mvc_cine;

import java.util.Scanner;

import java.util.Scanner;

public class Vista {
    public static Scanner objscanner=new Scanner(System.in);
    public static String nombre=" ";
    public static int edad=0;
    public static int cedula=0;
    public static String correo;
    
    public Vista(){
       
    }
    
    public pedirDatos(){
        System.out.println("ingrese su nombre porfavor");
        Vista.nombre=objscanner.nextLine();
        System.out.println("ingrese su edad");
        Vista.edad=objscanner.nextInt();
        System.out.println("ingrese su cedula sin puntos o comas porfavor");
        Vista.cedula=objscanner.nextInt();
        System.out.println("ingrese su correo electronico");
        objscanner.nextLine();
        Vista.correo=objscanner.nextLine();
        Usuario objusuario=new Usuario(Vista.nombre,Vista.edad,Vista.cedula,Vista.correo);
        objusuario.Reservar(Vista.correo);
        objusuario.imprimirdatos(Vista.correo);
    }
    
}
