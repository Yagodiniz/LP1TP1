//12. Calcular e exibir o volume de um cone a partir dos valores da altura e do raio da base que serão digitados. 
//Breno e Yago
import java.util.Scanner;

public class ex12 {


	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Digite a altura do cone:");
		double altura = scan.nextDouble();
		System.out.println("Digite o raio do cone:");
		double raio = scan.nextDouble();
		double area = ((raio * raio) * 3.14 * altura) / 3 ;
		System.out.println("A area e " + area);
		scan.close();
	}
}
