/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mvc_cine;

/**
 *
 * @author SENA
 */
public class Sala {
    private int numero;
    private String pelicula;

    public Sala(int numero, String pelicula) {
        this.numero = numero;
        this.pelicula = pelicula;
    }

    public int getNumero() { 
        return numero; 
    }
    public String getPelicula() {
        return pelicula; 
    }
}
