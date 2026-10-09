package desafio1;

public class Venda {
	
	private String vendedor;
	private double valor;
	
	public Venda(String vendedor, double valor) {
		super();
		this.vendedor = vendedor;
		this.valor = valor;
	}
	public String getVendedor() {
		return vendedor;
	}
	public void setVendedor(String vendedor) {
		this.vendedor = vendedor;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}

}
