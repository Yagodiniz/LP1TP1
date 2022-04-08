//4. A partir dos valores da base e altura de um triângulo, calcular e exibir sua área. 
//Breno e Yago
import java.util.Scanner;

public class ex4 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Digite a base do triangulo:");
		double base = scan.nextDouble();
		System.out.println("Digite a altura do triangulo:");
		double altura = scan.nextDouble();
        double area = base * altura / 2;
		System.out.println("A area é " + area);
		scan.close();
	}
}
