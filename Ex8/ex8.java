//8. Sabendo que uma milha marítima equivale a um mil, oitocentos e cinquenta e
//dois metros e que um quilômetro possui mil metros, fazer um programa para
//converter milhas marítimas em quilômetros. 
//Breno e Yago
import java.util.Scanner;

public class ex8 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite a quantidade de milhas:");
		double milha = scan.nextDouble();
		double km = milha * 1852 / 1000;
		System.out.println ("A quantidade de KM é " + km);
		scan.close();
	}
}
