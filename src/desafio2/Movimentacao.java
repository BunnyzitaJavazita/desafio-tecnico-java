package desafio2;

public class Movimentacao {

    private int id;
    private int codigoProduto;
    private String tipo;
    private int quantidade;
    private String descricao;

    public Movimentacao() {
    }

    public Movimentacao(int id, int codigoProduto, String tipo, int quantidade, String descricao) {
        this.id = id;
        this.codigoProduto = codigoProduto;
        this.tipo = tipo;
        this.quantidade = quantidade;
        this.descricao = descricao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCodigoProduto() {
        return codigoProduto;
    }

    public void setCodigoProduto(int codigoProduto) {
        this.codigoProduto = codigoProduto;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}