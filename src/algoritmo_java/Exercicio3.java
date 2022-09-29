package algoritmo_java;

/*Elabore um programa que lê o valor das variáveis a,b, c, d e e
 * do tipo float e, em seguida, calcula o resultado da expressão a seguir:
 * 
 * 	x = a³ x (b+c/d+e)
 * 
 * O resultado deve ser impresso no formato do exemplo abaixo:
 * 
 * a = 10, b = 10 , c = 10, d =10 , e =10
 * x = 12000*/

public class Exercicio3 {

	public static void main(String[] args) {
		
		float a = 10;
		float b = 10;
		float c = 10;
		float d = 10;
		float e = 10;
		float x = a*a*a*((b+c) / d +e);
		
	
		System.out.printf("a = %.0f, b = %.0f, c = %.0f, d= %.0f, e = %.0f",a, b, c, d,e );
		System.out.println();
		System.out.printf("x = %.0f ",x);

	}

}
