import java.util.Scanner;

public class desafioDos {

    public static void main(String[] args) {
        //entrada del usuario
        Scanner scanner = new Scanner(System.in);

        //con esto pedimos el nombre
        System.out.print("Ingrese su nombre: ");
        String firstname= scanner.nextLine();

        //con esto pedimos el apellido
        System.out.print("Ingrese su apellido: ");
        String lastname= scanner.nextLine();

        //concatenamos ambos
        String nameComplete = firstname +" "+ lastname;

        //imprimimos lo concatenado
        System.out.println("Hola "+ nameComplete);

        //cierro el scanner
        scanner.close();
    }
}
