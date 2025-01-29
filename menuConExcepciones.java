import java.util.Scanner;

public class menuConExcepciones {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do{
            System.out.println("===== MENÚ DE OPCIONES =====");
            System.out.println("1. Saludar");
            System.out.println("2. Dividir dos números");
            System.out.println("3. Salir");
            System.out.println("Seleccione una opción: ");

            try{
                opcion = Integer.parseInt(scanner.nextLine());

                switch (opcion) {
                    case 1: //OPCION SALUDAR
                        System.out.println("¡Hola! ¿Cómo estás?");
                        break;
                    
                    case 2: //OPCION DE DIVIDIR NUMEROS
                        try{
                            System.out.println("Ingrese un número: ");
                            double num1 = Double.parseDouble(scanner.nextLine());

                            System.out.println("Ingrese otro número: ");
                            double num2 = Double.parseDouble(scanner.nextLine());

                            //VERIFICO SI EL SEGUNDO NUMERO ES CERO
                            if(num2 == 0){
                                System.out.println("Error: No se puede dividir entre cero.");
                            } else{
                                double resultado = num1 / num2;
                                System.out.println("El resultado de la división es: " + resultado);
                            }
                        } catch (NumberFormatException e){
                            System.out.println("Error: Debe ingresar un número válido.");
                        }
                        break;
                    
                    case 3: //OPCION PARA SALIR
                        System.out.println("Saliendo del programa...");
                        break;

                    default:
                        System.out.println("Error: Opción no válida. Por favor ingrese una opción del 1 al 3.");
                }
                
            } catch (NumberFormatException e){
                System.out.println("Error: Entrada inválida. Por favor ingrese un númer entero.");
                opcion = -1; //Opción inválida para continuar en el ciclo
            }
            System.out.println("");
        } while (opcion != 3); 
        scanner.close();    
    }
}