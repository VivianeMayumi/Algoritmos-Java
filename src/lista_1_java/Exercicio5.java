package lista_1_java;

/*Codifique um programa que leia um n�mero
 *  inteiro composto por 5 d�gitos. O programa deve imprimir
este n�mero, de tal modo que cada d�gito seja impresso
 separado por 3 espa�os em branco do
pr�ximo d�gito. Por exemplo, o inteiro 42339 deve ser impresso desta forma:
4 2 3 3 9 */

public class Exercicio5 {

	public static void main(String[] args) {

		
			int numero = 42339;

		// converte o int em String e cria um array de chars com base na String
		char[] digitos = String.valueOf( numero ).toCharArray();

		// mostra cada char
		for ( char d : digitos ) 
			
		
			System.out.print( d + "   " );
		
	}

}


/*	int inteiro = 42339;

	int n1 = 4;
	int n2 = 2;
	int n3 = 3;
	int n4 = 3;
	int n5 = 9;
	System.out.println(inteiro);
	System.out.println(n1 + "   " + n2 + "   " + n3 + "   " + n4 + "   " + n5);

}
}*/
