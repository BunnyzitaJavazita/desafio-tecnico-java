package desafio2;

public class Estoque {

    public void movimentar(Produto produto, Movimentacao movimentacao) {

        if (movimentacao.getTipo().equalsIgnoreCase("ENTRADA")) {

            produto.setEstoque(
                produto.getEstoque() + movimentacao.getQuantidade()
            );

        } else if (movimentacao.getTipo().equalsIgnoreCase("SAIDA")) {

            produto.setEstoque(
                produto.getEstoque() - movimentacao.getQuantidade()
            );
        }
    }
}