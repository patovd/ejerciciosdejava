package PatoVillarroel;
import java.util.*;

public class Ejercicio30 {
    public void desarrollar() {
        
        System.out.println ("\n*************\nEJERCICIO 30");
        System.out.println ("Pedir 10 num y decir si hay algun negativo\n************\n");
        
        boolean hay = false;
        int num;
        int i = 1;
        
        Scanner entrada = new Scanner(System.in);
        
        while (i <= 10) {
            System.out.print("Ingresa el "+i+"º número: ");
            num = entrada.nextInt();
            
            if (num < 0) hay = true;
            
            i++;
        }
        
        if (hay == true) {
            System.out.println("Ingresaste al menos un número negativo");
        }
        else {
            System.out.println("No ingresaste negativos");
        }
        
    }
}
