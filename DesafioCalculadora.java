package fundamentos;

import java.util.Scanner;

		// calculador simples 
		// ler numero 1
		// ler numero 2
		// usuario vai escolher a opera��o + - * / ou m�dulo %

public class DesafioCalculadora 
{
	public static void main(String[] args) 
	{
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o primeiro numero: ");
		double num1 = entrada.nextDouble();
		
		System.out.print("Digite o segundo numero: ");
		double num2 = entrada.nextDouble();
		
		System.out.print("Escolha a opera��o + - * / % :");
		String opera��o = entrada.next();
		
		double resultado = "+".equals(opera��o) ? num1 + num2 : 0;
		resultado = "-".equals(opera��o) ? num1 - num2 : resultado;
		resultado = "*".equals(opera��o) ? num1 * num2 : resultado;
		resultado = "/".equals(opera��o) ? num1 / num2 : resultado;
		resultado = "%".equals(opera��o) ? num1 % num2 : resultado;
	
		
		System.out.printf("%.2f %s %.2f = %.2f", num1, opera��o, num2, resultado);
		
		
		entrada.close();
	}

}
