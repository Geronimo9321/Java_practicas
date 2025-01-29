import java.util.Scanner;

public class desafio10 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int[] notas = new int[10];
        int contadorNotasValidas = 0; //esta variable es para contar cuantas notas validas se ingresan

        System.out.println("Por favor, ingrese las notas de los estudiantes (entre 6 y 10 inclusive):");

        //uso el bucle while para ingresar las notas
        while(contadorNotasValidas < 10){
            System.out.print("Ingrese una nota: ");
            int nota = scanner.nextInt();

            //verifico si la nota esta entre 6 y 10
            if (nota >= 6 && nota <= 10){
                notas[contadorNotasValidas] = nota; //almaceno la nota en el arreglo
                contadorNotasValidas++;
            } else {
                System.out.println("Nota invalida. Debe estar entre 6 y 10.");
            }
        }

        //muestro las notals validas almacenadas en mi array
        System.out.println("\nLas notas validas ingresadas son:");
        for (int i = 0; i < contadorNotasValidas; i++){
            System.out.println("Nota " + (i + 1) + ": " + notas[i]);
        }

        scanner.close();
    }
}
