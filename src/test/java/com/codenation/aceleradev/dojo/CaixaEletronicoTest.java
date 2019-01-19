package com.codenation.aceleradev.dojo;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class CaixaEletronicoTest {

	@Test
	public void testSacarCemReais() throws Exception {
		double valorSaque;
		valorSaque = 100;
		
		List<String> notas = new ArrayList<String>();

		CaixaEletronico caixaEletronico = new CaixaEletronico();
		notas = caixaEletronico.sacar(valorSaque);
		assertEquals(1, notas.size());
		assertEquals("100", notas.get(0));
	}
	
	@Test
	public void testSacar50Reais() throws Exception {
		double valorSaque;
		valorSaque = 50;
		
		List<String> notas = new ArrayList<String>();

		CaixaEletronico caixaEletronico = new CaixaEletronico();
		notas = caixaEletronico.sacar(valorSaque);
		assertEquals(1, notas.size());
		assertEquals("50", notas.get(0));
	}
	
	@Test
	public void testSacar20Reais() throws Exception {
		double valorSaque;
		valorSaque = 20;
		
		List<String> notas = new ArrayList<String>();

		CaixaEletronico caixaEletronico = new CaixaEletronico();
		notas = caixaEletronico.sacar(valorSaque);
		assertEquals(1, notas.size());
		assertEquals("20", notas.get(0));
	}
	
	@Test
	public void testSacar10Reais() throws Exception {
		double valorSaque;
		valorSaque = 10;
		
		List<String> notas = new ArrayList<String>();

		CaixaEletronico caixaEletronico = new CaixaEletronico();
		notas = caixaEletronico.sacar(valorSaque);
		assertEquals(1, notas.size());
		assertEquals("10", notas.get(0));
	}
	
	@Test
	public void testSacar200Reais() throws Exception {
		double valorSaque;
		valorSaque = 200;
		
		List<String> notas = new ArrayList<String>();

		CaixaEletronico caixaEletronico = new CaixaEletronico();
		notas = caixaEletronico.sacar(valorSaque);
		assertEquals(2, notas.size());
		assertEquals("100", notas.get(0));
		assertEquals("100", notas.get(1));
	}
	
	@Test
	public void testSacar230Reais() throws Exception {
		double valorSaque;
		valorSaque = 230;
		
		List<String> notas = new ArrayList<String>();

		CaixaEletronico caixaEletronico = new CaixaEletronico();
		notas = caixaEletronico.sacar(valorSaque);
		assertEquals(4, notas.size());
		assertEquals("100", notas.get(0));
		assertEquals("100", notas.get(1));
		assertEquals("20", notas.get(2));
		assertEquals("10", notas.get(3));
	}
	
	@Test
	public void testSacar340Reais() throws Exception {
		double valorSaque;
		valorSaque = 340;
		
		List<String> notas = new ArrayList<String>();

		CaixaEletronico caixaEletronico = new CaixaEletronico();
		notas = caixaEletronico.sacar(valorSaque);
		assertEquals(5, notas.size());
		assertEquals("100", notas.get(0));
		assertEquals("100", notas.get(1));
		assertEquals("100", notas.get(2));
		assertEquals("20", notas.get(3));
		assertEquals("20", notas.get(4));
	}
	
	@Test (expected = Exception.class)
	public void testSacar100NegativoReais() throws Exception {
		double valorSaque;
		valorSaque = -100;
		
		CaixaEletronico caixaEletronico = new CaixaEletronico();
		caixaEletronico.sacar(valorSaque);
	}
	
	@Test (expected = Exception.class)
	public void testSacarZeroReais() throws Exception {
		double valorSaque;
		valorSaque = 0;
		
		CaixaEletronico caixaEletronico = new CaixaEletronico();
		caixaEletronico.sacar(valorSaque);
	}
}
