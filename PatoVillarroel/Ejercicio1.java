package PatoVillarroel;
import java.util.*;

public class Ejercicio1 {
    public void desarrollar() {
        
        System.out.println ("\n*************\nEJERCICIO 1");
        System.out.println ("Ingresar nota y saber si estudiante está aprobado o reprobado\n************\n");
        
        int cal;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println ("Ingresa tu nota:");
        cal = entrada.nextInt();
                
        if (cal >= 4 && cal <= 7) {
            System.out.println ("¡Estás aprobado!");
        }
        else if (cal < 4) {
            System.out.println (":( Estás reprobado");  
        }
        else {
            System.out.println ("Tu nota está fuera de rango");  
        }
    }  
}
