//14. Calcular e exibir o volume livre de um ambiente que contém uma esfera de raio
//“r” inscrita em um cubo perfeito de aresta “a”. Os valores de “r “ e “a” serão digitados. 
//Breno e Yago
import java.util.Scanner;

public class ex14 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o valor da aresta do cubo:");
		double aresta = scan.nextDouble();
		System.out.println("Digite o raio da esfera:");
		double raio = scan.nextDouble();
        double vcubo = aresta * aresta * aresta;
        double vesfera = raio * raio * raio * 3.14 * 4 / 3;
	    double vlivre = vcubo - vesfera;
		if (vlivre >= 0 ) {
			System.out.println("O volume livre é " + vlivre) ;
		}	
		else 
		{
			System.out.println("O volume da esfera e maior do que o volume do cubo");
		}
		scan.close();
	}
}
