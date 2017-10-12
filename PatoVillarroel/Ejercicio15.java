package PatoVillarroel;
import java.util.Scanner;

public class Ejercicio15 {
    public void desarrollar() {
        
        System.out.println ("\n*************\nEJERCICIO 15");
        System.out.println ("Ingresar nota e indicar insuficiente, suficiente, buena\n************\n");
        
        float nota;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println ("Ingresa tu nota:");
        nota = entrada.nextFloat();
                
        if (nota < 4) {
            System.out.println ("Tu nota es insuficiente");
        }
        else if (nota >= 4 && nota < 6) {
            System.out.println ("Tu nota es suficiente");  
        }
        else if (nota >= 6 && nota <= 7) {
            System.out.println ("¡Tu nota es buena!");  
        }
        else {
            System.out.println ("Tu nota está fuera de rango");  
        }
        
    }
}
