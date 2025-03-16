/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mvc_luces;

import java.util.Random;

/**
 *
 * @author DIEGO
 */
public class Sensorluces {
    
    public static Random random = new Random();
    public static int numeroAleatorio;
    public static String tiempo;

    public Sensorluces() {
    }

    public static String Validarmovimiento() {
        String resultado;
        for (int i = 1; i <= 4; i++) {
            Sensorluces.numeroAleatorio = random.nextInt(2) + 1;
            switch (Sensorluces.numeroAleatorio) {
                case 1:
                    Sensorluces.tiempo = "noche";
                    break;
                case 2:
                    Sensorluces.tiempo = "dia";
                    break;
                default:
                    throw new AssertionError();
            }

            int numerosensor = random.nextInt(2) + 1;

            if (numerosensor==1 && Sensorluces.tiempo.equals("noche")) {
                try {
                Thread.sleep(5000);
                return ("luces encendidas");
            } catch (InterruptedException e) {
                return ("error");
            }
            } else if (numerosensor!=1 || !Sensorluces.tiempo.equals("noche")) {
                try {
                Thread.sleep(5000);
                return ("luces apagadas");
            } catch (InterruptedException e) {
                return ("error");
            }
            }
        }
        return ("error");
    }
}
