package negocio;

public class MainCarro {
    static void main() {
        System.out.println("El número total de carros es de: " +Carro.getNumCarros());
        Carro c1= new Carro(2,60);
        Carro c2= new Carro(8,100);
        Carro c3= new Carro(2,60);

        System.out.println("La potencia del carro 1 es "+c1.getPotencia()+ " y la velocidad es "+c1.getVelocidad());
        System.out.println("La potencia del carro 2 es "+c2.getPotencia()+ " y la velocidad es "+c2.getVelocidad());
        System.out.println("La potencia del carro 3 es "+c3.getPotencia()+ " y la velocidad es "+c3.getVelocidad());

        System.out.println("------------------------------------------------------");

        System.out.println("El número total de carros es de: " +Carro.getNumCarros());
    }
}
