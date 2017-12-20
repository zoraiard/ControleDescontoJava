import java.util.ArrayList;

public class Principal {

	public static void main(String[] args)  { 
		
		
		ArrayList<CompraCombustivel> listaCompras = new ArrayList<>();
		
		Combustivel gasolina = new Combustivel("Gasolina", 3.86, 6, 4);
		Combustivel alcool = new Combustivel("Álcool",  3.06, 5, 3);
		
		CompraCombustivel ccGasolinaMenos20Litros = new CompraCombustivel(gasolina, 12, 3);
		CompraCombustivel ccGasolinaMais20Litros = new CompraCombustivel(gasolina, 28, 8);
		CompraCombustivel ccAlcoolMenos20Litros = new CompraCombustivel(alcool, 16, 2);
		CompraCombustivel ccAlcoolMais20Litros = new CompraCombustivel(alcool, 50, 5 );
		
		CompraCombustivel.setLimiteLitroDesconto(20);
		
		listaCompras.add(ccGasolinaMenos20Litros);
		listaCompras.add(ccGasolinaMais20Litros);
		listaCompras.add(ccAlcoolMais20Litros);
		listaCompras.add(ccAlcoolMenos20Litros);
	
		CarrinhoCompra compraDeVariosCombustiveis = new CarrinhoCompra();
	
		compraDeVariosCombustiveis.adicionaCompra( ccGasolinaMenos20Litros );
		compraDeVariosCombustiveis.adicionaCompra( ccGasolinaMais20Litros );
		compraDeVariosCombustiveis.adicionaCompra( ccAlcoolMais20Litros );
		compraDeVariosCombustiveis.adicionaCompra( ccAlcoolMenos20Litros );
		
		compraDeVariosCombustiveis.mostraResultado();
		
			
			
	}
		
	
}
