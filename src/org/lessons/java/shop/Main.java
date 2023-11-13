package org.lessons.java.shop;

import java.util.Random;

public class Main {
	public static void main(String[] args) {
		
		Prodotto p1 = new Prodotto("Cuffie","Cuffie Wireless" ,29.99d,22);
		
		Prodotto p2 = new Prodotto("Tasctiera","Tastiera Meccanica Wireless - Italiana QWERTY USB Ergonomica",99.99,22);
		
		
		System.out.println("P1:");
		System.out.println("Codice: " + p1.getCodice());
		System.out.println("Nome:" + " " + p1.getNome());
		System.out.println("Descrizione:" + " " + p1.getDescrizione());
		System.out.println("Prezzo Netto: " + " " + p1.getPrezzo() + "€");
		System.out.println("Prezzo Lordo: " + " " + p1.getPrezzoCompleto() + "€");
		System.out.println("------------------------");
		
		System.out.println("P1:");
		System.out.println("Codice: " + p2.getCodice());
		System.out.println("Nome:" + " " + p2.getNome());
		System.out.println("Descrizione:" + " " + p2.getDescrizione());
		System.out.println("Prezzo Netto: " + " " + p2.getPrezzo() + "€");
		System.out.println("Prezzo Lordo: " + " " + p2.getPrezzoCompleto() + "€");
		System.out.println("------------------------");
		
	}
}
