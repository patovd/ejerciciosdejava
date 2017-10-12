package PatoVillarroel;
import java.util.*;

public class Ejercicio9 {
    public void desarrollar() {
        
        System.out.println ("\n*************\nEJERCICIO 9");
        System.out.println ("Leer nombre y saludar con hola nombre\n************\n");
    
        String name;
        Scanner take = new Scanner(System.in);
        
        System.out.println ("Ingresa tu nombre");
        name = take.nextLine();
        
        System.out.println ("¡Hola "+name+"!");
    }
}