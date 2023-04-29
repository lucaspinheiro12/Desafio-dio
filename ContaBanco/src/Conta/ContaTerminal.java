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
		
		System.out.println("Olá " +nome +", obrigado por criar uma conta em nosso banco, sua agência é " + agencia+
				", conta " + numeroConta +" e seu saldo " + saldo +" já está disponível para saque.");
	}
	
}
