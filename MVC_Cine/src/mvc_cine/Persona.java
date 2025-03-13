/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mvc_cine;


public class Persona {
    
    public static String nombre;
    public static int edad;
    public static int cedula;
    
    public Persona(String nombre,int edad,int cedula){
    Persona.nombre=nombre;
    Persona.edad=edad;
    Persona.cedula=cedula;
    }
    
    public String getNombre() {
        return nombre;
    }
    public int getEdad() {
        return edad;
    }
    public int getCedula() {
        return cedula;
    }
    
}
