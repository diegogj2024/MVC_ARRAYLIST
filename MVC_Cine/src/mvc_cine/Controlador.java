/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mvc_cine;

import static java.lang.Math.random;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author SENA
 */
public class Controlador {

    public  static Scanner objscanner=new Scanner(System.in);
    public static String nombre;
    public static int edad;
    public static int cedula;
    public static String controlador=" ";
    public static int silla=1;
    public static Random random=new Random();
    public int asignarsala;
    public static String pelicula;
    public static String correo;


    public Controlador(){
        
    }
    public void Reservar(String correo){
        String respuesta=" ";
        int control=1;
        Controlador.correo=correo;
        this.asignarsala=random.nextInt(4)+1;
        switch (asignarsala) {
            case 1:
                Controlador.pelicula="SONIC 3";
                break;
            case 2:
                Controlador.pelicula="MUFASA";
                break;
            case 3:
                Controlador.pelicula="READY PLAYER ONE";
                break;
            case 4:
                Controlador.pelicula="OPENJAIME";
                break;
        }

        while (!Controlador.controlador.equals("NO") && !Controlador.controlador.equals("SI")) {
            System.out.println("Desea reservar un asiento (Si, No)");
            respuesta = objscanner.nextLine();
            Controlador.controlador = respuesta.toUpperCase();

            if (!Controlador.controlador.equals("NO") && !Controlador.controlador.equals("SI")) {
                System.out.println("Error: opcion incorrecta, por favor ingrese 'Si' o 'No'.");
            }else if("SI".equals(Controlador.controlador)){
               while (control==1){
                System.out.println("que asiento deseas? elige entre el 1 al 20");
                silla=objscanner.nextInt();
                if (Controlador.silla<1 || Controlador.silla>20){
                  System.out.println("ERROR, ingresaste un numero fuera del rango de 1 a 20.... intenta de nuevo");
                }else {
                  control=0;
                  Asientos objAsientos=new Asientos(silla, nombre);
                  Sala objsala=new Sala(asignarsala,pelicula);
                  Cine objcine=new Cine(Persona.nombre,Persona.edad,Persona.cedula,Persona.correo,Persona.silla,this.asignarsala,Persona.pelicula);
                }
                }
            }
        }
    }
}
