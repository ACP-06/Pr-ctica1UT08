public class CalculoPrecio {
    public static void main(String[] args) {
        double precioBase = 100;
        double precioFinal = precioBase + (precioBase * 0.21); // 0.21 es el IVA
        System.out.println("El precio final es: " + precioFinal);
    }
}
