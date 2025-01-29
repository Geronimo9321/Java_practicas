public class figurasgeometricas {
    private String nombre;

    public figurasgeometricas(){
        this.nombre = "Figura Geometrica";
    }

    public void mostrarNombre(){
        System.out.println("El nombre de la figura es: " + nombre);
    }

    public static void main(String[] args) {
        figurasgeometricas figura = new figurasgeometricas();

        figura.mostrarNombre();
    }
}
