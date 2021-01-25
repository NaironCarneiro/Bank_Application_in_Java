package bank.master.classes;

import java.io.IOException;
import java.util.Date;

public class LoginConta {

	public static int numConta;
	private final String senha;
	public static String sessao = null;

	public LoginConta(int numConta, String senha) throws IOException {
		this.numConta = numConta;
		this.senha = senha;

	}

	public Boolean login() throws IOException {

		Arquivos conta = new Arquivos();
		if (conta.VeryConta(numConta)) {
			if (conta.VerySenha(senha, numConta)) {
				Date dataHoraAtual = new Date(); // busca a data e hora atual do computador
				sessao = (numConta + String.valueOf(dataHoraAtual.getTime())); // pega o tempo e concatena com o nome
																				// para criar uma seçao
				Conta teste = new Conta();
				teste.carregarDados(sessao, numConta);
				return true;
			}
			return false;
		}
		return false;
	}
}
