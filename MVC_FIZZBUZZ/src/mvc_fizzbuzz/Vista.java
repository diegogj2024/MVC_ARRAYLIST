
package mvc_fizzbuzz;

import java.util.Arrays;

public class Vista {
    
    public Vista(){
        
    }
    
    public void mostrarMensaje(){
        System.out.println("empezando programa................");
    }
    
    public void mostrarResultado(String resultados[]){
        System.out.println("resultado:\n"+Arrays.toString(resultados));
    }
}
