package desafio1;

public class Main {

    public static void main(String[] args) {

        LeitorVendas leitor = new LeitorVendas();

        DadosVendas dados = leitor.ler();

        Comissao comissao = new Comissao();

        for (Venda venda : dados.getVendas()) {

            double valorComissao = comissao.calcular(venda);

            System.out.println(
                venda.getVendedor()
                + " - Venda: R$ "
                + venda.getValor()
                + " - Comissão: R$ "
                + valorComissao
            );
        }
    }
}