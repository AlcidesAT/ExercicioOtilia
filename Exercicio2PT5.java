/*
2 - Construir um método estático que deve ter a seguinte assinatura:
public static void contaTempo(int dia, int mês, int ano)
O método deve receber como parâmetro três inteiros representando dia, mês ano.
O método deve calcular e mostrar quanto tempo falta para que essa data aconteça,
contando a partir da data atual do sistema.
*/
package exercícios;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;
public class Exercicio2PT5 {
	public static void main(String[] args) {
		contaTempo(0,0,0);
	}
	public static void contaTempo(int dia, int mes, int ano) {
		LocalDate primeiraData = LocalDate.of(2024, 04, 04);
		Scanner dado = new Scanner(System.in);
		System.out.println("Informe o dia: ");
		dia = dado.nextInt();
		if (dia < 1 || dia > 31) {
			do {
				System.out.println("Informe o dia novamente: ");
				dia = dado.nextInt();
			} while (dia < 1 || dia > 31);
		}
		System.out.println("Informe o mes: ");
		mes = dado.nextInt();
		if (mes < 1 || mes > 12) {
			do {
				System.out.println("Informe o mes novamente: ");
				mes = dado.nextInt();
			} while (mes < 1 || mes > 12);
		}
		System.out.println("Informe o ano: ");
		ano = dado.nextInt();
		if (ano < 2024) {
			do {
				System.out.println("Informe o ano novamente: ");
				ano = dado.nextInt();
			} while (ano < 2024);
		}
		LocalDate segundaData = LocalDate.of(ano, mes, dia);
		Period periodo = Period.between(primeiraData, segundaData);
		int dias = periodo.getDays();
		int meses = periodo.getMonths();
		int anos = periodo.getYears();
		System.out.println("A diferença é " + anos + " ano(s), " + meses + " mes(es) e " + dias + " dia(s). ");
	}
}
