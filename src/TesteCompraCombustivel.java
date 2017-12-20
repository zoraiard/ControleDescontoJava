import static org.junit.Assert.*;

import org.junit.Test;

public class TesteCompraCombustivel {

	@Test
	public void testTotalAbastecidoBruto() {
		
		Combustivel gasolina = new Combustivel( "Gasolina", 3.86,  6, 4);
		
		CompraCombustivel cc = new CompraCombustivel(gasolina, 20, 4);
		
		assertEquals(77.20, cc.calculaValorBruto(), 0); 
		
	}
	

	@Test
	public void testTotalDescontoGasolinaMenos20litros() {
		
		Combustivel gasolina = new Combustivel( "Gasolina", 3.86, 4, 6);
		
		CompraCombustivel cc = new CompraCombustivel(gasolina, 10, 4);
		
		assertEquals(38.6, cc.calculaValorBruto(), 0); 
		assertEquals(1.54, cc.calculaValorDesconto(), 0);
		assertEquals(37.06, cc.calculaValorVenda(), 0);
	}
	
	@Test
	public void testTotalDescontoGasolinaMais20Litros() {
		
		Combustivel gasolina = new Combustivel( "Gasolina", 3.86, 6, 4);
		
		CompraCombustivel cc = new CompraCombustivel(gasolina, 25, 6);
		
		cc.calculaValorBruto();
		
		assertEquals(96.50, cc.calculaValorBruto(), 0);
		assertEquals(5.79, cc.calculaValorDesconto(), 0);
		assertEquals(90.71, cc.calculaValorVenda(), 0);
		
	}
	
	
	@Test
	public void testTotalDescontoAlcoolMenos20Litros() {
		
		Combustivel gasolina = new Combustivel( "Alcool", 3.06, 5, 3);
		
		CompraCombustivel cc = new CompraCombustivel(gasolina, 15,3);
		
		cc.calculaValorBruto();
		
		assertEquals(45.9, cc.calculaValorBruto(), 0);
		assertEquals(1.38, cc.calculaValorDesconto(), 0);
		assertEquals(44.52, cc.calculaValorVenda(), 0);
	}
	
	
	@Test
	public void testTotalDescontoAlcoolMais20Litros() {
		
		Combustivel gasolina = new Combustivel( "Alcool", 3.06, 5,3);
		
		CompraCombustivel cc = new CompraCombustivel(gasolina, 35,5);
		
		cc.calculaValorBruto();
		
		assertEquals(5.36, cc.calculaValorDesconto(), 0); 
	}
	
}
