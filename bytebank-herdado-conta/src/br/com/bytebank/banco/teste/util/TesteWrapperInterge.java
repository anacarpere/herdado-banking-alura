package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.List;

public class TesteWrapperInterge {

	public static void main(String[] args) {
	
		int[] idades = new int[5];
        String[] nomes = new String[5];

        int idade = 29; //Integer
        
        //O que acontece por debaixo dos panos - transforma automático um int em uma referencia (da classe Integer) 
        //Integer idadeRef = new Integer(29);
        
        
        //Transformando o 350 em referência Integer - autoboxing
        Integer idadeRef = Integer.valueOf(350);
        
        //Transformando a idadeRef em um primitivo - unboxing
        int idadeInt = idadeRef.intValue() + 1;
        

        
        String s = args[0];
        Integer numero = Integer.valueOf(s);
        System.out.println(numero);
        
        //passei o valor da String para um int
        int numeroParseString = Integer.parseInt(s);
        
        System.out.println("O número que era String vezes 2 é o " + (numeroParseString * 2));
        
        System.out.println(idadeInt);
        
        List<Integer> numeros = new ArrayList<Integer>();
        numeros.add(28); //Autoboxing - transformou o 29 em uma referencia

        numeros.add(idadeRef);
        
        Integer pos1 = numeros.get(1);
        
        System.out.println(pos1);
        
        System.out.println(numeros.get(0).doubleValue());
        
	}

}
