package lista_1_java;

import java.util.Locale;
import java.util.Scanner;

/*Faça um programa que le dois pontos P1 = (x1, y1) e P2 = (x2, y2) e,
   calcule e imprima a
distância entre esses dois pontos, cujo valor é
 dado pela seguinte fórmula: dist = raiz quadrada de (x2 − x1)² + (y2 − y1)*/
public class Exercicio6 {
	public static void main (String[]args) {
		
		Scanner entrada = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		
		double x1 = entrada.nextDouble();
		double y1 = entrada.nextDouble();
		double x2 = entrada.nextDouble();
		double y2 = entrada.nextDouble();;
		double distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1,2));
		
		System.out.println("A distancia entre os ponto é: " + distancia);
		
		entrada.close();
	}
}

