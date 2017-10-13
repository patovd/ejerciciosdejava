package PatoVillarroel;
import java.util.*;

public class EjercicioA10 {
    public void desarrollar() {
        
        System.out.println ("\n*************\nEJERCICIO ARRAY 10");
        System.out.println ("Leer 10 enteros. Guardar en otra tabla los elementos pares de la primera y luego los impares\n************\n");
        
        int tabla[] = new int[10];
        int tabla2[] = new int[10];        
        int c = 0;
        
        Scanner entrada = new Scanner(System.in);
        
        for (int i = 0; i < tabla.length; i++) {
            System.out.print("Ingresa un número: ");
            tabla[i] = entrada.nextInt();
        }
        

        for (int i = 0; i < tabla.length; i++) {            
            if (tabla[i] % 2 == 0) {
                tabla2[c] = tabla[i];
                c++;
            }
        }
        
        for (int i = 0; i < tabla.length; i++) {            
            if (tabla[i] % 2 > 0) {
                tabla2[c] = tabla[i];
                c++;
            }
        }
        
        System.out.print("Nos numeros quedaron así:\n");
        
        for (int i = 0; i < tabla2.length-1; i++) {
            System.out.print(tabla2[i]+", ");
        }
        
        int last = tabla2.length-1;
        System.out.print(tabla2[last]+"\n");
    }
}
