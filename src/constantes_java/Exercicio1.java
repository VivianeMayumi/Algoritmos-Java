package constantes_java;

import java.util.Scanner;

/*Crie um programa que calcula a hipotenusa de um triângulo retângulo.
 * Para isso, o usuário deverá digitar os valores dos catetos.
 * 
 * dica: lembre-se que  h= raiz quadadrada de c1² + c2²
 */
public class Exercicio1 {
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		double c1 = sc.nextDouble();
		double c2 = sc.nextDouble() ;
		
		double h = Math.sqrt(Math.pow(c1, 2) + Math.pow(c2, 2));
		
		System.out.printf("O valor da hipotenusa  = " + h);
		
		sc.close();
	}
}
