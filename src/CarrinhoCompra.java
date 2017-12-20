import java.util.ArrayList;

public class CarrinhoCompra {

	ArrayList<CompraCombustivel> listaCompras = new ArrayList<>();
	
	public void adicionaCompra(CompraCombustivel compraCombustivel) {
		
		listaCompras.add(compraCombustivel);
	}
	
	public void mostraResultado() {
		System.out.println("..........................................................");
		for (CompraCombustivel compraCombustivel : listaCompras) {
			System.out.println("Combustível/Preço "+compraCombustivel.getCombustivel().getDescricao()
					+" Preço:"+compraCombustivel.getCombustivel().getPreco()) ;
			System.out.println("Qtd. Litros: " +compraCombustivel.getLitrosComprados());
			System.out.println("Desconto Informado: " +compraCombustivel.getDesconto()+"%");
					
			System.out.println("Valor Bruto     :"+compraCombustivel.calculaValorBruto());
			System.out.println("   Desconto     :"+compraCombustivel.calculaValorDesconto());
			System.out.println("Valor Venda     :"+compraCombustivel.calculaValorVenda());
			System.out.println("..........................................................");
		} 
			
	}
}
