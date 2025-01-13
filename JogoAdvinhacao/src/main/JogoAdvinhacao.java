package main;
import java.util.Scanner;
import java.util.Random;

public class JogoAdvinhacao {

	//FUNÇÃO QUE GERA UM NUMERO ALEATORIO
	public static int gerarNumero() {
		Random ram = new Random();
		return ram.nextInt(100)+1;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//INICIO DA PRIMEIRA FASE
		System.out.println("*** JOGO DA ADVINHAÇÃO ***\n");
		System.out.println("Numero sorteado...");
		System.out.println("Você tem 5 chances para passar de fase\n");
		
		//VARIAVEL QUE GUARDA O VALOR GERADO ALEATORIAMENTE PELA FUNÇÃO
		int numAleatorio = gerarNumero();
		int tentativas = 5;
		
		//LOOP QUE RODA A PRIMEIRA FASE COM O MAXIMO DE 5 TENTATIVAS
		for(int i = 0; i < tentativas;i++) {
			int palpite;
			System.out.print("Palpite: ");
			palpite = scan.nextInt();//PEGA UM NUMERO COMO PALPITE DO USUARIO
			
			if(palpite > numAleatorio) {
				System.out.printf("%d é maior que o número gerado\n",palpite);
				System.out.printf("Tentativas restantes: %d%n%n",(tentativas-(i+1)));
			}else if(palpite < numAleatorio) {
				System.out.printf("%d é menor que o número gerado\n",palpite);
				System.out.printf("Tentativas restantes: %d%n%n",(tentativas-(i+1)));
			}else{
				System.out.printf("%d é o número gerado, parabéns\n",palpite);
				System.out.printf("Número de tentativas: %d%n%n",i+1);
				break;
			}
			
			//CONDIÇÃO QUE SAI DO LOOP E TERMINA A FASE CASO O NUMERO DE TENTATIVAS ACABE
			if(i == tentativas - 1) {
				System.out.println("Lamentos, suas tentativas acabaram\n");
				return;
			}
		}
		
		//INICIO DA SEGUNDA FASE
		System.out.println("*** PROXIMA FASE ***\n");
		numAleatorio = gerarNumero();
		
		//CONDIÇÃO PARA PASSAR DE FASE
		System.out.printf("O numero gerado está entre %d e %d%n",(numAleatorio - 20),(numAleatorio + 20));
		System.out.println("Você tem 3 chances para passar de fase");
		
		tentativas = 3;
		
		//LOOP QUE RODA A SEGUNDA FASE COM ATE 3 REPETIÇÕES
		for(int i = 0; i < tentativas;i++) {
			System.out.print("Palpite: ");
			int palpite = scan.nextInt();
			
			if(palpite > numAleatorio) {
				System.out.printf("%d é maior que o número gerado\n",palpite);
				System.out.printf("Tentativas restantes: %d%n%n",(tentativas-(i+1)));
			}else if(palpite < numAleatorio) {
				System.out.printf("%d é menor que o número gerado\n",palpite);
				System.out.printf("Tentativas restantes: %d%n%n",(tentativas-(i+1)));
			}else{
				System.out.printf("%d é o número gerado, parabéns\n",palpite);
				System.out.printf("Número de tentativas: %d%n%n",i+1);
				break;
			}
			
			//CONDIÇÃO QUE SAI DO LOOP E TERMINA A FASE CASO O NUMERO DE TENTATIVAS ACABE
			if(i == tentativas - 1) {
				System.out.println("Lamentos, suas tentativas acabaram\n");
				return;
			}
		}
		
		System.out.println("*** ULTIMA FASE ***\n");
		System.out.printf("(%d * 5)/3\n",numAleatorio);
		System.out.println("Qual é o resultado da expressão acima?");
		//System.out.println("");
		
		float calc;
		
		//CONCATENAÇÃO DAS ALTERNATIVAS DA EXPRESSÃO
		System.out.printf("a) %.1f %nb) %.1f %nc) %.1f %nd) %.1f %ne) %.1f%n%n",calc = (numAleatorio * 5)/3,
		calc = (numAleatorio * 5)/2,calc = (numAleatorio * 7)/4,calc = (numAleatorio * 2)/6,calc = (numAleatorio * 4)/2);
		
		String alternativa = "opcao";
		System.out.print("Alternativa: ");
		alternativa = scan.next();
		
		//SWITCH COM AS ALTERNATIVAS CORRESPONDENTES ÀS POSSIVEIS RESPOSTAS
		switch(alternativa) {
		case("a"):
			calc = (numAleatorio * 5)/3;
		System.out.printf("a) %.1f%n",calc);
		System.out.println("Alternativa correta");
		break;
		case("b"):
			calc = (numAleatorio * 5)/2;
		System.out.printf("b) %.1f%n",calc);
		System.out.println("Alternativa incorreta");
		break;
		case("c"):
			calc = (numAleatorio * 7)/4;
		System.out.printf("a) %.1f%n",calc);
		System.out.println("Alternativa incorreta");
		break;
		case("d"):
			calc = (numAleatorio * 2)/6;
		System.out.printf("a) %.1f%n",calc);
		System.out.println("Alternativa incorreta");
		break;
		case("e"):
			calc = (numAleatorio * 4)/2;
		System.out.printf("a) %.1f%n",calc);
		System.out.println("Alternativa incorreta");
		break;
		default: System.out.println("Alternativa inválida");
		}
		scan.close();
	}
}
