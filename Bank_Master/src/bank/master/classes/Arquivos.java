package bank.master.classes;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Arquivos {
	protected Boolean VeryConta(int numConta) {
		return new File("../bank_master/Bank_Master/src/bank/master/usuarios/" + numConta).exists();

	}

	protected Boolean VerySenha(String Usenha, int numConta) throws IOException {
		FileReader arqSenha = new FileReader(
				"../bank_master/Bank_Master/src/bank/master/usuarios/" + numConta + "/senha.txt");
		BufferedReader lerArq = new BufferedReader(arqSenha);
		String linha = lerArq.readLine();
		if (Usenha.equals(linha)) {
			arqSenha.close();
			return true;
		} else {
			arqSenha.close();
			return false;
		}
	}
}
