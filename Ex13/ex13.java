//13. Calcular e exibir a velocidade final (em km/h) de um automóvel, a partir dos
//valores da velocidade inicial (em m/s), da aceleração (m/s²) e do tempo de percurso
//(em s) que serão digitados. 
//Breno e Yago
import java.util.Scanner;

public class ex13 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Digite a velocidade inicial em m/s:");
		double vinicial = scan.nextDouble();
		System.out.println("Digite a aceleração em m/s²:");
		double aceleração = scan.nextDouble();
		System.out.println("Digite o tempo do percurso em segundos:");
		double tempo = scan.nextDouble();
		double vfinal = vinicial + aceleração * tempo;
		System.out.println("A velocidade final é " + vfinal * 3.6 + (" km/h"));
		scan.close();
	}
}
