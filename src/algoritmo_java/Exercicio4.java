package algoritmo_java;

/*Elabore um programa que l� o valor de 
 * x1, x2 e x3 para calcular (e imprimir)
 *  o resultado da express�o 
 * y = (x1 + 3)4 +(x2*x3)� */

public class Exercicio4 {
	public static void main(String[] args) {
		
		double x1 = 10;
		double x2 = 10 ;
		double x3 = 10;
		double y = Math.pow(x1 + 3,4)+ Math.pow(x2 * x3, 3);
		
		System.out.printf("O resultado �: %.0f " , y );
	 
	}
	
}
