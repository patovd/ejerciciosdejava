package PatoVillarroel;
import java.util.*;

public class Ejercicio17 {
    public void desarrollar() {
        
        System.out.println ("\n*************\nEJERCICIO 17");
        System.out.println ("Determinar dias de diferencia entre dos fechas, suponer 30 meses\n************\n");
    
        String fecha1;
        String fecha2;
        int dias, difDias, difMeses, difAños = 0;
        Scanner entrada = new Scanner(System.in);
        
        // PEDIR PRIMERA FECHA
        System.out.println ("Ingresa la fecha más actual (DD/MM/AAAA)");
        fecha1 = entrada.nextLine();
        
        String[] partesFecha1 = fecha1.split("/"); // crear array dividiendo la fecha en sus componentes
        
        int dia1 = Integer.parseInt(partesFecha1[0]); // Convertir String en Int
        int mes1 = Integer.parseInt(partesFecha1[1]); // Convertir String en Int
        int año1 = Integer.parseInt(partesFecha1[2]); // Convertir String en Int
        
        if (dia1 < 1 || dia1 > 30)  System.out.println ("\nLa fecha "+dia1+"/"+mes1+"/"+año1+" no es válida y no se puede comparar");
        else if (mes1 < 1 || mes1 > 12) System.out.println ("\nLa fecha "+dia1+"/"+mes1+"/"+año1+" no es válida y no se puede comparar");
        else if (año1 < 0)  System.out.println ("\nLa fecha "+dia1+"/"+mes1+"/"+año1+" no es válida y no se puede comparar");
        else {
 
            // PEDIR SEGUNDA FECHA
            System.out.println ("Ingresa la fecha más antigua (DD/MM/AAAA)");
            fecha2 = entrada.nextLine();

            String[] partesFecha2 = fecha2.split("/"); // crear array dividiendo la fecha en sus componentes

            int dia2 = Integer.parseInt(partesFecha2[0]); // Convertir String en Int
            int mes2 = Integer.parseInt(partesFecha2[1]); // Convertir String en Int
            int año2 = Integer.parseInt(partesFecha2[2]); // Convertir String en Int

            if (dia2 < 1 || dia2 > 30)  System.out.println ("\nLa fecha "+dia2+"/"+mes2+"/"+año2+" no es válida y no se puede comparar");
            else if (mes2 < 1 || mes2 > 12) System.out.println ("\nLa fecha "+dia2+"/"+mes2+"/"+año2+" no es válida y no se puede comparar");
            else if (año2 < 0)  System.out.println ("\nLa fecha "+dia2+"/"+mes2+"/"+año2+" no es válida y no se puede comparar");
            else {
                
                // COMPARAR FECHAS
                difAños = (año1 - año2) * 360;
                difMeses = (mes1 - mes2) * 30;
                difDias = (dia1 - dia2);
                
                dias = difDias + difMeses + difAños;
                
                System.out.println ("Hay "+dias+" de diferencia entre ambas fechas");
 
            }
        }

    }
}