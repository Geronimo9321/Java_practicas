import java.util.Scanner;

public class desafioUno {

    public static void main(String[] args) {
        // Con esto leo la entrada de los usuarios
        Scanner scanner = new Scanner(System.in);

        //Con esto solicito que ingrese un dato numerico
        System.out.println("Ingrese un numero: ");
        int numero1 = scanner.nextInt();

        System.out.println("Ingrese un numero diferente: ");
        int numero2 = scanner.nextInt();

        //suma de los numeros
        int suma = numero1 + numero2;

        //resultado
        System.out.println("La suma de los numeros es: " + suma);

        //Cierro el scanner
        scanner.close();
    }
}