package motores;

public class MotorSedan extends Motor {
    private final String tipoMotor = "Motor Sedan";
    private final int cavalosPotencia = 300;

    public MotorSedan() {
    }

    public String getTipoMotor() {
        return tipoMotor;
    }

    public int getCavalosPotencia() {
        return cavalosPotencia;
    }
}
