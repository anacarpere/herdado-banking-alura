package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;
import br.com.bytebank.banco.modelo.GuardadorDeContas;

public class TesteGuardadorDeContas {

	public static void main(String[] args) {
		
		GuardadorDeContas guardador = new GuardadorDeContas();
		
		Conta cp = new ContaPoupanca(15, 20);
		
		guardador.adiciona(cp);
		
		Conta cc = new ContaCorrente(10, 30);
		
		guardador.adiciona(cc);
		
		int tamanho =  guardador.getQuantidadeDeElementos();
		
		System.out.println(tamanho);
		
		Conta ref = guardador.getReferencia(0);
		
		//é uma conta corrente
		ref.deposita(300);
		
		System.out.println(ref.getSaldo());
		
		
		
		

	}

}
