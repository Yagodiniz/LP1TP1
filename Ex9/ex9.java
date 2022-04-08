//9. Calcular e exibir a tensão de um determinado circuito eletrônico a partir dos
//valores da resistência e corrente elétrica que serão digitados. Utilize a lei de Ohm. 
//Breno e Yago
import java.util.Scanner;

public class ex9 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o valor da resistencia:");
		double vresistencia = scan.nextDouble();
		System.out.println("Digite o valor da corrente eletrica:");
		double vcorrente = scan.nextDouble();
		double tensao = vresistencia * vcorrente;
		System.out.println ("A tensao é: " + tensao);
		scan.close();
	}
}
