package br.com.bytebank.banco.teste.IO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteSerializacao {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		Cliente cliente = new Cliente();
		
		cliente.setNome("Ana");
		cliente.setCpf("123456789");
		cliente.setProfissao("dev");
		
		ContaCorrente contaCorrente = new ContaCorrente(123, 315);
		
		contaCorrente.deposita(210);
		contaCorrente.setTitular(cliente);
		
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("contaCorrente.bin"));
		
		oos.writeObject(contaCorrente);
		
		oos.close();
			

	}

}
