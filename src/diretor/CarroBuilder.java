package diretor;

import carros.CarroEsportivo;
import carros.CarroSedan;
import motores.MotorEsportivo;
import motores.MotorSedan;

public class CarroBuilder {

    //Classe responsável por definir os atributos dos carros

    public CarroSedan construirSedan() {
        CarroSedan carro = new CarroSedan();
        carro.definirMotor(new MotorSedan());
        carro.definirAssistencia(true);
        carro.definirNumPortas(4);
        carro.definirNumAssentos(4);
        return carro;
    }

    public CarroEsportivo construirEsportivo() {
        CarroEsportivo carro = new CarroEsportivo();
        carro.definirMotor(new MotorEsportivo());
        carro.definirAssistencia(false);
        carro.definirNumPortas(2);
        carro.definirNumAssentos(2);
        return carro;
    }

    public CarroSedan construirSedan(String corExterior, String corInterior) {
        CarroSedan carro = new CarroSedan();
        carro.definirMotor(new MotorSedan());
        carro.definirCorExterior(corExterior);
        carro.definirCorInterior(corInterior);
        carro.definirAssistencia(true);
        carro.definirNumPortas(4);
        carro.definirNumAssentos(4);
        return carro;
    }

    public CarroEsportivo construirEsportivo(String corExterior, String corInterior) {
        CarroEsportivo carro = new CarroEsportivo();
        carro.definirMotor(new MotorEsportivo());
        carro.definirCorExterior(corExterior);
        carro.definirCorInterior(corInterior);
        carro.definirAssistencia(false);
        carro.definirNumPortas(2);
        carro.definirNumAssentos(2);
        return carro;
    }
}
