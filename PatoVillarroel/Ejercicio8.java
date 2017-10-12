package PatoVillarroel;
import java.util.*;

public class Ejercicio8 {
    public void desarrollar() {
        
        System.out.println ("\n*************\nEJERCICIO 8");
        System.out.println ("Leer numero y decir si es multiplo de 10\n************\n");
    
        int num;
        Scanner take = new Scanner(System.in);
        
        System.out.println ("Ingresa un numero");
        num = take.nextInt();
        
        if (num % 10 == 0) {
            System.out.println("El número "+num+" es multiplo de 10");
        }
        else {
            System.out.println(":( El número "+num+" no es multiplo de 10");
        }
        
    }
}