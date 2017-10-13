package PatoVillarroel;
import java.util.*;

public class EjercicioA8 {
    public void desarrollar() {
        
        System.out.println ("\n*************\nEJERCICIO ARRAY 8");
        System.out.println ("Leer 5 nums de forma ordenada y creciente, guardarlos en un array, leer N e insertarlo ordenado para que el array siga ordenado\n************\n");
        
        int tabla[] = new int[5];
        int tabla2[] = new int[6];
        int num;
        
        Scanner entrada = new Scanner(System.in);
        
        for (int i = 0; i < tabla.length; i++) {
            System.out.print("Ingresa un número: ");
            tabla[i] = entrada.nextInt();
            tabla2[i] = tabla[i];
        }
        
        System.out.print("\nIndica un numero menor para meter en la lista anterior: ");
        num = entrada.nextInt();
        
        int c = 0;
        for (int i = 0; i < tabla.length; i++) {            
            if (tabla[i] > num) {
                if (c == 0) {
                    tabla2[i] = num;
                    c = 1;
                }
                tabla2[i+1] = tabla[i];
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
