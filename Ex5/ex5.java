//5. Calcular e exibir o volume de uma esfera a partir do valor de seu diâmetro que será digitado.
//Breno e Yago
import java.util.Scanner;

public class ex5 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o diametro da esfera:");
		double diametro = scan.nextDouble();
		double raio = diametro / 2;
        double volume = raio * raio * raio * 3.14 * 4 / 3;
		System.out.println("A area é " + volume);
		scan.close();
	}
}
