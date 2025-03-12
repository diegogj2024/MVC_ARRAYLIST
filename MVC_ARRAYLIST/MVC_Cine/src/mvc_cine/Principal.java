
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mvc_cine;

/**
 *
 * @author SENA
 */
public class Principal {

    private static int resultado;

    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Vista vista = new Vista();
        Cine cine = new Cine();
        Controlador controlador = new Controlador(vista, cine);
        do{
        resultado = controlador.iniciarReserva();
    }while(resultado==1);}
    
}
