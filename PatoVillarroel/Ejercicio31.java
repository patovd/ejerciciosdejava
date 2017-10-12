package PatoVillarroel;
import java.util.*;

public class Ejercicio31 {
    public void desarrollar() {
        
        System.out.println ("\n*************\nEJERCICIO 31");
        System.out.println ("Dibujar un cuadrado de n elementos usando *\n************\n");
        
        int tamaño;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Indica el tamaño del cuadrado:");
        tamaño = entrada.nextInt();
        
        for (int i=0 ;i<tamaño; i++){
            for (int r=0 ;r<tamaño; r++){
                System.out.print("*  ");
            }
            System.out.print("\n");
        }
  
    }
   
}
