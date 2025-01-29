import java.util.Scanner;

public class desafioNueve {
    public static void main(String[] args){
        //El arreglo de entero con un tamaño definido.
        int[] notas = new int[10];

        //Uso scanner para que el usuario ingrese las notas
        Scanner scanner = new Scanner(System.in);

        //Las notas se cargan en el arreglo
        System.out.println("Por favor, ingrese las 10 notas de los estudiantes");
        for (int i=0; i < notas.length; i++){
            System.out.print("Nota del estudiante " + (i + 1) + ": ");
            notas[i] = scanner.nextInt();
        }

        //Muestro las notas cargadas en el arreglo
        System.out.println("\nLas notas ingresadas son:");
        for (int i = 0; i < notas.length; i++){
            System.out.println("Estudiante " + (i + 1) + ": " + notas[i]);
        }

        scanner.close();
    }
}