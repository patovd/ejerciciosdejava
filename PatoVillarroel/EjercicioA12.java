package PatoVillarroel;
import java.util.*;

public class EjercicioA12 {
    public void desarrollar() {
        
        System.out.println ("\n*************\nEJERCICIO ARRAY 12");
        System.out.println ("Reserva de vuelo en Aerolinea\n************\n");
        
        Scanner $entrada = new Scanner(System.in);
        int $opcion;
        String $vuelo = null;
        
        System.out.println("=================\nAEROLINEAS ALITAS\n=================\n"+
            "\nMENÚ DE OPERACIONES:\n"+
            "1. Crear Vuelo.\n" +
            "2. Realizar reserva.\n" +
            "3. Eliminar vuelo.\n" +
            "4. Revisar vuelo.\n" +
            "5. Eliminará reserva.\n" +
            "6. Salir.");
        
        do {
            System.out.print("\n----------------------------\nIndica operación: ");
            $opcion = $entrada.nextInt();

            switch($opcion) {
                
                //*************************************************************
                case 1: // CREAR VUELO
                    System.out.println("\n  > 1. CREAR NUEVO VUELO");
                    
                    if ($vuelo == null) {
                        int $numVuelo = (int) Math.floor(Math.random() * (999 - 1)) + 100;
                        $vuelo = "ALA"+$numVuelo;
                        System.out.println("  > ¡Se ha creado el vuelo "+$vuelo+"!");
                    }
                    else {
                        System.out.println("  (×) El vuelo "+$vuelo+" ya está activo, no se pudo crear un nuevo vuelo");
                    }
                    break;
                    
                //*************************************************************
                case 2: // REALIZAR RESERVA
                    System.out.println("\n  > 2. REALIZAR RESERVA");
                    
                    if ($vuelo == null) {
                        int $numVuelo = (int) Math.floor(Math.random() * (999 - 1)) + 100;
                        $vuelo = "ALA"+$numVuelo;
                        System.out.println("  > ¡Se ha creado el vuelo "+$vuelo+"!");
                    }
                    else {
                        System.out.println("  (×) El vuelo "+$vuelo+" ya está activo, no se pudo crear un nuevo vuelo");
                    }
                    break;
                
                //*************************************************************    
                case 3: // ELIMINAR VUELO
                    System.out.println("\n  > 3. ELIMINAR VUELO ACTIVO");
                    
                    if ($vuelo != null) {
                        System.out.println("  > Se ha eliminado el vuelo "+$vuelo);
                        $vuelo = null;
                    }
                    else {
                        System.out.println("  (×) No existe vuelo activo.");
                    }
            }
            
            //System.out.println("opcion "+$opcion);
        
        }
        while ($opcion > 0 && $opcion < 6);
  
    }
}
