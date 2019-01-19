package com.codenation.aceleradev.dojo;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class DojoTest {

	
	@Test
	public void testWithOneBook() {
		Map<Integer, Integer> books = new HashMap<Integer, Integer>();
		books.put(1, 1);
		
		Dojo dojo = new Dojo();
		assertEquals(42.0, dojo.calculate(books), 0.0001);
	}
	
	@Test
	public void testWithTwoBooks() {
		Map<Integer, Integer> books = new HashMap<Integer, Integer>();
		books.put(1, 1);
		books.put(2, 1);
		
		Dojo dojo = new Dojo();
		assertEquals(79.8, dojo.calculate(books), 0.0001);
	}
	
	@Test
	public void testWithThreeBooks() {
		Map<Integer, Integer> books = new HashMap<Integer, Integer>();
		books.put(1, 1);
		books.put(2, 1);
		books.put(3, 1);
		
		Dojo dojo = new Dojo();
		assertEquals(113.4, dojo.calculate(books), 0.0001);
	}
	
	@Test
	public void testWithFourBooks() {
		Map<Integer, Integer> books = new HashMap<Integer, Integer>();
		books.put(1, 1);
		books.put(2, 1);
		books.put(3, 1);
		books.put(4, 1);
		
		Dojo dojo = new Dojo();
		assertEquals(142.79999999, dojo.calculate(books), 0.0001);
	}
	
	@Test
	public void testWithFiveBooks() {
		Map<Integer, Integer> books = new HashMap<Integer, Integer>();
		books.put(1, 1);
		books.put(2, 1);
		books.put(3, 1);
		books.put(4, 1);
		books.put(5, 1);
		
		Dojo dojo = new Dojo();
		assertEquals(168, dojo.calculate(books), 0.0001);
	}
	
	@Test
	public void testWithFiveBooksWithDuplicated() {
		Map<Integer, Integer> books = new HashMap<Integer, Integer>();
		books.put(1, 3);
		books.put(2, 1);
		books.put(3, 1);
		
		Dojo dojo = new Dojo();
		assertEquals(189.0, dojo.calculate(books), 0.0001);
	}
	
	@Test
	public void testWithSixBooksWithDuplicated() {
		Map<Integer, Integer> books = new HashMap<Integer, Integer>();
		books.put(1, 3);
		books.put(2, 3);
		books.put(3, 1);
		
		Dojo dojo = new Dojo();
		assertEquals(264.6d, dojo.calculate(books), 0.0001);
	}
	
	@Test
	public void testWithEightBooksWithDuplicated() {
		Map<Integer, Integer> books = new HashMap<Integer, Integer>();
		books.put(1, 2);
		books.put(2, 2);
		books.put(3, 2);
		books.put(4, 1);
		books.put(5, 1);
		
		Dojo dojo = new Dojo();
		assertEquals(268.8d, dojo.calculate(books), 0.0001);
	}
}
