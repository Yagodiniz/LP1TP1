//6. Calcular e exibir a média aritmética de quatro valores quaisquer que serão digitados. 
//Breno e Yago
import java.util.Scanner;

public class ex6 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Digite 4 valores em sequencia:");
		double v1 = scan.nextDouble();
		double v2 = scan.nextDouble();
		double v3 = scan.nextDouble();
		double v4 = scan.nextDouble();
        double media = ( v1 + v2 + v3 + v4) / 4;
		System.out.println("A média aritimética é  " + media);
		scan.close();
	}
}
