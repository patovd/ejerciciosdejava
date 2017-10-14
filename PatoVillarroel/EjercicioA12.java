package PatoVillarroel;
import java.util.*;

public class EjercicioA12 {
    public void desarrollar() {
        
        System.out.println ("\n*************\nEJERCICIO ARRAY 12");
        System.out.println ("Reserva de vuelo en Aerolinea\n************\n");
        
        Scanner $entrada = new Scanner(System.in);
        int $opcion;
        String $vuelo = null;
        String $asientos[] = new String[101]; 
        String $pasajero;
        String $origen;
        String $destino;
        String $ruta = null;
        
        System.out.println("=================\nAEROLINEAS ALITAS\n=================\n"+
            "\nMENÚ DE OPERACIONES:\n"+
            "1. Abrir Vuelo.\n" +
            "2. Realizar reserva.\n" +
            "3. Cerrar vuelo.\n" +
            "4. Revisar vuelo activo.\n" +
            "5. Eliminar reserva.\n" +
            "6. Salir.");
        
        do {
            System.out.print("\n----------------------------\nIndica operación: ");
            //$entrada.skip("\n");
            //$opcion = Integer.parseInt($entrada.nextLine()); // esto es para evitar que se salte la entrada de texto por haber pedido un numero antes... una tontera de Java.
            $opcion = $entrada.nextInt();

            switch($opcion) {
                
                //*************************************************************
                case 1: // CREAR VUELO
                    System.out.println("\n  1. ABRIR NUEVO VUELO");
                    
                    if ($vuelo == null) { // Si no existe vuelo   
                        $entrada.skip("\n");// esto es para evitar que se salte la entrada de texto por haber pedido un numero antes... una tontera de Java.
                        System.out.print("  • Ingresa el origen: ");
                        $origen = $entrada.nextLine(); // capturamos el origen
                        
                        System.out.print("  • Ingresa el destino: ");
                        $destino = $entrada.nextLine(); // capturamos el destino
                        
                        $ruta = $origen+"-"+$destino;
                        
                        int $numVuelo = (int) Math.floor(Math.random() * (999 - 1)) + 100; // Establezco un numero al azar de 3 digitos
                        $vuelo = "ALA"+$numVuelo; // concateno ALA con el numero al azar
                        System.out.println("  • Se ha abierto Vuelo "+$vuelo+" con ruta "+$ruta);
                    }
                    else { // si ya existe un vuelo
                        System.out.println("  × El vuelo "+$vuelo+" ya está abierto, no se puede abrir un nuevo vuelo");
                    }
                    break;
                    
                //*************************************************************
                case 2: // REALIZAR RESERVA
                    System.out.println("\n  2. REALIZAR RESERVA");
                    
                    if ($vuelo == null) { // si no existe vuelo
                        System.out.println("  × No se puede reservar vuelo, debes abrirlo primero.\n    Ábrelo con la operación 1");
                    }
                    else { // si ya existe vuelo
                        
                        int $asientosVacios = 100;
                        int $asientosLlenos = 0;
                        
                        // comprobamos cuantos asientos disponibles quedan
                        for(int $i = 1; $i < $asientos.length; $i++) { 
                            if ($asientos[$i] != null) { // comprobamos si es diferente a null porque el array tiene datos String
                               $asientosLlenos++;
                               $asientosVacios = 100 - $asientosLlenos;
                            }
                        }
                        
                        System.out.println("  • El vuelo "+$vuelo+" tiene "+$asientosVacios+" asientos disponibles.");
                        
                        $entrada.skip("\n");// esto es para evitar que se salte la entrada de texto por haber pedido un numero antes... una tontera de Java.
                        System.out.print("\n  • Ingresa nombre del pasajero: ");
                        $pasajero = $entrada.nextLine(); // capturamos el nombre del pasajero
                        
                        
                        System.out.print("  • ¿Que asiento desea reservar "+$pasajero+"?: ");
                        int $asiento = $entrada.nextInt(); // capturamos el asiento del pasajero
                        
                        boolean $ocupado = true;
                        
                        do {
                            
                            if ($asiento > 0 && $asiento <= 100) { // validamos el numero del asiento
                                if ($asientos[$asiento] != null) { // verificamos si el asiento está ocupado
                                    System.out.print("  × El asiento "+$asiento+" ya está ocupado. Indica otro: ");
                                    $asiento = $entrada.nextInt(); // capturamos el asiento del pasajero
                                    $ocupado = true;
                                } 
                                else {
                                    System.out.println("  • Se ha reservado el asiento "+$asiento+" para "+$pasajero);
                                    $asientos[$asiento] = $pasajero;
                                    $ocupado = false;
                                }
                            } 
                            else { // si el numero de asiento está fuera de rango
                                System.out.print("  × No existe el asiento "+$asiento+". Indica otro: ");
                                    $asiento = $entrada.nextInt(); // capturamos el asiento del pasajero
                                    $ocupado = true;
                            }
                            
                        } while ($ocupado == true);   
                    }
                    break;
                
                //*************************************************************    
                case 3: // ELIMINAR VUELO
                    System.out.println("\n  3. ELIMINAR VUELO ACTIVO");
                    
                    if ($vuelo != null) {
                        System.out.println("  • Se ha eliminado el vuelo "+$vuelo);
                        $vuelo = null;
                    }
                    else {
                        System.out.println("  × No existe vuelo activo.");
                    }
                    break;
                    
                //*************************************************************    
                case 4: // REVISAR VUELO
                    System.out.println("\n  3. REVISAR VUELO ACTIVO");
                    
                    if ($vuelo != null) { // Si  existe vuelo   
                        System.out.println("  • Vuelo "+$vuelo+" de Alitas Airlines.");
                        System.out.println("  • Ruta "+$ruta);
                        System.out.println("\n  • Listado de asientos");
                        for(int $i = 1; $i < $asientos.length; $i++) { 
                            if ($i > 0 && $i < 10) {
                                if ($asientos[$i] == null) {
                                    System.out.println("      "+$i+":   disponible");
                                } 
                                else {
                                    System.out.println("      "+$i+":     reservado por "+$asientos[$i]);
                                }
                            }
                            else if ($i >= 10 && $i < 100) {
                                if ($asientos[$i] == null) {
                                    System.out.println("      "+$i+":  disponible");
                                } 
                                else {
                                    System.out.println("    "+$i+":    reservado por "+$asientos[$i]);
                                }
                            }
                            else {
                                if ($asientos[$i] == null) {
                                    System.out.println("      "+$i+": disponible");
                                }   
                                else {
                                    System.out.println("      "+$i+":   reservado por "+$asientos[$i]);
                                }
                            }
                        }
                    }
                    else {
                        System.out.println("  × No se puede revisar vuelo, debes abrirlo primero.\n    Ábrelo con la operación 1");
                    }
                    break;
                    
                    
                    
            }
            
            //System.out.println("opcion "+$opcion);
        
        }
        while ($opcion > 0 && $opcion < 6);
  
    }
}
