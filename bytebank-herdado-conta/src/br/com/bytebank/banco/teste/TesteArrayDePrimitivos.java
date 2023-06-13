package br.com.bytebank.banco.teste;

public class TesteArrayDePrimitivos {

	public static void main(String[] args) {
		int [] idades = new int [5];
		
		idades [0] = 1;
		idades[1] =2;
		idades[2] =1;
		idades[3] =4;
		idades[4] =0;
		
		
		int idade4 = idades[3];
		
		System.out.println(idade4);
		
		
		for(int i = 0; i < idades.length; i++) {
			idades[i] = i * i;
		}
		
		for (int i = 0; i < idades.length; i++) {
            System.out.println(idades[i]);
        }
		
		int refs[] = {10,20,20,40};
		
		System.out.println(refs[3]);
	}
	
	
	
	

}
