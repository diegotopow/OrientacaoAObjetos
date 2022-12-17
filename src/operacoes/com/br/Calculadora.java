package operacoes.com.br;

public class Calculadora {
	String operacao;
	double resultado;
	
	public double somarNumeros(int num1, int num2) {
		operacao = "Soma";
		resultado = num1 + num2;
		return resultado;
	}
	
	public double subtrairNumeros(int num1, int num2) {
		operacao = "Subtração";
		resultado = num1 - num2;
		return resultado;
	}
	
	public double multiplicarNumeros(int num1, int num2) {
		operacao = "Multiplicação";
		resultado = num1 * num2;
		return resultado;
	}
	
	public double dividirNumeros(int num1, int num2) {
		operacao = "Divisão";
		if (num2 == 0) {
			System.out.println("Parâmetro inválido");
		} else {
			resultado = num1 / num2;
		}
		
		return resultado;
	}
	
	public void imprimeOperacao() {
		System.out.println("Operação " + operacao);
	}
	
}
