import builders.CarroBuilder;
import carros.CarroEsportivo;
import carros.CarroSedan;

public class Main {
    public static void main(String[] args) {


        CarroBuilder carroBuilder = new CarroBuilder();

        CarroSedan carro1 = carroBuilder.construirSedan();

        System.out.println(carro1);

        System.out.println();
        System.out.println();
        System.out.println();

        CarroEsportivo carro2 = carroBuilder.construirEsportivo();
        System.out.println(carro2);

        var carro3 = carro2.clone();
    }
}