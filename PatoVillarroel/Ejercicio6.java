package PatoVillarroel;
import java.util.*;

public class Ejercicio6 {
    public void desarrollar() {
        
        System.out.println ("\n*************\nEJERCICIO 6");
        System.out.println ("Sumar numeros del 1 al 100\n************\n");
    
        int num = 1;
        int suma = 0;
        while (num <= 100) {
            suma = suma + num;
            num++;
        }
        System.out.println("La suma del 1 al 100 es "+suma);
    }
}