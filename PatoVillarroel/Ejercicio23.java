package PatoVillarroel;
import java.util.*;

public class Ejercicio23 {
    public void desarrollar() {
        
        System.out.println ("\n*************\nEJERCICIO 23");
        System.out.println ("Juego para adivinar un numero, pedir N y luego pedir numeros indicando mayor o menor segun sea mayor o menos respecto a N\n************\n");
     
        int guess = (int) Math.floor(Math.random() * (100 - 1)) + 1;
        int num;
        int in = 1;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("¡Adivina el numero que estoy pensando entre 1 y 100!");
        
        do {
            System.out.print("Inténtalo: ");
            num = entrada.nextInt();
            if (num > guess) {
                System.out.println("Frío frío... el numero es menor a "+num);
                in++;
            }
            else if (num < guess) {
                System.out.println("Frío frío... el numero es mayor a " + num);
                in++;
            }
            else {
                System.out.println("¡BIEN!, el número era "+guess);
                System.out.println("Lo adivinaste en "+in+" intentos");
            }
        }
        while (num != guess);
     
        
    }
}
