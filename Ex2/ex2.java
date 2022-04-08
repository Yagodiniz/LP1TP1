//2. Calcular e exibir a área de um quadrado, a partir do valor de sua aresta que será digitado.
//Breno e Yago
import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Digite a aresta");
		int aresta = scan.nextInt();
        int area = aresta * aresta;
		System.out.println("A area é " + area);
		scan.close();
	}
}
