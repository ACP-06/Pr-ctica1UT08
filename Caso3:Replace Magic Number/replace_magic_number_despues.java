public class CalculoPrecio {
    public static void main(String[] args) {
        final double IVA = 0.21;
        double precioBase = 100;
        double precioFinal = precioBase + (precioBase * IVA);
        System.out.println("El precio final es: " + precioFinal);
    }
}
