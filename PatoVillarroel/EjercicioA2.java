package PatoVillarroel;
import java.util.*;

public class EjercicioA2 {
    public void desarrollar() {
        
        System.out.println ("\n*************\nEJERCICIO ARRAY 2");
        System.out.println ("Leer 5 números sacar promedio de positivos, negativos y cuantos ceros\n************\n");
        
        int array[] = new int[5];
        int sumaPos = 0;
        int sumaNeg = 0;
        int pos = 0;
        int neg = 0;
        int ceros = 0;
        float promPos, promNeg;
        
        Scanner entrada = new Scanner(System.in);
        
        for (int num = 0; num < 5; num++) {
            System.out.print("Ingresa un número:");
            array[num] = entrada.nextInt();
            if (array[num] > 0) {
                sumaPos = sumaPos + array[num];
                pos = pos + 1;
            }
            else if (array[num] < 0) {
                sumaNeg = sumaNeg + array[num];
                neg = neg + 1;
            }
            else if (array[num] == 0) ceros = ceros + 1;
        }
        
        if (pos != 0) { // hacer vaidación para no hacer division por cero
            promPos = sumaPos / pos;
        } 
        else {
            promPos = 0;
        }
        
        if (neg != 0) { // hacer vaidación para no hacer division por cero
            promNeg = sumaNeg / neg;
        } 
        else {
            promNeg = 0;
        }
                
        System.out.println("El promedio de positivos es: "+promPos);
        System.out.println("El promedio de negativos es: "+promNeg);
        System.out.println("El total de ceros es: "+ceros);
        
  
    }
   
}