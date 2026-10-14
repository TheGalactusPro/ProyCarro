package negocio;

public class Carro {
    private int potencia;
    private double velocidad;

    public Carro(int potencia, double velocidad){
        /*
        this.potencia = potencia;
        this.velocidad = velocidad;
        */

        setPotencia(potencia);
        setVelocidad(velocidad);
    }

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

    public void acelerar () {
        velocidad += potencia;
    }

    void frenar () {
        velocidad /=2;
    }
}
