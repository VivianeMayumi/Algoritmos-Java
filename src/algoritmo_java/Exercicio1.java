package algoritmo_java;

/*Elabore um programa em que l� o valor das vari�veis x, y, ez 
 * do tipo int. Em seguida, calcule o reultado da express�o a seguir:
 *    
 *    r= x�+y�+ xy�
 *    
 *    Imprima o resultado no formato do exemplo abaixo:
 *    1 x = 10, y = 10, z= 10
 *    2 r = 2100*/
	public class Exercicio1 {
	public static void main(String[] args) {

	int x =10;
	int y = 10;
	int z = 10;
	int r = (x*x*x) + (y*y) +(x*y*z);
	
	System.out.println("x= "+ x +", "+ "y= "+ y+", "+"z= "+ z);
	System.out.println("O resultado da express�o  �: "+ r);
	
	}
}