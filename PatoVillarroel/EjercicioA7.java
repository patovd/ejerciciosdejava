package PatoVillarroel;
import java.util.*;

public class EjercicioA7 {
    public void desarrollar() {
        
        System.out.println ("\n*************\nEJERCICIO ARRAY 6");
        System.out.println ("Diseñar una app que declare una tabla de 10 elementos enteros y desplace una posición hacia abajo: el primero pasa a ser el segundo, el 2º el 3º y el ultimo para a ser el primero\n************\n");
        
        int tabla[] = new int[10];
        int tablaBackup[] = new int[10];
        int pos;
        
        Scanner entrada = new Scanner(System.in);
        
        for (int num = 0; num < 10; num++) {
            System.out.print("Ingresa un número: ");
            tabla[num] = entrada.nextInt();
            tablaBackup[num] = tabla[num];
        }
        
        System.out.print("Indica cuantos movimientos deben correrse los numeros: ");
        pos = entrada.nextInt();
        pos = pos - 1;
        
        for (int num = 0; num < tabla.length; num++) {            
            if (num < tabla.length-pos) {
                int c = num + pos;
                //System.out.println(c+" = "+num);
                tabla[c] = tablaBackup[num];
            }
            else {
                tabla[num-10+pos] = tablaBackup[num];
            }
        }
        
        System.out.print("Nos numeros quedaron así:\n");
        
        for (int num = 0; num < 9; num++) {
            System.out.print(tabla[num]+", ");
        }
            System.out.print(tabla[9]+"\n");
    }
}
