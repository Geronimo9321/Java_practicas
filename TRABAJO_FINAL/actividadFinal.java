import java.io.*;
import java.util.*;
import java.util.Scanner;
import java.io.BufferedReader;

public class actividadFinal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nombreArchivo = "C:\\Users\\Geronimo Ariel\\Desktop\\Cilsa\\JAVA\\Archivos-Practica\\TRABAJO_FINAL\\src\\Archivo\\actividades.csv";

        //Cargar el archivo CSV en una lista
        List<String[]>datosCSV = cargarCSV(nombreArchivo);

        while (true) {
            System.out.println("Menú de Opciones:");
            System.out.println("1. Buscar por Localidad");
            System.out.println("2. Buscar por Instructor");
            System.out.println("3. Salir");
            System.out.println("Selecciona una opción:");

            int opcion = scanner.nextInt();
            scanner.nextLine(); //Limpiar el buffer

            switch (opcion) {
                case 1:
                    buscarPorLocalidad(datosCSV, scanner);
                    break;
                case 2:
                    buscarPorInstructor(datosCSV, scanner);
                    break;
                case 3:
                    System.out.println("Saliendo del programa.");
                    scanner.close();
                    System.exit(0);
                    
                default:
                    System.out.println("Opción no válida. Por favor, elige una opción válida.");
            }
        }
    }

    //Método para cargar el archivo CSV en una lista de arrays de String
    private static List<String[]>cargarCSV(String nombreArchivo){
        List<String[]> datos = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))){
            String linea;
            while ((linea = br.readLine()) != null) {
                //Dividir la línea por comas y agregar al listado
                String[] columnas = linea.split(";");
                datos.add(columnas);
            }
        } catch(IOException e){
            e.printStackTrace();
        }
        return datos;
    }


    //Método para realizar la busqueda por Localidad
    private static void buscarPorLocalidad(List<String[]> datos, Scanner scanner){
        System.out.println("Ingresa la Localidad a buscar: ");
        String localidad = scanner.nextLine().toLowerCase();

        boolean encontrado = false;
        for (String[] fila : datos) {
            //La columna 0 es la Localidad
            if (fila[0].toLowerCase().contains(localidad)) {
                System.out.println("Localidad: " + fila[0] + ", Actividad: " + fila[1] + ", Nivel: " 
                                    + fila[2] + ", Instructor: " + fila[3] + ", Telefono: " + fila[4]);
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("No se encontraron resultados para la localidad:" + localidad);
        }
    }

    //Método para realizar la busqueda por Instructor
    private static void buscarPorInstructor(List<String[]> datos, Scanner scanner){
        System.out.println("Ingresa el Instructor a buscar:");
        String instructor = scanner.nextLine().toLowerCase();

        boolean encontrado = false;
        for (String[] fila : datos) {
            //La columna 3 es del Instructor
            if (fila[3].toLowerCase().contains(instructor)){
                System.out.println("Localidad: " + fila[0] + ", Actividad: " + fila[1] + ", Nivel: " 
                                    + fila[2] + ", Instructor: " + fila[3] + ", Telefono: " + fila[4]);
                encontrado = true;
            }
        }

        if (!encontrado){
            System.out.println("No se encontraron resultados para el Instructor:" + instructor);
        }
    }
}