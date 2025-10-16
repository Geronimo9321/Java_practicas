import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculadoraBasica {

	private static final Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("=== Calculadora Básica ===");
		boolean salir = false;

		while (!salir) {
			mostrarMenu();
			int opcion = leerEntero("Elige una opción: ");

			switch (opcion) {
				case 1 -> operarBinaria("SUMA", (a, b) -> a + b);
				case 2 -> operarBinaria("RESTA", (a, b) -> a - b);
				case 3 -> operarBinaria("MULTIPLICACIÓN", (a, b) -> a * b);
				case 4 -> operarDivision();
				case 5 -> operarBinaria("MÓDULO (resto)", (a, b) -> a % b);
				case 6 -> operarPotencia();
				case 7 -> operarUnaria("RAÍZ CUADRADA", Math::sqrt);
				case 8 -> {
					System.out.println("Cerrando calculadora. ¡Hasta luego!");
					salir = true;
				}
				default -> System.out.println("Opción inválida. Intenta otra vez.");
			}
			System.out.println();
		}

		sc.close();
	}

	private static void mostrarMenu() {
		System.out.println("1) Sumar");
		System.out.println("2) Restar");
		System.out.println("3) Multiplicar");
		System.out.println("4) Dividir");
		System.out.println("5) Módulo (resto)");
		System.out.println("6) Potencia");
		System.out.println("7) Raíz cuadrada");
		System.out.println("8) Salir");
	}

	//Lee un entero de forma segura
	private static int leerEntero(String mensaje) {
		while (true) {
			System.out.println(mensaje);
			try {
				return Integer.parseInt(sc.nextLine().trim()); 
			} catch (NumberFormatException e) {
				System.out.println("Entrada no válida. Por favor ingrese un número entero.");
			}
		}
	}

	//Lee un double de forma segura
	private static double leerDouble(String mensaje) {
		while (true) {
			System.out.println(mensaje);
			try {
				return Double.parseDouble(sc.nextLine().trim());
			} catch (NumberFormatException e) {
				System.out.println("Entrada no válida. Por favor ingrese un número (ejemplo: 3.5 o 2).");
			}
		}
	}

	//Interfaz funcional simple para operaciones binarias
	@FunctionalInterface
	interface BinOp {
		double apply(double a, double b);
	}

	//Reutiliza lógica para operaciones con dos operandos
	private static void operarBinaria(String nombre, BinOp op) {
		double a = leerDouble("Ingrese el primer número: ");
		double b = leerDouble("Ingrese el segundo número: ");
		double resultado = op.apply(a, b);
		System.out.printf("%s: %.6f/n", nombre, resultado);
	}

	//División con control por cero
	private static void operarDivision() {
		double a = leerDouble("Ingrese el dividendo: ");
		double b;
		while (true) {
			b = leerDouble("Ingrese el divisor: ");
			if (b == 0) {
				System.out.println("Error: división por cero no permitida. Ingrese otro divisor.");
			} else break; 
		}
		double resultado = a / b;
		System.out.printf("DIVISION: %.6f/n", resultado); 
	}

	//Potencia (a^b)
	private static void operarPotencia() {
		double a = leerDouble("Ingrese la base: ");
		double b = leerDouble("Ingrese el exponente: ");
		double resultado = Math.pow(a, b);
		System.out.printf("POTENCIA: %.6f/n", resultado); 
	}

	//Operación unaria(ej: Raíz)
	private static void operarUnaria(String nombre, java.util.fuction.DoubleUnaryOperator op) {
		double a;
		while (true) {
			a = leerDouble("Ingrese el número: ");
			if (nombre.equals("RAÍZ CUADRADA") && a < 0) {
				System.out.println("Error: no se puede calcular la raíz cuadrada de un número negativo (en los reales).");
			} else break;
		}
		double resultado = op.applyAsDouble(a);
		System.out.printf("%s: %.6f/n", nombre, resultado); 
	}
}