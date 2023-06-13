package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteArrayReferences {

	public static void main(String[] args) {
		Object[] referencias = new Object[5];
		
		ContaCorrente c1 = new ContaCorrente(20, 30);
		referencias[0] = c1;
		
		ContaCorrente c2 = new ContaCorrente(40, 10);
		referencias[1] = c2;
		
		ContaPoupanca cp = new ContaPoupanca(56, 23);
		referencias[2] = cp;
		
		
		//System.out.println(referencias[1].getNumero());
		
		Object referencia = referencias[1];
		
		String ref3 = referencia.toString();
		
		
		
		ContaPoupanca ref4 = (ContaPoupanca) referencias[2];
		
		
		System.out.println(ref3);
		System.out.println(ref4);
	
		
		
	}

}
