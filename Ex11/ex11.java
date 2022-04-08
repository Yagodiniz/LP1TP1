//11. A partir do diâmetro de um círculo que será digitado, calcular e exibir sua área. 
//Breno e Yago
import java.util.Scanner;

public class ex11 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o diametro do circulo:");
		double diametro = scan.nextDouble();
		double raio = diametro / 2;
		double area = (raio * raio) * 3.14; 
		System.out.println("A area é " + area);
		scan.close();
	}
}
