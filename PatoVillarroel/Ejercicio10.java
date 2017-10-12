package PatoVillarroel;
import java.util.*;

public class Ejercicio10 {
    public void desarrollar() {
        
        System.out.println ("\n*************\nEJERCICIO 10");
        System.out.println ("leer nombre persona, mostrar por pantalla, luego leer radio de circunferencia (double) y mostrar longitud, ademas leer entero y mostrar su cuadrado\n************\n");
    
        String name;
        double r;
        double l;
        int num;
        double sq;
        
        Scanner take = new Scanner(System.in);
        
        System.out.println ("Ingresa tu nombre");
        name = take.nextLine();
        System.out.println ("¡Hola "+name+"!");
        
        System.out.println ("Ingresa el radio de la circunferencia");
        r = take.nextDouble();
        l = 2 * Math.PI * r;
        System.out.println ("La lomgitud de la circunferencia es "+l);
        
        System.out.println ("Ingresa un numero entero cualquiera");
        num = take.nextInt();
        //double dnum = (double) num;
        sq = Math.pow(num,2);
        System.out.println ("El cuadrado de "+num+" es  "+sq);
        
    }
}