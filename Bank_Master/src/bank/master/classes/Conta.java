package bank.master.classes;
import java.io.*;
import java.util.ArrayList;

public class Conta extends DadosCliente implements AcoesConta {
	
	
	public void carregarDados(String sessao, int numConta) throws IOException {
              
		if (sessao == LoginConta.sessao){
			int cont = 0;
			//carregar extrato
                                         

			FileReader arqExtrato = new FileReader("../bank_master/Bank_Master/src/bank/master/usuarios/"+LoginConta.numConta+"/extrato.txt");
			BufferedReader lerExtrato = new BufferedReader(arqExtrato);
			String linhaExtrato = lerExtrato.readLine();
			extrato = new ArrayList<String>();
			while (linhaExtrato != null) {
				this.extrato.add(linhaExtrato);
				linhaExtrato = lerExtrato.readLine(); // lê da segunda até a última linha
			}
			arqExtrato.close();

			//carrgar Saldo
			FileReader arqSaldo = new FileReader("../bank_master/Bank_Master/src/bank/master/usuarios/"+numConta+"/saldo.txt");
			BufferedReader lerSaldo = new BufferedReader(arqSaldo);
			String linhaSaldo = lerSaldo.readLine();
			double valor = 0;
			while (linhaSaldo != null) {
				 valor +=  Double.parseDouble(linhaSaldo);
				linhaSaldo = lerSaldo.readLine(); // lê da segunda até a última linha
			}
			setSaldo(valor);
			arqSaldo.close();

			//Carregar dados do usuario
			FileReader arqDados = new FileReader("../bank_master/Bank_Master/src/bank/master/usuarios/"+numConta+"/dados.txt");
			BufferedReader lerArq = new BufferedReader(arqDados);
			String linhaDados = lerArq.readLine();
			while (linhaDados != null) {
				switch (cont){
					case 0:
						setNome(linhaDados);
						break;
					case 1:
						setCpf(linhaDados);
						break;
					case 2:
						setNumconta(Integer.parseInt(linhaDados));
						break;
				}
				linhaDados = lerArq.readLine(); // lê da segunda até a última linha
				cont ++;
			}
			arqDados.close();

		}


	}

		


	@Override
	public ArrayList<String> depositar(int numConta, double valor,  Boolean confime) throws IOException {
		ArrayList<String> lista = new ArrayList<>();
		int cont = 0;
		if (!confime) {
			FileReader arqDados = new FileReader("../bank_master/Bank_Master/src/bank/master/usuarios/" + numConta + "/dados.txt");
			BufferedReader lerArq = new BufferedReader(arqDados);
			String linhaDados = lerArq.readLine();
			while (linhaDados != null) {
				switch (cont) {
					case 0:
						lista.add(linhaDados);
						break;
					case 1:
						lista.add(linhaDados);
						break;
					case 2:
						lista.add(linhaDados);
						break;
				}
				linhaDados = lerArq.readLine(); // lê da segunda até a última linha
				cont++;
			}
			arqDados.close();
			return lista;
		}else if (confime){
			FileWriter extra2 = new FileWriter("../bank_master/Bank_Master/src/bank/master/usuarios/" + String.valueOf(numConta) + "/extrato.txt", true);
			FileWriter sald2 = new FileWriter("../bank_master/Bank_Master/src/bank/master/usuarios/" + String.valueOf(numConta) + "/saldo.txt", true);
			BufferedWriter novaLinhaExtrato2 = new BufferedWriter(extra2);
			BufferedWriter novaLinhaSaldo2 = new BufferedWriter(sald2);
			novaLinhaExtrato2.write("Deposito Recebido: " + valor + "\n");
			novaLinhaSaldo2.write(String.valueOf("\n"+valor));
			novaLinhaExtrato2.newLine();
			novaLinhaSaldo2.newLine();
			novaLinhaExtrato2.close();
			novaLinhaSaldo2.close();
			extra2.close();
			sald2.close();
			lista.add("Deposito concluido com sucesso");
			return lista;
		}else {
			lista.add("Falha no Deposito");
			return  lista;
		}

	}

	@Override
	public Boolean sacar(double valorSaque) throws IOException {
		
		System.out.println("O saldo esta de : "+getSaldo());
		if (LoginConta.sessao != null){
			if (getSaldo()>=valorSaque){
				FileWriter extra = new FileWriter("../bank_master/Bank_Master/src/bank/master/usuarios/" + String.valueOf(LoginConta.numConta) + "/extrato.txt",true);
				FileWriter sald = new FileWriter("../bank_master/Bank_Master/src/bank/master/usuarios/" + String.valueOf(LoginConta.numConta) + "/saldo.txt",true);
				BufferedWriter novaLinhaExtrato = new BufferedWriter(extra);
				BufferedWriter novaLinhaSaldo = new BufferedWriter(sald);
				novaLinhaExtrato.write("Saque de: "+ valorSaque+ "\n");
				novaLinhaSaldo.write("-"+String.valueOf(valorSaque));
				novaLinhaExtrato.newLine();
				novaLinhaSaldo.newLine();
				novaLinhaExtrato.close();
				novaLinhaSaldo.close();
				extra.close();
				sald.close();
				carregarDados(LoginConta.sessao,LoginConta.numConta);
                                return true;
			}else {
                            return false;
				

			}
		}

		return false;
	}

	@Override
	public ArrayList<String> transferir(int numConta2, double valor, Boolean confime) throws IOException {
		carregarDados(LoginConta.sessao,LoginConta.numConta);
		ArrayList<String> lista = new ArrayList<>();
		int cont = 0;
		if (LoginConta.sessao != null){
			if (!confime) {

				FileReader arqDados = new FileReader("../bank_master/Bank_Master/src/bank/master/usuarios/" + numConta2+ "/dados.txt");
				BufferedReader lerArq = new BufferedReader(arqDados);
				String linhaDados = lerArq.readLine();
				while (linhaDados != null) {
					switch (cont) {
						case 0:
							lista.add(linhaDados);
							break;
						case 1:
							lista.add(linhaDados);
							break;
						case 2:
							lista.add(linhaDados);
							break;
					}
					linhaDados = lerArq.readLine(); // lê da segunda até a última linha
					cont++;
				}
				arqDados.close();
				return lista;
			} else if (confime) {
				carregarDados(LoginConta.sessao, LoginConta.numConta);

				if (getSaldo() >= valor) {
					FileWriter extra = new FileWriter("../bank_master/Bank_Master/src/bank/master/usuarios/" + String.valueOf(LoginConta.numConta) + "/extrato.txt", true);
					FileWriter sald = new FileWriter("../bank_master/Bank_Master/src/bank/master/usuarios/" + String.valueOf(LoginConta.numConta) + "/saldo.txt", true);
					BufferedWriter novaLinhaExtrato = new BufferedWriter(extra);
					BufferedWriter novaLinhaSaldo = new BufferedWriter(sald);
					novaLinhaExtrato.write("Transferencia Enviada: " + valor + "\n");
					novaLinhaSaldo.write("-" + String.valueOf(valor));
					novaLinhaExtrato.newLine();
					novaLinhaSaldo.newLine();
					novaLinhaExtrato.close();
					novaLinhaSaldo.close();
					extra.close();
					sald.close();
					FileWriter extra2 = new FileWriter("../bank_master/Bank_Master/src/bank/master/usuarios/" + String.valueOf(numConta2) + "/extrato.txt", true);
					FileWriter sald2 = new FileWriter("../bank_master/Bank_Master/src/bank/master/usuarios/" + String.valueOf(numConta2) + "/saldo.txt", true);
					BufferedWriter novaLinhaExtrato2 = new BufferedWriter(extra2);
					BufferedWriter novaLinhaSaldo2 = new BufferedWriter(sald2);
					novaLinhaExtrato2.write("Tranferencia Recebida: " + valor + "\n");
					novaLinhaSaldo2.write(String.valueOf("\n"+valor));
					novaLinhaExtrato2.newLine();
					novaLinhaSaldo2.newLine();
					novaLinhaExtrato2.close();
					novaLinhaSaldo2.close();
					extra2.close();
					sald2.close();
				}
				lista.add("Transferido com sucesso");
				return lista;
			}else {

			}

		}
		return lista;
	}
}
