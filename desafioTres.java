import java.util.Scanner;

public class desafioTres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Solicitud de nombre y apellido
        System.out.print("Ingrese su nombre: ");
        String firstname= scanner.nextLine();

        System.out.print("Ingrese su apellido: ");
        String lastname= scanner.nextLine();

        String nameComplete = firstname +" "+ lastname;

        System.out.println("Hola "+ nameComplete);

        //Solicitud de Operaciones con numeros
        System.out.println("Ingrese un numero: ");
        int numero1 = scanner.nextInt();

        System.out.println("Ingrese un numero diferente: ");
        int numero2 = scanner.nextInt();

        int suma = numero1 + numero2;
        int resta = numero1 - numero2;
        int multiplicacion = numero1 * numero2;
        double division = (double) numero1 / numero2;
        int residuo = numero1 % numero2;

        System.out.println("Resultado de las operaciones son:");
        System.out.println("Suma: "+ suma);
        System.out.println("Resta: "+ resta);
        System.out.println("Multiplicacion: "+ multiplicacion);
        System.out.println("Division: "+ division);
        System.out.println("Residuo: "+ residuo);

        scanner.close();
    }    
}
