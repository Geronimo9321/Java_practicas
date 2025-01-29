import java.util.Scanner;

public class desafioCinco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un numero: ");
        int num1 = scanner.nextInt();

        System.out.println("Ingrese otro numero: ");
        int num2 = scanner.nextInt();

        //Verifico si el segundo numero es cero para no dividir por cero
        if (num2 == 0){
            System.out.println("El segundo numero no puede ser cero.");
        } else{
            //verifico si el primer numero es multiplo del segundo
            if (num1 % num2 == 0) {
                System.out.println("El numero "+ num1 + " es multiplo de "+ num2 +".");
            }else{
                System.out.println("El numero "+ num1 + " no es multiplo de "+ num2 +".");
            }
        }

        scanner.close();
    }    
}
