package desafioAnbima;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculaImpostoTest {

	@Test
	public void calculaImpostoTest() {
		double salario = 1000.00;
		int dependentes = 0;
		String valorInssEsperado = "80,00";
		String valorIrpfEsperdo = "0,00";
		String descontoTotalEsperado = "80,00";
		String salarioFinalEsperado = "920,00";
		
		CalculaImposto teste = new CalculaImposto(salario, dependentes);
		String test[] = new String [4] ;
		test[0]= teste.calculaImpostoInss();
		test[1] = teste.calculaImpostoIrpf();
		test[2]= teste.descontoTotal();
		test[3]= teste.salarioFinal();
		assertEquals(valorInssEsperado, test[0]);
		assertEquals(valorIrpfEsperdo, test[1]);
		assertEquals(descontoTotalEsperado, test[2]);
		assertEquals(salarioFinalEsperado, test[3]);
	}
	
	@Test
	public void calculaImpostoTestDois() {
		double salario = 3000.00;
		int dependentes = 2;
		String valorInssEsperado = "330,00";
		String valorIrpfEsperdo = "29,01";
		String descontoTotalEsperado = "359,01";
		String salarioFinalEsperado = "2640,99";
		
		CalculaImposto teste = new CalculaImposto(salario, dependentes);
		String test[] = new String [4] ;
		test[0]= teste.calculaImpostoInss();
		test[1] = teste.calculaImpostoIrpf();
		test[2]= teste.descontoTotal();
		test[3]= teste.salarioFinal();
		assertEquals(valorInssEsperado, test[0]);
		assertEquals(valorIrpfEsperdo, test[1]);
		assertEquals(descontoTotalEsperado, test[2]);
		assertEquals(salarioFinalEsperado, test[3]);
	}
	
	@Test
	public void calculaImpostoTestTres() {
		double salario = 6000.00;
		int dependentes = 0;
		String valorInssEsperado = "642,34";
		String valorIrpfEsperdo = "604,00";
		String descontoTotalEsperado = "1246,34";
		String salarioFinalEsperado = "4753,66";
		
		CalculaImposto teste = new CalculaImposto(salario, dependentes);
		String test[] = new String [4] ;
		test[0]= teste.calculaImpostoInss();
		test[1] = teste.calculaImpostoIrpf();
		test[2]= teste.descontoTotal();
		test[3]= teste.salarioFinal();
		assertEquals(valorInssEsperado, test[0]);
		assertEquals(valorIrpfEsperdo, test[1]);
		assertEquals(descontoTotalEsperado, test[2]);
		assertEquals(salarioFinalEsperado, test[3]);
	}
	
	@Test
	public void calculaImpostoTestQuatro() {
		double salario = 5000.00;
		int dependentes = 0;
		String valorInssEsperado = "550,00";
		String valorIrpfEsperdo = "365,12";
		String descontoTotalEsperado = "915,12";
		String salarioFinalEsperado = "4084,88";
		
		CalculaImposto teste = new CalculaImposto(salario, dependentes);
		String test[] = new String [4] ;
		test[0]= teste.calculaImpostoInss();
		test[1] = teste.calculaImpostoIrpf();
		test[2]= teste.descontoTotal();
		test[3]= teste.salarioFinal();
		assertEquals(valorInssEsperado, test[0]);
		assertEquals(valorIrpfEsperdo, test[1]);
		assertEquals(descontoTotalEsperado, test[2]);
		assertEquals(salarioFinalEsperado, test[3]);
	}


}
