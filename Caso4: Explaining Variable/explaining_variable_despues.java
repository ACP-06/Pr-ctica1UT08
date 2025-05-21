public class Acceso {
    public static void main(String[] args) {
        int edad = 17;
        boolean tienePermiso = false;

        boolean esMayorDeEdad = edad >= 18;
        boolean puedeEntrar = esMayorDeEdad || tienePermiso;

        if (puedeEntrar) {
            System.out.println("Acceso permitido");
        } else {
            System.out.println("Acceso denegado");
        }
    }
}
