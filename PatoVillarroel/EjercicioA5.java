package PatoVillarroel;
import java.util.*;

public class EjercicioA5 {
    public void desarrollar() {
        
        System.out.println ("\n*************\nEJERCICIO ARRAY 5");
        System.out.println ("Diseñar una app que declare una tabla de 10 elementos enteros. Leer por teclado 8 numeros. Luego pedir un numero y una posición e insertarlo en la posición indicada, desplazando los que estén atrás\n************\n");
        
        int tabla[] = new int[10];
        int tablaBackup[] = new int[10];
        int nueve;
        int pos;
        
        Scanner entrada = new Scanner(System.in);
        
        for (int num = 0; num < 8; num++) {
            System.out.print("Ingresa un número: ");
            tabla[num] = entrada.nextInt();
            tablaBackup[num] = tabla[num];
        }
        
        System.out.print("Ingresaste 8 nums. Ingresa un numero a reubicar: ");
        nueve = entrada.nextInt();
        
        System.out.print("¿En qué posición deseas poner el "+nueve+"?: ");
        pos = entrada.nextInt() - 1; // . 1 porque el array parte en 0, o sea la pos 1 es el indice 0
        
        for (int num = 0; num < 10; num++) {
            if (num == pos) {
                tabla[num] = nueve;
            }
            else if (num > pos) {
                tabla[num] = tablaBackup[num-1];
            }
        }
        
        System.out.print("Nos numeros quedaron así:\n");
        
        for (int num = 0; num < 9; num++) {
            System.out.print(tabla[num]+", ");
        }
            System.out.print(tabla[9]+"\n");
    }
}
