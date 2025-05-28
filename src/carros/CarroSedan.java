package carros;

import motores.Motor;
import motores.MotorSedan;

public class CarroSedan implements Prototype, Builder {

    private MotorSedan motor;
    private String corExterior = "Preto";
    private String corInterior = "Preto";;
    private Boolean sistemaDeAssistencia = true;
    private int numPortas;
    private int numAssentos;
    private double valor = 70000;

    public CarroSedan() {

    }

    // Trecho do código que permite a clonagem no Prototype

    private CarroSedan(CarroSedan modelo) {
        this.motor = modelo.motor;
        this.corExterior = modelo.corExterior;
        this.corInterior = modelo.corInterior;
        this.sistemaDeAssistencia = modelo.sistemaDeAssistencia;
        this.numPortas = modelo.numPortas;
        this.numAssentos = modelo.numAssentos;
        this.valor = modelo.valor;
    }


    // Trecho do código que permite que o Builder defina seus atributos
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
        return "Carro Sedan" +
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
        return new CarroSedan(this);
    }
}