package PatoVillarroel;
import java.util.*;

public class Ejercicio19 {
    public void desarrollar() {
        
        System.out.println ("\n*************\nEJERCICIO 19");
        System.out.println ("Ingresar numero entre 0 a 999 y devolver numero como palabra\n************\n");
        
        int number;
        String textNumber;
        String u = "0";
        String d  = "0";
        String c = "0";
        String unidades[] = {"cero","uno", "dos", "tres", "cuatro", "cinco", "seis", "siete", "ocho", "nueve"};
        String decenas[] = {"","dieci", "veinti", "treinta", "cuarenta", "cincuenta", "sesenta", "setenta", "ochenta", "noventa"};
        String centenas[] = {"","ciento", "doscientos", "trecientos", "cuatrocientos", "quinientos", "seicientos", "setecientos", "ochocientos", "novecientos"};
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("ingrese un número de 0 a 999");
        number = entrada.nextInt();
        
        if (number >= 0 && number <= 999) {
            
            textNumber = Integer.toString(number); // convertir numero en string
           
            int n = String.valueOf(textNumber).length(); // contar cuantos digitos
            
            if (n == 1) {  // si solo hay un digito
                u = textNumber.substring(0,1); // definir la unidad
            } 
            if (n == 2) {
                d = textNumber.substring(0,1); // definir la decena
                u = textNumber.substring(1,2); // definir la unidad
            } 
            if (n == 3) {
                c = textNumber.substring(0,1); // definir la centena
                d = textNumber.substring(1,2); // definir la decena
                u = textNumber.substring(2,3); // definir la unidad
            } 
            
            int unidad = Integer.parseInt(u); // Convertir String en Int
            int decena = Integer.parseInt(d); // Convertir String en Int 
            int centena = Integer.parseInt(c); // Convertir String en Int }
            
            System.out.print("El numero es ");
            
            if (number > 100) {
                System.out.print(centenas[centena]+" ");
            }
            else if (number == 100) System.out.print("cien");
            
            if (number >= 30) {
                if (n > 2 && decena != 0) {
                    if (decena == 2 && (unidad >= 1 && unidad <= 9) || decena == 1 && (unidad >= 6 && unidad <= 9)) {
                        System.out.print(decenas[decena]);
                    }
                    else {
                        System.out.print(decenas[decena]+" ");
                    }
                }
                else if (n == 2 && decena != 0) System.out.print(decenas[decena]+" ");
                if (unidad == 0 )System.out.print("\n"); // salto de linea si el numero es multiplo de 10
            }
            else if ((number >= 21 && number <= 29) || (number > 16 && number <= 19)) {
                System.out.print(decenas[decena]);
            }
            else {
                switch (number) {
                    case 10:
                        System.out.print("diez");
                        break;                        
                    case 11:
                        System.out.print("once");
                        break;                        
                    case 12:
                        System.out.print("doce");
                        break;                        
                    case 13:
                        System.out.print("trece");
                        break;                        
                    case 14:
                        System.out.print("catorce");
                        break;                        
                    case 15:
                        System.out.print("quince");
                        break;
                }
            }
            if (decena > 2 && unidad > 0) System.out.print("y ");
            if (unidad > 0) System.out.print(unidades[unidad]+"\n");
            else if (number == 0) System.out.print("cero\n");
        
        }
        else {
            System.out.println("El número está fuera de rango");
        }
        
        
        
    }
    
}
