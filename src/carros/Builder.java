package carros;

import motores.Motor;

public interface Builder {

   void definirMotor(Motor tipoMotor);
   void definirCorExterior(String cor);
   void definirCorInterior(String cor);
   void definirAssistencia(Boolean escolha);
   void definirNumPortas(int numPortas);
   void definirNumAssentos(int numAssentos);
}
