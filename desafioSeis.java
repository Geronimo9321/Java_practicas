import java.util.Scanner;

public class desafioSeis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Ingreso el limite inferior
        System.out.println("Ingrese el limite inferior del intervalo: ");
        int limiteInferior = scanner.nextInt();

        //Ingreso el limite superior
        System.out.println("Ingrese el limite superior del intervalo: ");
        int limiteSuperior = scanner.nextInt();

        //Ingreso un valor entero
        System.out.println("Ingrese un valor entero: ");
        int valor = scanner.nextInt();

        //Verifico si el valor se encuntra dentro del intervalo
        if(valor >= limiteInferior && valor <= limiteSuperior){
            System.out.println("El valor "+ valor +" esta dentro del intervalo["+ limiteInferior +", "+ limiteSuperior +"]." );
        }else{
            System.out.println("El valor "+ valor +" no esta dentro del intervalo["+ limiteInferior +", "+ limiteSuperior +"].");
        }

        scanner.close();
    }    
}
