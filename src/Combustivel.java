
public class Combustivel {

	private String descricao;
	private double preco;
	private double descontoMaximo;
	private double descontoMinimo;
	

	public Combustivel(String descricao, double preco, double descontoMaximo, double descontoMinimo) {
		this.descricao = descricao;
		this.preco = preco;
		this.descontoMaximo = descontoMaximo;
		this.descontoMinimo = descontoMinimo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}


	public double getDescontoMinimo() {
		return descontoMinimo;
	}


	public double getDescontoMaximo() {
		return descontoMaximo;
	}

}
