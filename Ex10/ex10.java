//10. Entrar via teclado com o valor de uma temperatura em graus Celsius, calcular e
//exibir sua temperatura equivalente em Fahrenheit. 
//Breno e Yago
import java.util.Scanner;

public class ex10 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Digite a temperatura em Celsius:");
		double celsius = scan.nextDouble();
		double Fahrenheit = celsius * 1.8 + 32; 
		System.out.println ("A temperatura em Fahrenhei é " + Fahrenheit);
		scan.close();
	}
}
