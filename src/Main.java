public class Main {
    public static void main(String[] args) {
        Teclado teclado = new Teclado();

        String nombreUsuario = teclado.getString(Colores.CYAN + "Ingrese su nombre: ");
        System.out.println(Colores.GREEN + "¡Hola, " + nombreUsuario + "! Bienvenido a nuestra calculadora.\n");

        int opcion;
        double num1, num2, resultado;

        do {
            System.out.println(Colores.GREEN_BOLD + "Aquí tienes el menú de operaciones matemáticas:");
            System.out.println(Colores.BLUE_BOLD + "1. Sumar dos números");
            System.out.println(Colores.BLUE_BOLD + "2. Restar dos números");
            System.out.println(Colores.BLUE_BOLD + "3. Multiplicar dos números");
            System.out.println(Colores.BLUE_BOLD + "4. Dividir dos números");
            System.out.println(Colores.RED_BOLD + "5. Salir");

            opcion = teclado.readInteger(Colores.GREEN_BOLD + "Elija una opción: ");

            if (opcion >= 1 && opcion <= 4) {
                num1 = teclado.readDouble(Colores.BLUE + "Ingrese el primer número: ");
                num2 = teclado.readDouble(Colores.BLUE + "Ingrese el segundo número: ");
            } else {
                num1 = num2 = 0;
            }

            switch (opcion) {
                case 1:
                    resultado = sumar(num1, num2);
                    System.out.println(Colores.GREEN + "Resultado de la suma: " + resultado);
                    break;
                case 2:
                    resultado = restar(num1, num2);
                    System.out.println(Colores.GREEN + "Resultado de la resta: " + resultado);
                    break;
                case 3:
                    resultado = multiplicar(num1, num2);
                    System.out.println(Colores.GREEN + "Resultado de la multiplicación: " + resultado);
                    break;
                case 4:
                    resultado = dividir(num1, num2);
                    if (!Double.isNaN(resultado)) {
                        System.out.println(Colores.GREEN + "Resultado de la división: " + resultado);
                    }
                    break;
                case 5:
                    String confirmacion = teclado.getString(Colores.YELLOW_BOLD +"¿Está seguro de que desea salir? (Sí/No): ");
                    if (confirmacion.equalsIgnoreCase("Sí")) {
                        salir();
                        return;
                    } else if (confirmacion.equalsIgnoreCase("Si")){
                        salir();
                        return;
                    } else {
                        opcion = 0;
                    }
                    break;
                default:
                    System.out.println(Colores.RED + "Opción no válida. Intente de nuevo.");
            }

            System.out.println();

        } while (opcion != 5);
    }

    public static double sumar(double a, double b) {
        return a + b;
    }

    public static double restar(double a, double b) {
        return a - b;
    }

    public static double multiplicar(double a, double b) {
        return a * b;
    }

    public static double dividir(double a, double b) {
        if (b == 0) {
            System.out.println(Colores.YELLOW + "Error: No se puede dividir por cero.");
            return Double.NaN;
        }
        return a / b;
    }

    public static void salir() {
        System.out.println(Colores.RED_UNDERLINED + "Saliendo del programa...");
    }
}
