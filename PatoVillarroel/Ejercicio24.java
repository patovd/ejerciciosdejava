package PatoVillarroel;
import java.util.*;

public class Ejercicio24 {
    public void desarrollar() {
        
        System.out.println ("\n*************\nEJERCICIO 24");
        System.out.println ("Pedir un numero N y mostrarlos todos del 1 al N\n************\n");
        
        int num;
        int number;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Ingrese un numero mayor a 0: ");
        number =  entrada.nextInt();
        
        if (number > 0) {
            for (num=1; num < number; num++) {
                System.out.print(num+", ");
            }            
           System.out.println(number);
        }
        else {
            System.out.println("El número está fuera de rango");
        }
       
     
        
    }
}
