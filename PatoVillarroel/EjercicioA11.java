package PatoVillarroel;
import java.util.*;

public class EjercicioA11 {
    public void desarrollar() {
        
        System.out.println ("\n*************\nEJERCICIO ARRAY 11");
        System.out.println ("Gestionar notas de un centro. Cada clase tiene 5 alumnos. Leer las notas de cada trimestre de una clase.");
        System.out.println ("Mostrar al final la nota media del grupo por trimestre, y la media del alumno que se encuentre en la pos N (que se lee por teclado)\n************\n");
   
        float $clase[][] = new float[5][3]; // Defino un Array de 2 DIMENSIONES!
        int $a = 0; 
        int $n = 0;
        String $notas;
        float $sumaProm = 0;
        
        System.out.println("Ingresa los promedios timestrales de cada alumno separados por - ");
        System.out.println("Ejemplo: 6.8/5.2/4.7 (el punto es decimal)\n");
        
        Scanner $entrada = new Scanner(System.in);
        
        for (int $i = 0; $i < $clase.length; $i++) {
            int $alumno = $i+1; // variable temporal para ajustar a la posición del array
            System.out.print("Ingresa las notas para el "+$alumno+"º alumno: ");
            
            $notas = $entrada.nextLine(); // aqui guardamos el dato ingresado por teclado, que es String
            
            String $partesNotas[] = $notas.split("-"); // crear un array temporal para dividir el dato en sus componentes
            
            // asignar las notas a su trimestre respectivo (siguen siendo string)
            String $t1 = $partesNotas[0]; 
            String $t2 = $partesNotas[1];
            String $t3 = $partesNotas[2]; 
           
            // convertimos los string en números
            float $trim1 = Float.parseFloat($t1); 
            float $trim2 = Float.parseFloat($t2); 
            float $trim3 = Float.parseFloat($t3); 
            
            // asignar notas al array principal $clase /* creo que se puede hacer mejor esta parte */
            $clase[$i][0] = $trim1;
            $clase[$i][1] = $trim2;
            $clase[$i][2] = $trim3;
        }
        
        System.out.print("¿De cual de los 5 alumnos quieres saber el promedio?: ");
        int $cual = $entrada.nextInt();
        
        for (int $i = 0; $i < $clase[$i].length; $i++) {  
            for (int $r = 0; $r < $clase.length; $r++) {         
                $sumaProm = $sumaProm + $clase[$r][$i]; // Suma para calcular el promedio
            }
            float $prom = $sumaProm / $clase.length; // saco el promedio de cada trimestre
            int $cualTrim = $i+1;
            System.out.println("El promedio del "+$cualTrim+"º trimestre es: "+$prom);
            
            $sumaProm = 0; // resetar la suma
        }
        
        System.out.println("************");
        
        for (int $i = 0; $i < $clase[$i].length; $i++) { 
            int $alumno = $cual - 1; // variable temporal para ajustar al indice del array
            $sumaProm = $sumaProm + $clase[$alumno][$i]; // Suma para calcular el promedio
        }
        int $alumno = $cual - 1;
        float $prom = $sumaProm / $clase[$alumno].length; // saco el promedio de cada trimestre
        System.out.println("El promedio del "+$cual+"º alumno es: "+$prom);
        
    }
}
