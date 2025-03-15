/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mvc_calculadora;

import java.util.ArrayList;

/**
 *
 * @author DIEGO
 */
public class Calculadora {
    private static int resultado;
    
    public Calculadora(){
        
    }
    
    public static void haceroperacion(String [] Datos, ArrayList<Integer> objlista){
        String convertir=Datos[0];
        int numero=Integer.parseInt(convertir);
        String convertir2=Datos[1];
        int numero2=Integer.parseInt(convertir2);
        String operacion=Datos[2];
        
        switch (operacion) {
            case "+":
                Calculadora.resultado=numero+numero2;
                objlista.add(Calculadora.resultado);
                break;
            case "-":
                Calculadora.resultado=numero-numero2;
                objlista.add(Calculadora.resultado);
                break;
            case "X":
                Calculadora.resultado=numero*numero2;
                objlista.add(Calculadora.resultado);
                break;
            case "/":
                Calculadora.resultado=numero/numero2;
                objlista.add(Calculadora.resultado);
                break;
            default:
                System.out.println("esta opcion no existe");
        }
    }
}
