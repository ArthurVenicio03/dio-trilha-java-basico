import java.util.Scanner;

public class Conta_Terminal {

	public static void main(String[] args) {
		//TODO: CRIANDO SCANNER --
		Scanner sc = new Scanner(System.in);
		//-----Criadno os prints e as variaveis
		System.out.println("Bem vindo ao banco do Brasil");
		
		System.out.println("Digite o numero da sua Conta: ");
		int numero = sc.nextInt();
		System.out.println("otimo!, agora qual a sua agência: ");
		String agencia = sc.next();
		System.out.println("Seu nome: ");
		String NomeCLiente = sc.next();
		System.out.println("Qual o valor que tem na sua conta?: ");
		Double Saldo = sc.nextDouble();
		sc.close();
		
		System.out.println("Olá " + NomeCLiente + ", Obrigado por criar uma conta em nosso banco, sua agência: " + agencia + ", conta: " 
		+ numero + ", e o seu saldo " + Saldo + " ja esta disponivel para Saque. " );		
	}
}
		