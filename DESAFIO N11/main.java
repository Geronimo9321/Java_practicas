public class main {
    
    public static void main(String[] args) {
        //CREO UN OBJETO RECTANGULO CON UN CONSTRUCTOR CON PARAMETROS
        Rectangulo rect = new Rectangulo(5, 3);

        //IMPRIMO EL PERIMETRO Y SUPERFICIE
        System.out.println("Perímetro: " + rect.getPerimetro());
        System.out.println("Superficie: " + rect.getSuperficie());
    }
}
