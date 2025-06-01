package carros;

public abstract class Carro {
    private String corExterior;
    private String corInterior;
    private Boolean sistemaDeAssistencia;
    private int numPortas;
    private int numAssentos;
    private double valor;

    public double getValor() {
        return valor;
    }
}
