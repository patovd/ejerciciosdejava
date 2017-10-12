package PatoVillarroel;
import java.util.*;

public class EjercicioA1 {
    public void desarrollar() {
        
        System.out.println ("\n*************\nEJERCICIO ARRAY 1");
        System.out.println ("Leer 5 números y mostrarlos en el mismo orden introducido\n************\n");
        
        int array[] = new int[5];
        
        Scanner entrada = new Scanner(System.in);
        
        for (int num = 0; num < 5; num++) {
            System.out.print("Ingresa un número:");
            array[num] = entrada.nextInt();
        }
        
        System.out.print("Los numeros que ingresaste son: ");
        
        for (int num = 0; num < 4; num++) {
            System.out.print(array[num]+", ");
        }
            System.out.print(array[4]+"\n");
  
    }
   
}

