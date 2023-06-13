package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteOrdenacao {

	public static void main(String[] args) {
		
		Conta cc1 = new ContaCorrente(22, 33);
        Cliente clienteCC1 = new Cliente();
        clienteCC1.setNome("Nico");
        cc1.setTitular(clienteCC1);
        cc1.deposita(333.0);

        Conta cc2 = new ContaPoupanca(22, 44);
        Cliente clienteCC2 = new Cliente();
        clienteCC2.setNome("Guilherme");
        cc2.setTitular(clienteCC2);
        cc2.deposita(444.0);

        Conta cc3 = new ContaCorrente(22, 11);
        Cliente clienteCC3 = new Cliente();
        clienteCC3.setNome("Paulo");
        cc3.setTitular(clienteCC3);
        cc3.deposita(111.0);

        Conta cc4 = new ContaPoupanca(22, 22);
        Cliente clienteCC4 = new Cliente();
        clienteCC4.setNome("Ana");
        cc4.setTitular(clienteCC4);
        cc4.deposita(222.0);

        List<Conta> lista = new ArrayList<>();
        lista.add(cc1);
        lista.add(cc2);
        lista.add(cc3);
        lista.add(cc4);
        
        System.out.println("Contas sem ordenação");
        System.out.println();
        
        
        for (Conta conta : lista) {
			System.out.println(conta);
		}
        
        System.out.println("--------------------");
        System.out.println("Contas ordenadas pelo número da conta");
        System.out.println();
        
        
        //NumeroDaContaComparator numeroDaContaComparator = new NumeroDaContaComparator();
        
        //Como só vou usar o objeto para ordenar essa lista, posso fazer o construtor dentro do sort na parte do comparador 
        lista.sort(new NumeroDaContaComparator());
        
        for (Conta conta : lista) {
			System.out.println(conta);
		}
        
        System.out.println("--------------------");
        System.out.println("Contas ordenadas pelo nome do títular");
        System.out.println();
        
        
        //NomeTitularDaContaComparator nomeTitularDaContaComparator = new NomeTitularDaContaComparator();
        lista.sort(new NomeTitularDaContaComparator());
        
        for (Conta conta : lista) {
        	 System.out.println(conta + " Títular da conta: " + conta.getTitular().getNome());
			
		}
        
        System.out.println("--------------------");
        System.out.println("Contas ordenadas pela ordem natural (definida na Conta)");
        System.out.println();
           
        
        //Nessa parte usamos o método anterior ao método sort na classe List. chamando Collections ou aplicando null no sort é implememtado a ordenação natural
        //que precisa ser definida na classe Conta implementando a interface Comparable e sobreescrevendo o método CompareTo
        
        //Collections.sort(lista);
        
        lista.sort(null);
        
        for (Conta conta : lista) {
        	System.out.println(conta);
			
		}
        
        
        // o elemento de índice 2 passa para a posição dele menos 2 
        Collections.rotate(lista, 2);
        
        System.out.println("--------------------");
        System.out.println("Método Rotate)");
        System.out.println();
        
        for (Conta conta : lista) {
        	System.out.println(conta);
			
		}
        
        
       

	}

}

class NumeroDaContaComparator implements Comparator<Conta> {

	@Override
	public int compare(Conta c1, Conta c2) {
		
//		if(c1.getNumero() < c2.getNumero()) {
//			return -1;
//		}
//		
//		if(c1.getNumero() > c1.getNumero()) {
//			return 1;
//		}

		
		// Dessa forma não preciso do if pq a conta vai retornar 0, positivo ou negativo
		//return c1.getNumero() - c2.getNumero();
		
		return Integer.compare(c1.getNumero(), c2.getNumero());
	}
	
}

class NomeTitularDaContaComparator implements Comparator<Conta>{

	@Override
	public int compare(Conta c1, Conta c2) {
		
		String nomeTitularC1 = c1.getTitular().getNome();
		
		String nomeTitularC2 = c2.getTitular().getNome();
		
		return nomeTitularC1.compareTo(nomeTitularC2);
	}
	
}
