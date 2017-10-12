package PatoVillarroel;
import java.util.*;

public class Ejercicio12 {
    public void desarrollar() {
        
        System.out.println ("\n*************\nEJERCICIO 12");
        System.out.println ("pedir numero y decir si es positivo o negativo  \n************\n");
    
        float num;
        Scanner take = new Scanner(System.in);
        
        System.out.println ("Ingresa un numero");
        num = take.nextFloat();
        if (num == 0) {
            System.out.println ("El número "+num+" es cero");
        }
        else {
            if (num > 0) {
                System.out.println ("El número "+num+" es positivo");
            }
            else {
                System.out.println ("El número "+num+" es negativo");
            }
        }
    }
}