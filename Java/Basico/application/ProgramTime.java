package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class ProgramTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate dataNow =  LocalDate.now();//Retorna data local
		System.out.println(dataNow);
		
		LocalDateTime dataTimeNow = LocalDateTime.now();//Retorna data e horario local
		System.out.println(dataTimeNow);
		
		Instant dataTimeGlobal = Instant.now(); //Retorna data e hora global, horario GMT, esta usando o fuso de Londres,
		System.out.println(dataTimeGlobal);
		
		//
		LocalDate d01 = LocalDate.parse("2024-01-23"); //parse e usado para conversão de uma string para Data e Hora
		System.out.println(d01);
		
		LocalDateTime d02 = LocalDateTime.parse("2024-01-23T16:06:55");
		System.out.println(d02);
		
		Instant d03 = Instant.parse("2024-01-23T16:06:55Z");
		System.out.println(d03);
		
		Instant d04 = Instant.parse("2024-01-23T16:06:55-03:00"); //GMT foi especificado e fez a conversão da hora inserida para a hora do GMT
		System.out.println(d04); //Output: 2024-01-23T19:06:55Z
		
		// Formato customizado
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy"); //ofPattern e usado para criar um formato de hora customizado
		
		LocalDate do5 = LocalDate.parse("23/01/2024", fmt1); //Originalmente esse pattern não funcionaria, mas com o DataTimeFormatter como argumento ele muda o meio de ler a data
		System.out.println(do5);
		
		LocalDateTime d06 = LocalDateTime.parse("23/01/2024 16:33", DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
		System.out.println(d06);
		
		//Datas isoladas
		LocalDate d07 = LocalDate.of(2024, 01, 23);
		System.out.println(d07);
		
		LocalDateTime d08 = LocalDateTime.of(2024, 01, 24, 16, 48); //LocalDaTime.of tem varios tipos de sobrecargas para serem usadas
		System.out.println(d08);
		
		//
		DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate d09 = LocalDate.parse("2024-01-23");
		
		System.out.println(d09.toString() + " " + d09.format(fmt3)); //Usando .format e possivel usar como argumento um DataTimeFormatter para alterar a data
		
		DateTimeFormatter fmt4 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault()); //Usado para formatar quando se tratar de um instant
		
		System.out.println(fmt4.format(d04)); //Para horarios globais a conversão e diferente, no fmt4 usamos o horario padrão do computador que mudou o d04(Prviamente:2024-01-23T19:06:55Z) para Output: 23/01/2024 16:06
		
	}

}
