import carros.Builder;
import carros.Carro;
import carros.CarroSedan;
import diretor.CarroBuilder;
import carros.CarroEsportivo;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        CarroBuilder carroBuilder = new CarroBuilder();
        CarroEsportivo esportivoPadrao = carroBuilder.construirEsportivo();
        CarroSedan sedanPadrao = carroBuilder.construirSedan();

        List<Carro> pedido = new ArrayList<>();
        double precoPedido = 0;


        System.out.println("Seja bem-vindo a montadora");
        System.out.println("Trabalhamos com dois tipos de carros: ");
        System.out.println();
        System.out.println(esportivoPadrao);
        System.out.println();
        System.out.println(sedanPadrao);

        CarroEsportivo carroDoPai = carroBuilder.construirEsportivo();
        pedido.add(carroDoPai);
        System.out.println("\nCarro Esportivo padrão adicionado ao pedido");

        CarroEsportivo carroDoFilho = carroBuilder.construirEsportivo("Azul", "Preto");
        pedido.add(carroDoFilho);
        System.out.println("\nCarro Esportivo personalizado adicionado ao pedido");

        CarroSedan carroDaMae = carroBuilder.construirSedan("Cinza", "Branco");
        pedido.add(carroDaMae);
        System.out.println("\nCarro Sedan personalizado adicionado ao pedido");

        CarroSedan carroDaFilha = (CarroSedan) carroDaMae.clone();
        pedido.add(carroDaFilha);
        System.out.println("\nCarro Sedan personalizado adicionado ao pedido");

        System.out.println("\nResumo do pedido: \n");
        for (Carro c : pedido) {
            System.out.println(c);
            precoPedido += c.getValor();
            System.out.println();
        }

        System.out.printf("Preço do pedido = R$%.2f", precoPedido);
    }
}