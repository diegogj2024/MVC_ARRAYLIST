/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mvc_cine;

/**
 *
 * @author SENA
 */
public class Usuario extends Persona{

    private static String correo;
    public Usuario(String nombre,int edad,int cedula,String correo){
        super(nombre, edad, cedula);
        Usuario.correo=correo;
    }
    
     public String getCorreo() {
         return correo;
     }
}
