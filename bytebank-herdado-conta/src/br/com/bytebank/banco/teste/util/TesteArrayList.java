package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.List;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteArrayList {

	public static void main(String[] args) {
		ArrayList<Conta> lista = new ArrayList<Conta>();
		
		Conta cc = new ContaCorrente(15, 20);
		lista.add(cc);
		
		Conta cp = new ContaPoupanca(20, 30);
		lista.add(cp);
		
		Conta cc2 = new ContaCorrente(40, 10);
		lista.add(cc2);
		
		Conta cp3 = new ContaPoupanca(18, 30);
		lista.add(cp3);
		
		System.out.println(lista.size());
		
		Conta ref = lista.get(1);
		
		System.out.println(ref.getNumero());
		
		//lista.remove(0);
		
		System.out.println(lista.size());
		
//		for(int i = 0; i < lista.size(); i++) {
//			Object oRef = lista.get(i);
//			System.out.println(oRef);
//		}

		//jeito moderno de fazer
		for(Conta oRef: lista) {
			System.out.println(oRef);
		}
		
		List<String> listas = List.of("Ana", "Felipe", "Scooby");
	
	
		

	}

}
