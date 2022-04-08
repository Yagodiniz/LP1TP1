//15. Entrar via teclado com o valor da cotação do dólar e uma certa quantidade de
//dólares. Calcular e exibir o valor correspondente em Reais (R$). 
//Breno e Yago
import java.util.Scanner;

public class ex15 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Digite a cotacao do dolar:");
		double cotacao = scan.nextDouble();
		System.out.println("Digite a quantidade de dolar:");
		double dolar = scan.nextDouble();
        double real = dolar * cotacao;
		System.out.print("O volume livre é R$");
        System.out.format("%.2f", real);
		scan.close();
	}
}
