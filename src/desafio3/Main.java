package desafio3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor: R$ ");
        double valor = scanner.nextDouble();

        scanner.nextLine();

        System.out.print("Digite a data de vencimento (dd/MM/yyyy): ");
        String dataTexto = scanner.nextLine();

        DateTimeFormatter formato =
                DateTimeFormatter.ofPattern("dd/MM/yyyy");

        LocalDate vencimento =
                LocalDate.parse(dataTexto, formato);

        CalculoJuros calculo = new CalculoJuros();

        double juros =
                calculo.calcular(valor, vencimento);

        System.out.println();
        System.out.println("Valor original: R$ " + valor);
        System.out.println("Juros: R$ " + juros);
        System.out.println("Valor total: R$ " + (valor + juros));

        scanner.close();
    }
}