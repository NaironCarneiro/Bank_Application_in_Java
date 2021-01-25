package bank.master.classes;

import java.io.IOException;
import java.util.ArrayList;

public interface AcoesConta {
	public ArrayList<String> depositar(int numConta2, double valor, Boolean confime) throws IOException;

	public Boolean sacar(double valorSaque) throws IOException;

	public ArrayList<String> transferir(int numConta, double valor, Boolean confirme) throws IOException;

}
