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

    public int iniciarReserva() {
        usuario = vista.pedirDatosUsuario();
        int resultado;
        int salaNumero = random.nextInt(4) + 1;
        Sala sala = cine.getSala(salaNumero);

        vista.mostrarMensaje("Su pelicula asignada es: " + sala.getPelicula());

        boolean asientoAsignado = false;
        while (!asientoAsignado) {
            vista.mostrarMensaje("Seleccione un numero de asiento (1-20):");
            int numAsiento = new Scanner(System.in).nextInt();

            if (numAsiento >= 1 && numAsiento <= 20) {
                Asientos asiento = new Asientos(numAsiento);
                asiento.ocuparAsiento();
                vista.mostrarMensaje("Asiento reservado exitosamente.");
                asientoAsignado = true;
                vista.mostrarMensaje("dese hacer otra reserva? 1=si 2=no");
                resultado = new Scanner(System.in).nextInt();
                return resultado;
            } else {
                vista.mostrarMensaje("Numero de asiento no válido.");
                return resultado=0;
            }
        }
        return 0;
    }
}
