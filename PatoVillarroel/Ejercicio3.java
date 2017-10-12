package PatoVillarroel;
import java.util.*;

public class Ejercicio3 {
    public void desarrollar() {
        
        System.out.println ("\n*************\nEJERCICIO 3");
        System.out.println ("Leer 2 numeros y que nos diga si son iguales o cual es mayor\n************\n");
    
        float n1;
        float n2;
        Scanner take = new Scanner(System.in);
        
        System.out.println ("Ingresa el primer numero");
        n1 = take.nextFloat();
        System.out.println ("Ingresa el segundo numero");
        n2 = take.nextFloat();
        
        if (n1 == n2) {
            System.out.println ("Ambos numeros son iguales ");
        }
        else {
            if (n1 > n2) {
                System.out.println (n1 +  " es mayor que " + n2);
            }
            else {
                System.out.println (n1 + " es menor que " + n2);
            }
        }
        
    }
}
