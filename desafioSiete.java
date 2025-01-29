import java.util.Scanner;

public class desafioSiete {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int calificacion;
        int calificacionMaxima = Integer.MIN_VALUE;

        System.out.println("Ingrese las calificaciones. Ingrese un numero negativo para terminar");

        //Uso el bucle WHILE 
        while (true) {
            System.out.print("Ingrese una calificacion: ");
            calificacion = scanner.nextInt();

            if(calificacion<0){
                break; //cuando ingrese un numero negativo se rompe el bucle while
            }

            //con esto verifico la calificacion mas alta ingresada 
            if(calificacion > calificacionMaxima){
                calificacionMaxima = calificacion;
            }
        }

        //Muestro los resultados
        if(calificacionMaxima != Integer.MIN_VALUE){
            System.out.println("La calificacion mas alta es de: "+ calificacionMaxima);
        } else {
            System.out.println("No se ingresaron calificaciones validas.");
        }

        scanner.close();
    }    
}
