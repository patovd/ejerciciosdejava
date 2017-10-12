package PatoVillarroel;
import java.util.*;

public class Ejercicio16 {
    public void desarrollar() {
        
        System.out.println ("\n*************\nEJERCICIO 16");
        System.out.println ("Validar fecha ingresada (asumiendo meses de 30 dias)\n************\n");
        
        int dia;
        int mes;
        int año;
        boolean bien = true;
        Scanner entrada = new Scanner(System.in);
        
        System.out.print ("Ingresa el día: ");
        dia = entrada.nextInt();
        if (dia < 1 || dia > 30) {
            System.out.println ("¿De verdad existe el dia "+dia+"?"); 
            bien = false;
        }
  
        System.out.print ("Ingresa el mes: ");
        mes = entrada.nextInt();
        if (mes < 1 || mes > 12) {
            System.out.println ("Mmm... como que ese mes no existe...");  
            bien = false;
        }
        
        System.out.print ("Ingresa el año: ");
        año = entrada.nextInt();
        
        // obtener año actual
        Calendar cal= Calendar.getInstance(); 
        int year= cal.get(Calendar.YEAR); 
                
        if (año > year) {
            System.out.println ("Aún no llegamos al año "+año);
            bien = false;
        }
        else if (año < 0) {
            System.out.println ("En nuestra era no tenemos años negativos");
            bien = false;
        }

        if (bien == true) {
            System.out.println ("\nLa fecha "+dia+"/"+mes+"/"+año+" es correcta");  
        }
        else {
            System.out.println ("\nLa fecha "+dia+"/"+mes+"/"+año+" no es válida");
        }
        
    }
}