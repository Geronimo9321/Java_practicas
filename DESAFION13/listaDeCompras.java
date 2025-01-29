package DESAFION13;
import java.io.FileWriter;
import java.io.IOException;

public class listaDeCompras {
    public static void main(String[] args) {
        
        String[] productos = {"Leche", "Pan", "Carne", "Arroz"};

        try{
            //Uso FileWriter para crear el archivo.txt
            FileWriter writer = new FileWriter("lista_de_compras.txt");

            for (String producto : productos){
                writer.write(producto + "\n");
            }

            writer.close();
            System.out.println("Lista de compras guardada en el archivo.");

        } catch(IOException e) {
            System.out.println("Hubo un error al escribir el archivo: " + e.getMessage());
        }
    }    
}
