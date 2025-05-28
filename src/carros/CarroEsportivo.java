package carros;

import motores.Motor;
import motores.MotorEsportivo;

public class CarroEsportivo implements Prototype, Builder {
    private MotorEsportivo motor;
    private String corExterior = "Vermelho";
    private String corInterior = "Branco";
    private Boolean sistemaDeAssistencia = false;
    private int numPortas;
    private int numAssentos;
    private double valor = 120000;

    public CarroEsportivo() {
    }


    // Trecho do código que permite a clonagem no Prototype
    private CarroEsportivo(CarroEsportivo modelo) {
        this.motor = modelo.motor;
        this.corExterior = modelo.corExterior;
        this.corInterior = modelo.corInterior;
        this.sistemaDeAssistencia = modelo.sistemaDeAssistencia;
        this.numPortas = modelo.numPortas;
        this.numAssentos = modelo.numAssentos;
        this.valor = modelo.valor;
    }

    // Trecho que implementa a Interface Builder e permite que a classe CarroBuilder altere os atributos
    public void definirMotor(Motor motor) {
        this.motor = (MotorEsportivo) motor;
    }

    public void definirCorExterior(String cor) {
        if (!cor.trim().isEmpty() && !cor.equalsIgnoreCase("Vermelho")) {
            this.corExterior = cor;
            this.valor += 5000;
        }
    }

    public void definirCorInterior(String cor) {
        if (!cor.trim().isEmpty() && !cor.equalsIgnoreCase("Branco")) {
            this.corInterior = cor;
            this.valor += 7500;
        }
    }

    public void definirAssistencia(Boolean escolha) {
        this.sistemaDeAssistencia = escolha;
    }

    public void definirNumPortas(int numPortas) {
        this.numPortas = numPortas;
    }

    public void definirNumAssentos(int numAssentos) {
        this.numAssentos = numAssentos;
    }
    @Override
    public String toString() {
        return "Carro Esportivo" +
                "\nMotor: " + motor.getTipoMotor() + " com " + motor.getCavalosPotencia() + " cavalos de potência" +
                "\nCor Exterior: " + corExterior +
                "\nCor Interior: " + corInterior +
                "\nSistema de assistência: " + sistemaDeAssistencia +
                "\nNúmero de portas: " + numPortas +
                "\nNúmero de assentos: " + numAssentos +
                "\nValor: R$" + valor;
    }

    // Implementação da Interface de Prototype
    public Prototype clone() {
        return new CarroEsportivo(this);
    }
}
