package PatoVillarroel;
import java.util.*;

public class Ejercicio25 {
    public void desarrollar() {
        
        System.out.println ("\n*************\nEJERCICIO 25");
        System.out.println ("Mostar todos los numeros desde 100 al 0 de 7 en 7\n************\n");
        
        int num;
        String text = "";
        
        for (num=100; num >= 0; num = num -7) {
            text += num+", ";
        }    
        text = text.substring(0,text.length()-2); // quitar los dos ultimos caracteres
        System.out.print(text+"\n");  
    }
}