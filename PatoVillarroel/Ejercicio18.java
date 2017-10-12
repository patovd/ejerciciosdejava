package PatoVillarroel;
import java.util.*;

public class Ejercicio18 {
    public void desarrollar() {
        
        System.out.println ("\n*************\nEJERCICIO 18");
        System.out.println ("Pedir nota entre 0 y 10 y mostrar numero como palabra\n************\n");
        
        int num;
        int number;
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Ingrese un numero entre 0 y 10: ");
        number =  entrada.nextInt();
        
        if (number >= 0 && number <= 10) {
            switch (number) {
                
                case 0: 
                    System.out.println("Cero");
                    break;
                     
                case 1: 
                    System.out.println("Uno");
                    break;
                     
                case 2: 
                    System.out.println("Dos");
                    break;
                     
                case 3: 
                    System.out.println("Tres");
                    break;
                     
                case 4: 
                    System.out.println("Cuatro");
                    break;
                     
                case 5: 
                    System.out.println("Cinco");
                    break;
                     
                case 6: 
                    System.out.println("Seis");
                    break;
                     
                case 7: 
                    System.out.println("Siete");
                    break;
                     
                case 8: 
                    System.out.println("Ocho");
                    break;
                     
                case 9: 
                    System.out.println("Nueve");
                    break;
                     
                case 10: 
                    System.out.println("Diez");
                    break;
                         
            }
        }
        else {
            System.out.println("Numero fuera de rango");
        }
    }
    
}
