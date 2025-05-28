package motores;

public class MotorEsportivo extends Motor {
    private final String tipoMotor = "Motor Esportivo";
    private final int cavalosPotencia = 510;

    public MotorEsportivo() {
    }

    public String getTipoMotor() {
        return tipoMotor;
    }

    public int getCavalosPotencia() {
        return cavalosPotencia;
    }
}
