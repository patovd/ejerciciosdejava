package PatoVillarroel;
import java.util.*;

public class Ejercicio27 {
    public void desarrollar() {
        
        System.out.println ("\n*************\nEJERCICIO 27");
        System.out.println ("Pedir num entre 0 y 10, mostrar tabla de multiplicar de tal numero\n************\n");
        
        int tabla = 0;
        int m = 0;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println ("¿Cual tabla de multiplicar deseas ver (0 a 10)?");
        tabla = entrada.nextInt();
        
        System.out.println ("¿De que numero de multiplicaciones quieres la tabla?");
        m = entrada.nextInt();
        
        for (int p = 1; p <= m; p++) {
            int r = p * tabla;
            String e = "";
            if (p < 10) e = " ";
            System.out.println (tabla+" x "+p+e+" = "+r);
        }
    }  
}
