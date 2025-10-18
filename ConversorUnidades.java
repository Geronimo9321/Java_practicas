import java.util.Scanner;

public class ConversorUnidades {
	// Scanner global para leer desde consola
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		int opcion;

		//bucle principal del programa
		do {
			mostrarMenu();
			opcion = leerEntero("Selecciona una opcion: ");

			switch (opcion) {
				case 1:
					convertirLongitud();
					break;
				case 2:
					convertirPeso();
					break;
				case 3:
					convertirTemperatura();
					break;
				case 4:
					System.out.println("Saliendo del conversor...");
					break;
				default:
					System.out.println("Opcion no valida. Intenta nuevamente");
			}
		} while (opcion != 4);
	}

	//Muestra el menu principal con las opciones disponibles
	private static void mostrarMenu() {
		System.out.println("\n=== CONVERSOR DE UNIDADES ===");
		System.out.println("1. Longitud (metros, km, cm)");
		System.out.println("2. Peso (kg, gramos)");
		System.out.println("3. Temperatura (°C ↔ °F)");
		System.out.println("4. Salir");
	}

	//Convierte entre distintas unidades de Longitud
	private static void convertirLongitud() {
		System.out.println("\n--- Conversion de LONGITUD ---");
		System.out.println("1. Metros -> Kilometros");
		System.out.println("2. Kilmetros -> Metros");
		System.out.println("3. Metros -> Centimetros");
		System.out.println("4. Centimetros -> Metros");

		int tipo = leerEntero("Selecciona una opcion: ");
		double valor = leerDouble("Ingresa el valor: ");
		double resultado = 0;

		switch (tipo) {
			case 1:
				resultado = valor / 1000;
				System.out.println(valor + " m = " + resultado + " km");
				break;
			case 2:
				resultado = valor * 1000;
				System.out.println(valor + " km = " + resultado + " m");
				break;
			case 3:
				resultado = valor * 100;
				System.out.println(valor + " m = " + resultado + " cm");
				break;
			case 4:
				resultado = valor / 100;
				System.out.println(valor + " cm = " + resultado + " m");
				break;
			default:
				System.out.println("Opcion no valida.");
		}
	}

	//Convierte entre distintas unidades de peso
	private static void convertirPeso() {
		System.out.println("\n--- Conversion de PESO ---");
		System.out.println("1. Kilogramos -> Gramos");
		System.out.println("2. Gramos -> Kilogramos");

		int tipo = leerEntero("Selecciona una opcion: ");
		double valor = leerDouble("Ingresa el valor: ");
		double resultado = 0;

		switch (tipo) {
			case 1:
				resultado = valor * 1000;
				System.out.println(valor + " kg = " + resultado + " g");
				break;
			case 2:
				resultado = valor / 1000;
				System.out.println(valor + " g = " + resultado + " kg");
				break;
			default:
				System.out.println("Opcion no valida.");
		}
	}

	//Convierte entre grados Celsius y Fahrenheit
	private static void convertirTemperatura() {
		System.out.println("\n--- Conversion de TEMPERATURA ---");
		System.out.println("1. Celsius -> Fahrenheit");
		System.out.println("2. Fahrenheit -> Celsius");

		int tipo = leerEntero("Selecciona una opcion: ");
		double valor = leerDouble("Ingresa el valor: ");
		double resultado = 0;

		switch (tipo) {
			case 1:
				resultado = (valor * 9 / 5) + 32;
				System.out.println(valor + " Grados Celsius = " + resultado + " Grados Fahrenheit");
				break;
			case 2:
				resultado = (valor - 32) * 5 / 9;
				System.out.println(valor + " Grados Fahrenheit = " + resultado + " Grados Celsius");
				break;
			default:
				System.out.println("Opcion no valida.");
		}
	}

	//Lee un número entero desde consola (con validación)
	private static int leerEntero(String mensaje) {
		while (true) {
			try {
				System.out.print(mensaje);
				return Integer.parseInt(scanner.nextLine());
			} catch (NumberFormatException e) {
				System.out.println("Por favor, Ingresa un numero entero valido.");
			}
		}
	}

	//Lee un número decimal desde consola (con validación)
	private static double leerDouble(String mensaje) {
		while (true) {
			try {
				System.out.print(mensaje);
				return Double.parseDouble(scanner.nextLine());
			} catch (NumberFormatException e) {
				System.out.println("Por favor, Ingresa un numero valido.");
			}
		}
	}
}