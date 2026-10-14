package negocio;

public class Carro {
    private int potencia;
    private double velocidad;

    void frenar () {
        velocidad /=2;
    }

    // Atributos clase
    private static int numCarros = 0;

    // Setters
    public void setPotencia(int potencia){
        // Se actualiza solo si el dato es correcto
        if (potencia>0)
            this.potencia = potencia;
    }

    public void setVelocidad(double velocidad){
        // Se actualiza solo si el dato es correcto sino se setea
        if (velocidad<0)
            velocidad=0;
        this.velocidad = velocidad;
    }

    // Getters
    public double getVelocidad(){
        return velocidad;
    }

    public int getPotencia(){
        return potencia;
    }

    public void acelerar () {
        velocidad += potencia;
    }

    // Constructores
    public Carro(int potencia, double velocidad){
        /*
        this.potencia = potencia;
        this.velocidad = velocidad;
        */

        setPotencia(potencia);
        setVelocidad(velocidad);
        numCarros ++;
    }

    public Carro(){
        numCarros ++;
    }

    public static int getNumCarros(){
        return numCarros;
    }

    private static final double IVA = 0.12;

    public static double getIva(){
        return IVA;
    }

    public double calcularPrecioventa(double precio){
        return precio + (precio * IVA);
    }
}
