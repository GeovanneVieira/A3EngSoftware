package carros;

import motores.Motor;
import motores.MotorSedan;

public class CarroSedan extends Carro implements Prototype, Builder {

    private MotorSedan motor;
    private String corExterior = "Preto";
    private String corInterior = "Preto";
    private Boolean sistemaDeAssistencia = true;
    private int numPortas;
    private int numAssentos;
    private double valor = 70000;

    public CarroSedan() {
    }

    // Trecho do código que permite a clonagem dos atributos do objeto e implementa o método da Interface Prototype

    private CarroSedan(CarroSedan modelo) {
        this.motor = modelo.motor;
        this.corExterior = modelo.corExterior;
        this.corInterior = modelo.corInterior;
        this.sistemaDeAssistencia = modelo.sistemaDeAssistencia;
        this.numPortas = modelo.numPortas;
        this.numAssentos = modelo.numAssentos;
        this.valor = modelo.valor;
    }

    public Prototype clone() {
        return new CarroSedan(this);
    }

    // Trecho que implementa os métodos da Interface Builder
    // e permite que a classe CarroBuilder defina os atributos do objeto

    public void definirMotor(Motor motor) {
        this.motor = (MotorSedan) motor;
    }

    public void definirCorExterior(String cor) {
        if (!cor.trim().isEmpty() && !cor.equalsIgnoreCase("Preto")) {
            this.corExterior = cor;
            this.valor += 3000;
        }
    }

    public void definirCorInterior(String cor) {
        if (!cor.trim().isEmpty() && !cor.equalsIgnoreCase("Preto")) {
            this.corInterior = cor;
            this.valor += 3500;
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
        String possuiAssistencia;
        if (sistemaDeAssistencia) {
            possuiAssistencia = "Está equipado com o sistema de assistência";
        } else {
            possuiAssistencia = "Não está equipado com o sistema de assistência";
        }

        return "Carro Sedan" +
                "\nMotor: " + motor.getTipoMotor() + " com " + motor.getCavalosPotencia() + " cavalos de potência" +
                "\nCor Exterior: " + corExterior +
                "\nCor Interior: " + corInterior +
                "\nSistema de assistência: " + possuiAssistencia +
                "\nNúmero de portas: " + numPortas +
                "\nNúmero de assentos: " + numAssentos +
                "\nValor: R$" + valor;
    }
}