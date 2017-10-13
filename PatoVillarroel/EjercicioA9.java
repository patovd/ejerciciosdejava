package PatoVillarroel;
import java.util.*;

public class EjercicioA9 {
    public void desarrollar() {
        
        System.out.println ("\n*************\nEJERCICIO ARRAY 9");
        System.out.println ("Leer por teclado un array de 10 enteros, luego pedir posición y eliminar esa sin dejar huecos\n************\n");
        
        int tabla[] = new int[10];
        int pos;
        
        Scanner entrada = new Scanner(System.in);
        
        for (int i = 0; i < tabla.length; i++) {
            System.out.print("Ingresa un número: ");
            tabla[i] = entrada.nextInt();
        }
        
        System.out.print("\nIndica una posición a borrar: ");
        pos = entrada.nextInt();
        pos = pos -1;

        for (int i = 0; i < tabla.length; i++) {            
            if (i >= pos && i < tabla.length-1) {
                tabla[i] = tabla[i+1];
            }
        }
        
        System.out.print("Nos numeros quedaron así:\n");
        
        for (int i = 0; i < tabla.length-2; i++) {
            System.out.print(tabla[i]+", ");
        }
        
        int last = tabla.length-2;
        System.out.print(tabla[last]+"\n");
    }
}
