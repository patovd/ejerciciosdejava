package PatoVillarroel;
import java.util.*;

public class Ejercicio29 {
    public void desarrollar() {
        
        System.out.println ("\n*************\nEJERCICIO 29");
        System.out.println ("Pedir un num, introducir num sueldos y mostrar el sueldo máximo\n************\n");
        
        int num;
        int s = 0;
        int sueldo;
        int sueldomaximo = 0;
    
        Scanner entrada = new Scanner(System.in);
        
        System.out.println ("¿Cuantos sueldos quieres ingresar?");
        num = entrada.nextInt();
        
        int[] sueldos = new int[num]; // DECLARAR ARRAY
        
        while (s < num) {
            System.out.print ("Ingresa un sueldo:");
            sueldo = entrada.nextInt();
            sueldos[s] = sueldo;  
            sueldomaximo = sueldos[0];      
            s++;
        }
        
        for (int i=0; i<sueldos.length; i++) {
            if (sueldomaximo < sueldos[i]) {
                sueldomaximo = sueldos[i];
            }
        }
        
        System.out.println ("El sueldo máximo es "+sueldomaximo);
        
    }
}
