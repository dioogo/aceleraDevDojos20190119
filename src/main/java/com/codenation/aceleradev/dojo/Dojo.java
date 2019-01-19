package com.codenation.aceleradev.dojo;

import java.util.Map;

public class Dojo {

	public double calculate(Map<Integer, Integer> books) {
		int quantity = 0;
		double price = 42.0;
		double discount = (books.size() - 1) * 0.05 ;
		
		for( int x : books.keySet()) {
			quantity += books.get(x);
		}
		
		return quantity * price - (discount * quantity * price);
		
	}
}
