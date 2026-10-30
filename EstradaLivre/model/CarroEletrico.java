
package model;

public class CarroEletrico extends Carro implements Recarregavel {

    private double consumoDiarioKWh;

    public CarroEletrico(String placa, String modelo,
                         double valorDiaria, double consumoDiarioKWh) {

        super(placa, modelo, valorDiaria);
        this.consumoDiarioKWh = consumoDiarioKWh;
    }

    @Override
    public double calcularAluguel(int dias) {
        double aluguelCarro = super.calcularAluguel(dias);
        double taxaBateria = 15.0 * dias;

        return aluguelCarro + taxaBateria;
    }

    @Override
    public double calcularRecarga(int dias) {
        return dias * consumoDiarioKWh * 0.80;
    }
}
