package desafio1;

public class Comissao {

    public double calcular(Venda venda) {

    double valor = venda.getValor();

    if (valor < 100) {
        return 0;
    } else if (valor < 500) {
        return valor * 0.01;
    } else {
        return valor * 0.05;
       }
    }
}
    
  
