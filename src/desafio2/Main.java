package desafio2;

public class Main {

    public static void main(String[] args) {

        LeitorEstoque leitor = new LeitorEstoque();

        DadosEstoque dados = leitor.ler();

        Estoque estoque = new Estoque();

        Movimentacao movimentacao = new Movimentacao(
            1,
            101,
            "SAIDA",
            20,
            "Saída de produtos"
        );

        for (Produto produto : dados.getEstoque()) {

            if (produto.getCodigoProduto() == movimentacao.getCodigoProduto()) {

                estoque.movimentar(produto, movimentacao);

                System.out.println(
                    "ID da movimentação: " + movimentacao.getId()
                );

                System.out.println(
                    "Produto: " + produto.getDescricaoProduto()
                );

                System.out.println(
                    "Tipo: " + movimentacao.getTipo()
                );

                System.out.println(
                    "Descrição: " + movimentacao.getDescricao()
                );

                System.out.println(
                    "Quantidade movimentada: " + movimentacao.getQuantidade()
                );

                System.out.println(
                    "Estoque final: " + produto.getEstoque()
                );
            }
        }
    }
}