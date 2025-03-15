/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mvc_calculadora;

import java.util.ArrayList;
import java.util.Scanner;
public class Vista {
    
    public Scanner objsScanner=new Scanner(System.in);
    public Vista(){
        
    }
    
    public void pedirDatos(String[] Datos){
        String numero1;
        String numero2;
        String operacion;
        System.out.println("ingrese el 1 numero");
        numero1=objsScanner.nextLine();
        System.out.println("ingrese el 2 numero");
        numero2=objsScanner.nextLine();
        System.out.println("ingrese la operacion (+ - X /)");
        operacion=objsScanner.nextLine();
        Datos[0]=numero1;
        Datos[1]=numero2;
        Datos[2]=operacion;
    }
    
    public int mostrarResultado(ArrayList<Integer> objlista){
        System.out.println("Resultados"+objlista);
        System.out.println("desea hacer otra operacion? 1=si 2=no");
        int resultado=this.objsScanner.nextInt();
        objsScanner.nextLine();
        return resultado;
    }
}
