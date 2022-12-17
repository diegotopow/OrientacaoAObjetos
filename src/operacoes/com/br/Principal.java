package operacoes.com.br;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Calculadora calcula = new Calculadora();
		Scanner leia = new Scanner(System.in);
		int n1, n2;
		double totalOperacao;
		
		System.out.println("Digite dois números");
		n1 = leia.nextInt();
		n2 = leia.nextInt();
		
		totalOperacao = calcula.somarNumeros(n1, n2);
		
		System.out.println("A soma dos números é =" + totalOperacao);
		calcula.imprimeOperacao();
	}

}
