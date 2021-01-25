package bank.master.classes;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class CadastrarConta extends DadosCliente {

	public CadastrarConta(String nome, String cpf, String senha) throws IOException {
		super();
		setNome(nome);
		setCpf(cpf);
		setSenha(senha);
		// O numero da conta e retirado do cpf que a pessoa indicar, so que o maximo de
		// caracter e 9
		if (cpf.length() == 11) {
			setNumconta(Integer.parseInt(cpf.substring(0, 9)));
		} else if (cpf.length() == 10) {
			setNumconta(Integer.parseInt(cpf.substring(0, 9)));
		} else if (cpf.length() <= 9) {
			setNumconta(Integer.parseInt(cpf));
		}
		try {
			craiandoConta();
		} catch (IOException e) {
			System.out.println("Falha ao criar conta: Erro" + e); // Try catch mostra onde ocorreu o erro para criar a
																	// conta e e uma forma de proteçao de erro do java
		}

	}

	public void craiandoConta() throws IOException {
		boolean success = (new File(
				"../bank_master/Bank_Master/src/bank/master/usuarios/" + String.valueOf(getNumconta()))).mkdir();

		if (success) {
			FileWriter dados = new FileWriter("../bank_master/Bank_Master/src/bank/master/usuarios/"
					+ String.valueOf(getNumconta()) + "/dados.txt");
			new FileWriter("../bank_master/Bank_Master/src/bank/master/usuarios/" + String.valueOf(getNumconta())
					+ "/extrato.txt");
			FileWriter saldo = new FileWriter("../bank_master/Bank_Master/src/bank/master/usuarios/"
					+ String.valueOf(getNumconta()) + "/saldo.txt");
			FileWriter senha = new FileWriter("../bank_master/Bank_Master/src/bank/master/usuarios/"
					+ String.valueOf(getNumconta()) + "/senha.txt");
			PrintWriter gravarDados = new PrintWriter(dados);
			PrintWriter gravarSenha = new PrintWriter(senha);
			PrintWriter gravarSaldo = new PrintWriter(saldo);
			gravarDados.printf(getNome() + "\n");
			gravarDados.printf(getCpf() + "\n");
			gravarSaldo.printf("0.0");
			gravarDados.printf(String.valueOf(getNumconta()) + "\n");
			gravarSenha.printf(getSenha() + "\n");
			senha.close();
			saldo.close();
			dados.close();
		} else {
			System.out.println("Essa conta ja existe");
		}

	}

}
