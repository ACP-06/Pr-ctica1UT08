public class Acceso {
    public static void main(String[] args) {
        int edad = 17;
        boolean tienePermiso = false;

        if (edad >= 18 || tienePermiso) {
            System.out.println("Acceso permitido");
        } else {
            System.out.println("Acceso denegado");
        }
    }
}
