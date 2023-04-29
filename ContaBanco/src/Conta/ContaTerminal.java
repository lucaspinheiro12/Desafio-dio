package Conta;

import java.util.Scanner;

public class ContaTerminal {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o nome da conta: ");
		String nome = sc.nextLine();
		
		System.out.println("Digite o numero da agencia: ");
		String agencia = sc.nextLine();
		
		System.out.println("Digite o numero da conta: ");
		int numeroConta = sc.nextInt();
		
		System.out.println("Digite o saldo depositado: ");
		Double saldo = sc.nextDouble();
		
		Conta contaCliente = new Conta(numeroConta, agencia, nome, saldo);
		
		System.out.println("Olá " + contaCliente.getNome() +", obrigado por criar uma conta em nosso banco, sua agência é " + contaCliente.getAgencia()+
				", conta " + contaCliente.getNumeroConta() +" e seu saldo " + contaCliente.getSaldo() +" já está disponível para saque.");
	}
	
}
