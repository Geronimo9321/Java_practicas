public class Trianguloherencia extends figurasgeometricas {
    private double lado1;
    private double lado2;
    private double lado3;

    public Trianguloherencia(double lado1, double lado2, double lado3){
        super();
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    public boolean EsTriangulo(){
        return (lado1 + lado2 > lado3) && (lado1 + lado3 > lado2) && (lado2 + lado3 > lado1);
    }

    public void mostrarDetalles(){
        mostrarNombre();
        if(EsTriangulo()){
            System.out.println("Es un triángulo válido.");
        } else {
            System.out.println("No es un triángulo válido.");
        }
    }
    
    //Aca esta la actividad "C".

    public static void main(String[] args) {
        
        Trianguloherencia t = new Trianguloherencia(3, 4, 5);

        
        t.mostrarDetalles();
    }

}
