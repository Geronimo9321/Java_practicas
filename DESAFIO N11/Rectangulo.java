public class Rectangulo {
    
    //PROPIEDADES PRIVADAS
    private double largo;
    private double ancho;

    //CONSTRUCTOR POR DEFECTO
    public Rectangulo(){
        this.largo = 0;
        this.ancho = 0;
    }

    //CONSTRUCTOR CON PARAMETROS
    public Rectangulo(double largo, double ancho){
        this.largo = largo;
        this.ancho = ancho;
    }

    //METODO PARA OBTENER EL PERIMETRO DEL RECTANGULO
    public double getPerimetro(){
        return 2 * (largo + ancho);
    }

    //METODO PARA OBTENER LA SUPERFICIE DEL RECTANGULO
    public double getSuperficie(){
        return largo * ancho;
    }

    //METODOS GETTER Y SETTER
    public double getLargo(){
        return largo;
    }

    public void setLargo(double largo){
        this.largo = largo;
    }

    public double getAncho(){
        return ancho;
    }

    public void setAncho(double ancho){
        this.ancho = ancho;
    }
}
