/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mvc_sensor;

/**
 *
 * @author DIEGO
 */
public class Controlador {
    private Vista vista;
    private Sensor sensor;
    private Calefactor calefactor;
    private Ventilador ventilador;
    public Controlador(){
        this.vista =new Vista();
    }
    
    public void iniciar(int temperaturas[]){
        int contador=0;
        while(true){
        int temperatura = this.vista.pedirDatos();
        temperaturas[contador]=temperatura;
        contador+=1;
        this.sensor=new Sensor(temperaturas);
        if(temperatura<10){
            this.calefactor=new Calefactor(true);
            this.vista.mostrarMensaje("el calefactor esta encendido");
            try{
             Thread.sleep(5000);
            }catch(InterruptedException e){
                System.out.println("error");
            }
        }else if(temperatura>=10 && temperatura<=25){
            this.calefactor=new Calefactor(false);
            this.ventilador=new Ventilador(false);
            this.vista.mostrarMensaje("no se activo nada");
            try{
             Thread.sleep(5000);
            }catch(InterruptedException e){
                System.out.println("error");
            }
        }else if(temperatura>25){
            this.ventilador=new Ventilador(true);
            this.vista.mostrarMensaje("el ventilador esta encendido");
            try{
             Thread.sleep(5000);
            }catch(InterruptedException e){
                System.out.println("error");
            }
        }
        if(contador==3){
            System.out.println("bye bye");
            break;
        }
        }
        
    }
}
