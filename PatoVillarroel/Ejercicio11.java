package PatoVillarroel;
import java.util.*;

public class Ejercicio11 {
    public void desarrollar() {
        
        System.out.println ("\n*************\nEJERCICIO 11");
        System.out.println ("Transformar ºC a ºF  \n************\n");
    
        int c;
        float f;
        Scanner take = new Scanner(System.in);
        
        System.out.println ("Ingresa la Tº en ºC");
        c = take.nextInt();
        f = ((9*c)/5)+32;
        System.out.println ("Esos son "+f+"º Fahrenheit");
        
    }
}