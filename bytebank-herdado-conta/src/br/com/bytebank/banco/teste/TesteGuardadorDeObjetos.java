package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;
import br.com.bytebank.banco.modelo.GuardadorDeObjects;

public class TesteGuardadorDeObjetos {

	public static void main(String[] args) {
		
		GuardadorDeObjects guardador = new GuardadorDeObjects();
		
		ContaPoupanca cp = new ContaPoupanca(15, 20);
		
		guardador.adiciona(cp);
		
		ContaCorrente cc = new ContaCorrente(10, 30);
		
		guardador.adiciona(cc);
		
		int tamanho =  guardador.getQuantidadeDeElementos();
		
		System.out.println(tamanho);
		
		Conta ref = (ContaPoupanca) guardador.getReferencia(0);
		
		
		System.out.println(ref);
		
		
		
		
		
		

	}

}
