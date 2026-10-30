
package app;

import model.Veiculo;
import model.Carro;
import model.Moto;
import model.CarroEletrico;
import model.Recarregavel;

import java.util.ArrayList;
import java.util.List;

public class TesteLocadora {

    public static void main(String[] args) {

        // ERRO: Veiculo e abstrato e nao pode ser instanciado.
        // Veiculo generico = new Veiculo("AAA0000", "Generico", 100);

        Carro carro = new Carro("ABC1234", "Onix", 150.0);

        Moto moto4 = new Moto("DEF5678", "Honda CG 160", 80.0);
        Moto moto5 = new Moto("GHI9012", "Yamaha Fazer", 80.0);

        CarroEletrico eletrico = new CarroEletrico(
            "JKL3456", "BYD Dolphin", 200.0, 10.0
        );

        List<Veiculo> veiculos = new ArrayList<>();

        veiculos.add(carro);
        veiculos.add(moto4);
        veiculos.add(moto5);
        veiculos.add(eletrico);

        int[] diasAluguel = {3, 4, 5, 3};

        System.out.println("=== ESTRADA LIVRE ===");
        System.out.println("=== ALUGUEIS ===");

        for (int i = 0; i < veiculos.size(); i++) {

            Veiculo veiculo = veiculos.get(i);
            int dias = diasAluguel[i];

            veiculo.imprimirResumo();

            System.out.println("Dias: " + dias);
            System.out.println("Aluguel: R$ " +
                               veiculo.calcularAluguel(dias));
            System.out.println("--------------------");
        }

        List<Recarregavel> eletricos = new ArrayList<>();
        eletricos.add(eletrico);

        System.out.println("=== RECARGAS ===");

        for (Recarregavel recarregavel : eletricos) {
            System.out.println("Recarga: R$ " +
                               recarregavel.calcularRecarga(3));
        }
    }
}
