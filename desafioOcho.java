import java.util.Scanner;

public class desafioOcho {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //el usuario ingresa las calificaciones
        System.out.print("¿Cuantas calificaciones desea ingresar? ");
        int cantidadCalificaciones = scanner.nextInt();

        //validamos que lo ingresado sea positivo
        if(cantidadCalificaciones <= 0){
            System.out.println("La cantidad de calificaciones debe ser un numero positivo.");
            return; //sale si la cantidad es negativa
        }

        double suma = 0; //esta variable es para almacenar la suma de las calificaciones.

        //inica el bucle for
        for(int i = 1; i <= cantidadCalificaciones; i++){
            System.out.print("Ingrese la calificacion " + i + ": ");
            double calificacion = scanner.nextDouble();
            suma += calificacion; //sumamos la calificacion a la variable suma
        }

        //calculamos el promedio
        double promedio = suma / cantidadCalificaciones;

        //resultado
        System.out.println("El promedio de las calificaciones es: " + promedio);

        scanner.close();
    }
}
