package com.codenation.aceleradev.dojo;

import java.util.ArrayList;
import java.util.List;

public class CaixaEletronico {
	
	double dinheiroRestante;
	
	public List<String> sacar(double valorSaque) throws Exception {
		int notaDe100 = 0;
		int notaDe50;
		int notaDe20;
		int notaDe10;
		List<String> resultado = new ArrayList<String>();
		
		if (valorSaque <= 0) {
			throw new Exception();
		}
		dinheiroRestante = valorSaque;
		
		notaDe100 = (int) valorSaque / 100;
		for(int i = 0; i < notaDe100; i++) {
			resultado.add("100");
		}
		
		dinheiroRestante = dinheiroRestante % 100;
		
		notaDe50 = (int) dinheiroRestante / 50;
		for(int i = 0; i < notaDe50; i++) {
			resultado.add("50");
		}
		
		dinheiroRestante = dinheiroRestante % 50;
		
		notaDe20 = (int) dinheiroRestante / 20;
		for(int i = 0; i < notaDe20; i++) {
			resultado.add("20");
		}
		
		dinheiroRestante = dinheiroRestante % 20;
		
		notaDe10 = (int) dinheiroRestante / 10;
		for(int i = 0; i < notaDe10; i++) {
			resultado.add("10");
		}

		return resultado;
	}

}
