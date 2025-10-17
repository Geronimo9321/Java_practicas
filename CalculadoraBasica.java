import java.util.Scanner;

public class CalculadoraBasica {

    static Scanner sc = new Scanner(System.in);
    static boolean salir = false;

    public static void main(String[] args) {
        while (!salir) {
            mostrarMenu();
            int opcion = sc.nextInt();
            procesarOpcion(opcion);
        }
        sc.close();
    }

    static void mostrarMenu() {
        System.out.println("\n=== CALCULADORA BASICA ===");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicacion");
        System.out.println("4. Division");
        System.out.println("5. Modulo (resto)");
        System.out.println("6. Potencia");
        System.out.println("7. Raiz cuadrada");
        System.out.println("8. Salir");
        System.out.print("Elige una opcion: ");
    }

    static void procesarOpcion(int opcion) {
        switch (opcion) {
            case 1:
                operarBinaria("SUMA", (a, b) -> a + b);
                break;
            case 2:
                operarBinaria("RESTA", (a, b) -> a - b);
                break;
            case 3:
                operarBinaria("MULTIPLICACION", (a, b) -> a * b);
                break;
            case 4:
                operarDivision();
                break;
            case 5:
                operarBinaria("MODULO (resto)", (a, b) -> a % b);
                break;
            case 6:
                operarPotencia();
                break;
            case 7:
                operarUnaria("RAIZ CUADRADA", Math::sqrt);
                break;
            case 8:
                System.out.println("Cerrando calculadora. ¡Hasta luego!");
                salir = true;
                break;
            default:
                System.out.println("Opcion invalida. Intenta otra vez.");
        }
    }

    interface OperacionBinaria {
        double aplicar(double a, double b);
    }

    static void operarBinaria(String nombre, OperacionBinaria op) {
        System.out.print("Ingresa el primer numero: ");
        double a = sc.nextDouble();
        System.out.print("Ingresa el segundo numero: ");
        double b = sc.nextDouble();
        double resultado = op.aplicar(a, b);
        System.out.println("Resultado de la " + nombre + ": " + resultado);
    }

    static void operarDivision() {
        System.out.print("Ingresa el dividendo: ");
        double a = sc.nextDouble();
        System.out.print("Ingresa el divisor: ");
        double b = sc.nextDouble();
        if (b != 0) {
            System.out.println("Resultado de la DIVISION: " + (a / b));
        } else {
            System.out.println("Error: no se puede dividir por cero.");
        }
    }

    static void operarPotencia() {
        System.out.print("Ingresa la base: ");
        double base = sc.nextDouble();
        System.out.print("Ingresa el exponente: ");
        double exp = sc.nextDouble();
        System.out.println("Resultado de la POTENCIA: " + Math.pow(base, exp));
    }

    static void operarUnaria(String nombre, java.util.function.DoubleUnaryOperator op) {
        System.out.print("Ingresa el numero: ");
        double a = sc.nextDouble();
        System.out.println("Resultado de la " + nombre + ": " + op.applyAsDouble(a));
    }
}
