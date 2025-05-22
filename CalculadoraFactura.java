/**
 * Calcula el total a pagar por una factura, aplicando primero un descuento
 * al precio base recibido como parámetro y luego sumando un impuesto fijo.
 * Imprime un resumen con los valores aplicados y el total.
 */
public class CalculadoraFactura {

    public static void calcular(double pb, double d) {
        double porcentajeImpuestoFijo = 21.0; // porcentaje de impuesto fijo
        double precioBase = 120.0;
        double descuento = 15.0;
        double precioNeto = precioBase  - descuentoRealizado(120.0, 15.0);
        double facturaTotal = precioNeto + impuestoAplicado(double a, 21.0);
    
        mostrarConsola();
        
    }
    public static void mostrarConsola(){
        System.out.println("El precio base es: " + precioBase);
        System.out.println("Descuento aplicado: " + descuento + "%");
        System.out.println("Impuesto aplicado: " + porcentajeImpuestoFijo + "%");
        System.out.println("El total a pagar es: " + facturaTotal);
    
    }

    public static double descuentoRealizado(double a, double b){
            return a * b/100;
    }
     public static double impuestoAplicado(double a, double b){
            return a * b/100;
    }
}