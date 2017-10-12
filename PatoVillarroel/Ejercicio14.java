package PatoVillarroel;
import java.util.*;

public class Ejercicio14 {
    public void desarrollar() {
        
        System.out.println ("\n*************\nEJERCICIO 14");
        System.out.println ("Obtener los digitos de un numero\n************\n");
        
        String num;
        int n;
        Scanner take = new Scanner(System.in);
        
        System.out.println ("Ingresa un numero");
        num = take.nextLine();
        
        String m = num.replace(".", "");
        m = m.replace("-", "");
        n = String.valueOf(m).length();
       
        System.out.println ("El numero "+num+" tiene "+n+" digitos");
    
        
    }
}