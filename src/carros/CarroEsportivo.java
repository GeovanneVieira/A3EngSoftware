package carros;

import motores.Motor;
import motores.MotorEsportivo;

public class CarroEsportivo extends Carro implements Prototype, Builder {
    private MotorEsportivo motor;
    private String corExterior = "Vermelho";
    private String corInterior = "Branco";
    private Boolean sistemaDeAssistencia = false;
    private int numPortas;
    private int numAssentos;
    private double valor = 120000;

    public CarroEsportivo() {
    }


    // Trecho do código que permite a clonagem dos atributos do objeto e implementa o método da Interface Prototype

    private CarroEsportivo(CarroEsportivo modelo) {
        this.motor = modelo.motor;
        this.corExterior = modelo.corExterior;
        this.corInterior = modelo.corInterior;
        this.sistemaDeAssistencia = modelo.sistemaDeAssistencia;
        this.numPortas = modelo.numPortas;
        this.numAssentos = modelo.numAssentos;
        this.valor = modelo.valor;
    }

    public Prototype clone() {
        return new CarroEsportivo(this);
    }

    // Trecho que implementa os métodos da Interface Builder
    // e permite que a classe CarroBuilder defina os atributos do objeto

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

    public double getValor() {
        return valor;
    }
    @Override
    public String toString() {
        String possuiAssistencia;
        if (sistemaDeAssistencia) {
            possuiAssistencia = "Está equipado com o sistema de assistência";
        } else {
            possuiAssistencia = "Não está equipado com o sistema de assistência";
        }

        return "Carro Esportivo" +
                "\nMotor: " + motor.getTipoMotor() + " com " + motor.getCavalosPotencia() + " cavalos de potência" +
                "\nCor Exterior: " + corExterior +
                "\nCor Interior: " + corInterior +
                "\nSistema de assistência: " + possuiAssistencia +
                "\nNúmero de portas: " + numPortas +
                "\nNúmero de assentos: " + numAssentos +
                "\nValor: R$" + valor;
    }
}
