//7. Calcular e exibir a média geométrica de dois valores quaisquer que serão digitados. 
//Breno e Yago
import java.util.Scanner;

public class ex7 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Digite 2 valores em sequencia:");
		double v1 = scan.nextDouble();
		double v2 = scan.nextDouble();
        double media = Math.sqrt(v1 * v2);
		System.out.println("A média geométrica é " + media);
		scan.close();
	}
}
