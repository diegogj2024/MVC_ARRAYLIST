
package mvc_fizzbuzz;

import java.util.Arrays;

/**
 *
 * @author DIEGO
 */
public class Controlador {
    private Vista objvista;
    private Numeros objNumeros;
    private Fizzbuzz objFizzbuzz;
    
    public Controlador(){
        
    }
    
    public void iniciar(String resultados[]){
        this.objvista=new Vista();
        this.objNumeros=new Numeros();
        objvista.mostrarMensaje();
        objNumeros.procesarNumeros(resultados);
        this.objFizzbuzz=new Fizzbuzz(resultados);
        objvista.mostrarResultado(resultados);
        
    }    
}
