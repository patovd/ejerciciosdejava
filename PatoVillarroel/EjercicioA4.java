package PatoVillarroel;
import java.util.*;

public class EjercicioA4 {
    public void desarrollar() {
        
        System.out.println ("\n*************\nEJERCICIO ARRAY 4");
        System.out.println ("Leer 2 arrays de 10 nums enteros. Mezclarlos en una tercera de la forma: 1 de A, 1 de B, 2 de A, 2 de B...\n************\n");
        
        int A[] = new int[10];
        int B[] = new int[10];
        int C[] = new int[20];
        int pos = 0;
        
        Scanner entrada = new Scanner(System.in);
        
        for (int num = 0; num < 10; num++) {
            System.out.print("Ingresa un número para A: ");
            A[num] = entrada.nextInt();
        }
        
        for (int num = 0; num < 10; num++) {
            System.out.print("Ingresa un número para B: ");
            B[num] = entrada.nextInt();
        }
        
        for (int num = 0; num < 10; num++) {
            C[pos] = A[num];
            pos++;
            C[pos] = B[num];
            pos++;
        }
        
        System.out.print("Los numeros que ingresaste son:\n");
        
        for (int num = 0; num < 19; num++) {
            System.out.print(C[num]+", ");
        }
            System.out.print(C[19]+"\n");
    } 
}