package PatoVillarroel;
import java.util.*;

public class Ejercicio5 {
    public void desarrollar() {
        
        System.out.println ("\n*************\nEJERCICIO 5");
        System.out.println ("Mostrar impares del 1 al 100 y cuantos impares son\n************\n");
    
        int num = 1;
        int count = 0;
        while (num <= 100) {
            if (num % 2 > 0) {
                System.out.print(num+", ");
                count++;
            }
            num++;
        }
        System.out.println("\nSon "+count+" numeros impares");
    }
}