/*Construir um programa para mostrar a data do sistema escrita por extenso usando as classes
discutidas e testando as demais formas, como por exemplo:
Hoje é quinta-feira, dia 04 de abril de 2024 e agora são 20 horas e 32 minutos.
Deve ser construída uma classe e um método para retornar a data nesse formato.
*/
package exercícios;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;
public class Exercicio1PT5 {
	public static void main(String[] args) {
		
		Date data = new Date();
		
		SimpleDateFormat dia = new SimpleDateFormat("EEEE");
		SimpleDateFormat diaS = new SimpleDateFormat("dd");
		SimpleDateFormat mes = new SimpleDateFormat("MMMM");
		SimpleDateFormat ano = new SimpleDateFormat("y");
		SimpleDateFormat horas = new SimpleDateFormat("HH");
		SimpleDateFormat minutos = new SimpleDateFormat("m");
		
		String dia1 = dia.format(data);
		String diaS1 = diaS.format(data);
		String mes1 = mes.format(data);
		String ano1 = ano.format(data);
		String horas1 = horas.format(data);
		String minutos1 = minutos.format(data);
		System.out.println("Hoje é " +dia1+", dia " +diaS1+ " de " +mes1+ " de " +ano1+ " e agora são " +horas1+" horas e " +minutos1+" minutos");
	}
}
