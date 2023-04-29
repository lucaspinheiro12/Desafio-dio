package Conta;

public class Conta {

	private int numeroConta;
	private String agencia;
	private String nome;
	private double saldo;
	
	public Conta(int numero, String agencia, String nome, double saldo) {
		this.numeroConta = numero;
		this.agencia = agencia;
		this.nome = nome;
		this.saldo = saldo;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numero) {
		this.numeroConta = numero;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
}
