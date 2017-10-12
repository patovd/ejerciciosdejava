
package PatoVillarroel;

/**
 *
 * @author Patricio Villarroel
 */

import java.util.*;

public class PatoVillarroel {

    public static void main(String[] args) {
        
        String ex;
        
        do {
            
            System.out.println("Indica el Nº del ejercicio para entrar.\nPresiona x para salir");
            Scanner opcion = new Scanner(System.in);
            ex = opcion.nextLine();
 
            switch (ex){

                case "1":
                    Ejercicio1 ejercicio1 = new Ejercicio1();
                    ejercicio1.desarrollar();
                    break;

                case "2":
                    Ejercicio2 ejercicio2 = new Ejercicio2();
                    ejercicio2.desarrollar();
                    break;

                case "3":
                    Ejercicio3 ejercicio3 = new Ejercicio3();
                    ejercicio3.desarrollar();
                    break;

                case "4":
                    Ejercicio4 ejercicio4 = new Ejercicio4();
                    ejercicio4.desarrollar();
                    break;

                case "5":
                    Ejercicio5 ejercicio5 = new Ejercicio5();
                    ejercicio5.desarrollar();
                    break;

                case "6":
                    Ejercicio6 ejercicio6 = new Ejercicio6();
                    ejercicio6.desarrollar();
                    break;

                case "7":
                    Ejercicio7 ejercicio7 = new Ejercicio7();
                    ejercicio7.desarrollar();
                    break;

                case "8":
                    Ejercicio8 ejercicio8 = new Ejercicio8();
                    ejercicio8.desarrollar();
                    break;

                case "9":
                    Ejercicio9 ejercicio9 = new Ejercicio9();
                    ejercicio9.desarrollar();
                    break;

                case "10":
                    Ejercicio10 ejercicio10 = new Ejercicio10();
                    ejercicio10.desarrollar();
                    break;

                case "11":
                    Ejercicio11 ejercicio11 = new Ejercicio11();
                    ejercicio11.desarrollar();
                    break;

                case "12":
                    Ejercicio12 ejercicio12 = new Ejercicio12();
                    ejercicio12.desarrollar();
                    break;

                case "13":
                    Ejercicio13 ejercicio13 = new Ejercicio13();
                    ejercicio13.desarrollar();
                    break;

                case "14":
                    Ejercicio14 ejercicio14 = new Ejercicio14();
                    ejercicio14.desarrollar();
                    break;

                case "15":
                    Ejercicio15 ejercicio15 = new Ejercicio15();
                    ejercicio15.desarrollar();
                    break;

                case "16":
                    Ejercicio16 ejercicio16 = new Ejercicio16();
                    ejercicio16.desarrollar();
                    break;

                case "17":
                    Ejercicio17 ejercicio17 = new Ejercicio17();
                    ejercicio17.desarrollar();
                    break;

                case "18":
                    Ejercicio18 ejercicio18 = new Ejercicio18();
                    ejercicio18.desarrollar();
                    break;

                case "19":
                    Ejercicio19 ejercicio19 = new Ejercicio19();
                    ejercicio19.desarrollar();
                    break;

                case "23":
                    Ejercicio23 ejercicio23 = new Ejercicio23();
                    ejercicio23.desarrollar();
                    break;

                case "24":
                    Ejercicio24 ejercicio24 = new Ejercicio24();
                    ejercicio24.desarrollar();
                    break;

                case "25":
                    Ejercicio25 ejercicio25 = new Ejercicio25();
                    ejercicio25.desarrollar();
                    break;

                case "26":
                    Ejercicio26 ejercicio26 = new Ejercicio26();
                    ejercicio26.desarrollar();
                    break;

                case "27":
                    Ejercicio27 ejercicio27 = new Ejercicio27();
                    ejercicio27.desarrollar();
                    break;
                    
                case "28":
                    Ejercicio28 ejercicio28 = new Ejercicio28();
                    ejercicio28.desarrollar();
                    break;
                    
                case "29":
                    Ejercicio29 ejercicio29 = new Ejercicio29();
                    ejercicio29.desarrollar();
                    break;
                
                case "30":
                    Ejercicio30 ejercicio30 = new Ejercicio30();
                    ejercicio30.desarrollar();
                    break;
                    
                case "31":
                    Ejercicio31 ejercicio31 = new Ejercicio31();
                    ejercicio31.desarrollar();
                    break;
                    
                case "a1":
                    EjercicioA1 ejercicioA1 = new EjercicioA1();
                    ejercicioA1.desarrollar();
                    break;
                
                case "a2":
                    EjercicioA2 ejercicioA2 = new EjercicioA2();
                    ejercicioA2.desarrollar();
                    break;
                    
                 case "a3":
                    EjercicioA3 ejercicioA3 = new EjercicioA3();
                    ejercicioA3.desarrollar();
                    break;
                    
                 case "a4":
                    EjercicioA4 ejercicioA4 = new EjercicioA4();
                    ejercicioA4.desarrollar();
                    break;
                    
                 case "a5":
                    EjercicioA5 ejercicioA5 = new EjercicioA5();
                    ejercicioA5.desarrollar();
                    break;
                      
                 case "a6":
                    EjercicioA6 ejercicioA6 = new EjercicioA6();
                    ejercicioA6.desarrollar();
                    break;
                
                case "a7":
                    EjercicioA7 ejercicioA7 = new EjercicioA7();
                    ejercicioA7.desarrollar();
                    break;

                default:
                    System.out.println("No existe ese ejercicio");
                    break;
            }
        }
        while (ex == "x" || ex == "X");
    }   
}