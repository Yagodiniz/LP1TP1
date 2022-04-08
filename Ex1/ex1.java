//1. Entrar via teclado com a base e a altura de um retângulo, calcular e exibir sua área.
// Breno e Yago
import java.util.Scanner;

public class ex1 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Digite a base do retangulo:");
		int base = scan.nextInt();
		System.out.println("Digite a altura do retangulo");
		int altura = scan.nextInt();
        int area = base * altura;
		System.out.println("A area e " + area );
		scan.close();
	}
}
