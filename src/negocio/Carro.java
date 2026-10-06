package negocio;

public class Carro {
    private int potencia;
    private double velocidad;

    /*
    Métodos para ingresar información
    set()
    "Siempre" el tipo de retorno es void
    Siempre recibe un parámetro
    Parámetro generalmente es del mismo tipo de atributo
     */

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

    /*
    Método para sacar información
    gr()
    Siempre retorna valor
    El tipo de retorno generalmente es del mismo del atributo
     */
    

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
