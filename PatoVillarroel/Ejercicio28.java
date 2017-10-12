package PatoVillarroel;
import java.text.DecimalFormat;
import java.util.*;

public class Ejercicio28 {
    public void desarrollar() {
        
        System.out.println ("\n*************\nEJERCICIO 28");
        System.out.println ("Programa de facturación que pide SKU, litros vencidos, precio x litro.\nIngresar 5 facturas y calcular facturación total, litros vendidos de sku 1 y cuntas facturas sobre 500 mil\n************\n");
        
        int facturaCara = 0;
        float producto1 = 0;
        float total = 0;

        Scanner entrada = new Scanner(System.in);
        
        System.out.println ("Ingresa SKU, litros y precio x litro de 5 facturas separadas por /");
        System.out.println ("Ejemplo: 1/50/4000 (el punto es decimal)\n");
        
        for (int n = 1; n <= 5; n++) {
            System.out.print("Factura "+n+": ");
            String factura = entrada.nextLine();
            
            String[] partesFactura = factura.split("/"); // crear array dividiendo el dato en sus componentes
            String tsku = partesFactura[0]; // asigno la parte de sku a la variable tsku
            String tlitros = partesFactura[1]; // asigno la parte de litros a la variable tlitros
            String tprecio = partesFactura[2]; // asigno la parte de precio a la variable tprecio
            
            int sku = Integer.parseInt(tsku); // convertir sku string en sku int
            
            float litros = Float.parseFloat(tlitros); // convertir litros string en litros float
            
            if (sku == 1) {
                producto1 = litros + producto1;
            }
            
            float precio = Float.parseFloat(tprecio); // convertir precio string en precio float
            
            float subtotal = precio * litros;
            
            total = total + subtotal;
            
            if (subtotal > 500000) {
                facturaCara = facturaCara + 1;
            }
            
        }
        
        System.out.println ("\nDe los datos ingresados se obtiene: ");
        System.out.println ("Facturación total: $"+total);
        System.out.println ("Litros vendidos de SKU 1: "+producto1+" litros");
        System.out.println ("Facturas sobre 500 mil: "+facturaCara);
        
    }
}
