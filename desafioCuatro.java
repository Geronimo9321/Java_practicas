import java.util.Scanner;

public class desafioCuatro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Ingreso un numero
        System.out.println("Ingrese un numero: ");
        int numero = scanner.nextInt();

        //Con esto verifico si el numero es par o impar
        if (numero % 2 == 0){
            System.out.println("El numero "+ numero + " es par.");
        } else {
            System.out.println("El numero "+ numero + " es impar.");
        }

        scanner.close();
    }    
}
