package constantes_java;

import java.util.Scanner;

/*Crie um programa que l� a hipotenusa h de um tri�ngulo ret�ngulo e o �ngulo 
 * alpha que este forma com um dos catetos. Em seguida, imprima o valor dos tr�s
 * lados deste tri�ngulo
 * 
 * Dica: lembre-se que o cateto adjacente ao �ngulo alpha
 * ter� tamanho c1= cos(alpha) x h enquanto o cateto oposto ter� 
 * tamanho c2 = sen (alpha) x h
 * */

public class Exercicio2 {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite os valores da hipotenusa e do angulo alpha  (em graus): ");
		
		double hipotenusa = sc.nextDouble();
		double alpha =sc.nextDouble();
		
	//	double pi = alpha * Math.PI/180.0;
		
		double cateto1 = Math.cos(alpha) *hipotenusa;
		double cateto2 = Math.sin(alpha)*hipotenusa;
		
		System.out.printf("Os lados do tri�ngulo s�o:  "+ hipotenusa +"-"+ cateto1+"-" + cateto2);
		
		
		sc.close();
		
		
	}
	
	
}
