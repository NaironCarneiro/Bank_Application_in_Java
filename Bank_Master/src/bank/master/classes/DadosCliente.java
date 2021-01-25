package bank.master.classes;

import java.util.ArrayList;

public abstract class DadosCliente {

    protected String nome;
    protected String cpf;
    protected int numconta;
    protected String senha;
    protected double saldo;
    protected ArrayList<String> extrato;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumconta() {
        return numconta;
    }

    public void setNumconta(int numconta) {
        this.numconta = numconta;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public ArrayList<String> getExtrato() {
        return extrato;
    }

}
