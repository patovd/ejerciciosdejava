package PatoVillarroel;
import java.util.*;

public class Ejercicio13 {
    public void desarrollar() {
        
        System.out.println ("\n*************\nEJERCICIO 13");
        System.out.println ("Pedir dos numeros y decir si son mutiplos uno del otro\n************\n");
        
        int n1;
        int n2;
        Scanner take = new Scanner(System.in);
        
        System.out.println ("Ingresa un numero");
        n1 = take.nextInt();
        System.out.println ("Ingresa un segundo numero");
        n2 = take.nextInt();
        
        if (n1 % n2 == 0 && n2 % n1 == 0) System.out.println("Ambos numeros son multiplos del otro");
        else {
            if (n1 % n2 == 0 && n2 % n1 != 0) System.out.println(n1+" es multiplo de "+n2+" pero no al revés");
            else {
            if (n1 % n2 != 0 && n2 % n1 == 0) System.out.println(n2+" es multiplo de "+n1+" pero no al revés");
            else System.out.println(":( ningún numero es multiplo de otro");
            }
        }
    
        
    }
}