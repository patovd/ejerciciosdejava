package PatoVillarroel;
import java.util.*;

public class Ejercicio2 {
    public void desarrollar() {
        
        System.out.println ("\n*************\nEJERCICIO 2");
        System.out.println ("Pedir 3 números, si el primero es negativo, devolver producto de los 3, sino, la suma\n************\n");
        
        float n1;
        float n2;
        float n3;
        float op;
        Scanner take = new Scanner(System.in);
        
        System.out.println ("Ingresa el primer numero");
        n1 = take.nextFloat();
        System.out.println ("Ingresa el segundo numero");
        n2 = take.nextFloat();
        System.out.println ("Ingresa el tecer numero");
        n3 = take.nextFloat();
        
        if (n1 < 0) {
            op = n1 * n2 * n3;
            System.out.println ("El producto es "+op);
        }
        else {
            op = n1 * n2 + n3;
            System.out.println ("La suma es "+op);
        }
        
    }
}
    
