package mvc_cine;

import java.util.Random;
import java.util.Scanner;

public class Controlador {
    private Vista vista;
    private Cine cine;
    private Usuario usuario;
    private Random random;

    public Controlador(Vista vista, Cine cine) {
        this.vista = vista;
        this.cine = cine;
        this.random = new Random();
    }

    public int iniciarReserva(int listaAsientosdisponibles[],int listaAsientosocupados[]) {
        usuario = vista.pedirDatosUsuario();
        int resultado;
        int salaNumero = random.nextInt(4) + 1;
        Sala sala = cine.getSala(salaNumero);
        Scanner objScanner=new Scanner(System.in);
        vista.mostrarMensaje("Su pelicula asignada es: " + sala.getPelicula());
        boolean asientoAsignado = false;
        while (!asientoAsignado) {
            vista.mostrarMensaje("Seleccione un numero de asiento (1-20):");
            int numAsiento = objScanner.nextInt();

            if (numAsiento >= 1 && numAsiento <= 20) {
                Asientos objAsiento = new Asientos(numAsiento);
                int control=objAsiento.ocuparAsiento(listaAsientosocupados);
                if(control==0){
                    return resultado=1;
                }else{
                vista.mostrarMensaje("Asiento reservado exitosamente.");
                vista.mostrarMensaje("dese hacer otra reserva? 1=si 2=no");
                resultado = objScanner.nextInt();
                asientoAsignado = true;
                return resultado;
                
                }       
            } else {
                vista.mostrarMensaje("Numero de asiento no válido.");
                asientoAsignado= true;
                return resultado=0;
            }
        }
        return 0;
    }
}
