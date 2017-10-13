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
        
        for (int i = 0; i < tabla.length; i++) {            
            if (tabla[i] > num) {
                tabla[i] = num;
            }
            else {
                tabla[num-10+pos] = tablaBackup[num];
            }
        }
        
        System.out.print("Nos numeros quedaron así:\n");
        
        for (int num = 0; num < 9; num++) {
            System.out.print(tabla[num]+", ");
        }
            System.out.print(tabla[9]+"\n");
    }
}
