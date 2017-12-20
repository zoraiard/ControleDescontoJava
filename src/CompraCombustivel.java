import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;

public class CompraCombustivel {

	private Combustivel combustivel;
	private double litrosComprado;
	private double desconto;
	private double valorDesconto;
	private double valorBruto;
	private double totalVenda;
	private static double limiteLitroDesconto;
	
	public CompraCombustivel(Combustivel combustivel, double litros, double desconto) {
		this.combustivel = combustivel;
		this.litrosComprado = litros;
		this.desconto = desconto;
	}
	
	public double calculaValorBruto() {

		valorBruto = combustivel.getPreco() * litrosComprado;

		return tratarArrendondamento(valorBruto);
	}
	

	public double calculaValorDesconto() {

		calculaValorBruto();

		valorDesconto = (valorBruto * desconto) / 100;

		return tratarArrendondamento(valorDesconto);

	}
	

	public double calculaValorVenda() {
		
		totalVenda = valorBruto - valorDesconto;
		
		if (limiteDeDescontoMaximoFoiUltrapassado())
		   throw new LimiteDeDescontoMaximoFoiUltrapassadoException("O limite de Desconto máximo é de "+
				   combustivel.getDescontoMaximo()+" % na compra de mais de "+limiteLitroDesconto +" litros de "+combustivel.getDescricao());
		
		if (limiteDeDescontoMinimoFoiUltrapassado())
		   throw new LimiteDeDescontoMinimoFoiUltrapassadoException("O limite de Desconto mínimo é de "+
				   combustivel.getDescontoMinimo()+" % na compra de até "+ limiteLitroDesconto +" litros de "+combustivel.getDescricao());

		return tratarArrendondamento(totalVenda);
	}

	
	public double tratarArrendondamento(double valor) {

		BigDecimal bigDecimal = new BigDecimal(valor).setScale(2, RoundingMode.HALF_EVEN);

		return bigDecimal.doubleValue();
	}

	
	public Combustivel getCombustivel() {
		return combustivel;
	}

	
	public static void setLimiteLitroDesconto(double limiteLitroDesconto) {
		CompraCombustivel.limiteLitroDesconto = limiteLitroDesconto;
	}

	
	public double getLitrosComprados() {
		return this.litrosComprado;
	}

	
	public static double getLimiteLitroDesconto() {
		return CompraCombustivel.limiteLitroDesconto;
	}

	
	private boolean limiteDeDescontoMinimoFoiUltrapassado() {
		return ((desconto > combustivel.getDescontoMinimo()) && (litrosComprado <= limiteLitroDesconto));

	}

	private boolean limiteDeDescontoMaximoFoiUltrapassado() {
		return ((desconto > combustivel.getDescontoMaximo()) && (litrosComprado > limiteLitroDesconto));
						
	}

	public double getDesconto() {
		return desconto;
	}

	

	
}
