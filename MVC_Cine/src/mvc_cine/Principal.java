
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mvc_cine;

public class Principal {

    private static int resultado;
    private static int [] listaAsientosocupados;
    private static int [] listaAsientosdisponibles;
    
    public static void main(String[] args) {
        Principal.listaAsientosocupados=new int[20];
        Principal.listaAsientosdisponibles=new int[20];
        for(int i=0;i<Principal.listaAsientosdisponibles.length;i++){
            Principal.listaAsientosdisponibles[i]=i+1;
        }
        Vista vista = new Vista();
        Cine cine = new Cine();
        Controlador controlador = new Controlador(vista, cine);
        do{
        resultado = controlador.iniciarReserva(listaAsientosdisponibles,listaAsientosocupados);
    }while(resultado==1);}
    
}
