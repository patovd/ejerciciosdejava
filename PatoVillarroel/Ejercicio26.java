package PatoVillarroel;
import java.util.*;

public class Ejercicio26 {
    public void desarrollar() {
        
        System.out.println ("\n*************\nEJERCICIO 26");
        System.out.println ("Ingresar Edades y alturas de 5 alumnos, mostrar edad y estarura media, cantidad de alumnos mayuores de 18 y cantidad de alumnos que midan 1,75\n************\n");

        float promEdad = 0;
        float promAltura = 0;
        int adultos = 0;
        int altos = 0;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println ("Ingresa edad (años) y estatura (metros) de 5 alumnos separada por /");
        System.out.println ("Ejemplo: 23/1.82 (el punto es decimal)\n");
        
        for (int n = 1; n <= 5; n++) {
            System.out.print("Alumno "+n+": ");
            String alumno = entrada.nextLine();
            
            String[] partesAlumno = alumno.split("/"); // crear array dividiendo el dato en sus componentes
            String cedad = partesAlumno[0]; // asigno la parte de edad al array edades
            String caltura = partesAlumno[1]; // asigno la parte de altura al array alturas
            
            int edad = Integer.parseInt(cedad); // convertir edad string en edad int
            promEdad = promEdad + edad; // SUMA PARA PROMEDIO DE EDAD
            if (edad >= 18) { // cantidad de mayores de 18 años
                adultos++;
            }
            
            float altura = Float.parseFloat(caltura); // convertir altura string en edad int
            promAltura = promAltura + altura; // SUMA PARA PROMEDIO DE ALTURA
            if (altura >= 1.75) { // cantidad de mayores de 18 años
                altos++;
            }
        }
        
        promEdad = promEdad/5; // PROMEDIO DE EDAD
        promAltura = promAltura/5; // PROMEDIO DE ALTURA
        
        System.out.println ("\nDe los datos ingresados se obtiene: ");
        System.out.println ("Promedio de edad: "+promEdad+" años");
        System.out.println ("Promedio de altura: "+promAltura+" metros");
        System.out.println ("Alumnos mayores de 18 años: "+adultos);
        System.out.println ("Alumnos mayores de 1,75 m: "+altos);
    }

}
