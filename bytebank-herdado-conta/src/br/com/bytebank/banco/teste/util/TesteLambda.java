package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteLambda {

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
        
        System.out.println("Contas sem ordena��o");
        System.out.println();
        
        
        for (Conta conta : lista) {
			System.out.println(conta);
		}
        
        
        
        
        System.out.println("--------------------");
        System.out.println("Contas ordenadas pelo n�mero da conta");
        System.out.println();
        
        
//        lista.sort(new Comparator<Conta>() {
//
//        	@Override
//        	public int compare(Conta c1, Conta c2) {
//        		
//        		return Integer.compare(c1.getNumero(), c2.getNumero());
//        	}
//        	
//        });      
//M�todo abaixo � igual ao de cima s� que no formato Lambda - Internamente, o Java gera uma classe que implementa a interface Comparator, e que cont�m o m�todo compare()
        
        lista.sort((c1, c2) -> Integer.compare(c1.getNumero(), c2.getNumero()) );

        
        lista.forEach((conta) -> System.out.println(conta));
        
        
//Abaixo � como o m�todo acima seria somento com Classe an�nima, sem o lambda // esse m�todo substitui o for        
//        lista.forEach(new Consumer<Conta>() {
//
//			@Override
//			public void accept(Conta conta) {
//				System.out.println(conta);
//				
//				
//			}
//		});
        
        
        
        System.out.println("--------------------");
        System.out.println("Contas ordenadas pelo nome do t�tular");
        System.out.println();
        

        
// abaixo comparator com String usando a Classe an�nima e depois ela como lambda
        
//        
//        Comparator<Conta> comp = new Comparator<Conta>() {       	
//        	@Override
//        	public int compare(Conta c1, Conta c2) {	
//        		String nomeTitularC1 = c1.getTitular().getNome();	
//        		String nomeTitularC2 = c2.getTitular().getNome();       		
//        		return nomeTitularC1.compareTo(nomeTitularC2);
//        	}
//        	    	       	
//		};
        
     
        Comparator<Conta> comp = (c1, c2) -> {	
        		String nomeTitularC1 = c1.getTitular().getNome();	
        		String nomeTitularC2 = c2.getTitular().getNome();       		
        		return nomeTitularC1.compareTo(nomeTitularC2);
        	       	
		};
		
        lista.sort(comp);
        
        
 // m�todo for usando sendo chamada pela lista e chamando com lambda a Interface Con
        lista.forEach((conta) -> System.out.println(conta + " T�tular da conta: " + conta.getTitular().getNome()) );    
        
	}

}
