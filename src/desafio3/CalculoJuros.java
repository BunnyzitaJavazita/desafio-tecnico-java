package desafio3;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class CalculoJuros {

    public double calcular(double valor, LocalDate vencimento) {

        LocalDate hoje = LocalDate.now();

        long diasAtraso = ChronoUnit.DAYS.between(vencimento, hoje);

        if (diasAtraso <= 0) {
            return 0;
        }

        double jurosPorDia = 0.025;

        return valor * jurosPorDia * diasAtraso;
    }
}