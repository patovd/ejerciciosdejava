package PatoVillarroel;
import java.util.*;

public class EjercicioA3 {
    public void desarrollar() {
        
        System.out.println ("\n*************\nEJERCICIO ARRAY 3");
        System.out.println ("Leer 10 nums enteros. Mostrarlos en este orde: primero, ultimo, segundo, penultimo...\n************\n");
        
        int array[] = new int[10];
        int sumaPos = 0;
        int sumaNeg = 0;
        int pos = 0;
        int neg = 0;
        int ceros = 0;
        float promPos, promNeg;
        
        Scanner entrada = new Scanner(System.in);
        
        for (int num = 0; num < 10; num++) {
            System.out.print("Ingresa un número: ");
            array[num] = entrada.nextInt();
        }
        
        System.out.print("Los numeros que ingresaste son:\n");
        
        int reverse = 9;
        for (int num = 0; num < 5; num++) {
            System.out.print(array[num]+", ");
            System.out.print(array[reverse]+", ");
            reverse--;
        }
        System.out.print("\n");
    } 
}