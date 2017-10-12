package PatoVillarroel;
import java.util.*;

public class Ejercicio4 {
    public void desarrollar() {
        
        System.out.println ("\n*************\nEJERCICIO 4");
        System.out.println ("Leer 3 numeros distintos y nos diga cual es el mayor\n************\n");
    
        float n1;
        float n2;
        float n3;
        float op;
        Scanner take = new Scanner(System.in);
        
        System.out.println ("Ingresa el primer numero");
        n1 = take.nextFloat();
        System.out.println ("Ingresa el segundo numero");
        n2 = take.nextFloat();
        if (n1 != n2) {
            System.out.println ("Ingresa el tecer numero");
            n3 = take.nextFloat();
            
            if (n3 != n2 && n3 != n1 ) {
                if (n1 > n2 && n1 > n3)  System.out.println ("El primer numero "+n1+" es mayor");
                if (n2 > n1 && n2 > n3)  System.out.println ("El segundo numero "+n2+" es mayor");
                if (n3 > n2 && n3 > n1)  System.out.println ("El tercer numero "+n3+" es mayor");
            }
            else {
                System.out.println ("Los números deben ser distintos");
            }
        }
        else {
            System.out.println ("Los números deben ser distintos");
        }
        
    }
}