package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.List;

public class TesteOutrosWrapper {

	public static void main(String[] args) {
		
		Integer idadeRef = Integer.valueOf(29);//outboxing
		
		System.out.println(idadeRef.intValue()); //unboxing
		
		
		
		Double dRef = 3.2;
		
		Double dRefMelhor = Double.valueOf(3.5);
		System.out.println(dRef.doubleValue());
		
		
		//poderia usar bRef = false que ele já faria;
		Boolean bRef = Boolean.TRUE;
		System.out.println(bRef.booleanValue());
		
		Number refNumero = Integer.valueOf(30);
		
		
		//posso colocar qulquer referencia de número pq usei a classe mãe que é Number 
		List<Number> lista = new ArrayList<>();
		lista.add(6.8);
		lista.add(6);
		lista.add(25.6f);
		
		
		
	}

}
