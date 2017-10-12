package PatoVillarroel;
import java.util.*;

public class Ejercicio7 {
    public void desarrollar() {
        
        System.out.println ("\n*************\nEJERCICIO 7");
        System.out.println ("Pares entre 0 y 100 \n************\n");
    
        int num = 0;
        int count = 0;
        while (num <= 100) {
            if (num % 2 == 0) {
                System.out.print(num+", ");
                count++;
            }
            num++;
        }
        System.out.println("\nSon "+count+" numeros pares");
    }
}