package application;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class ProgramDataCalc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalDate d01 = LocalDate.parse("2024-01-23"); //Ter uma data que vai ser calculada
		Instant d02 = Instant.parse("2024-01-23T01:30:00Z");
		
		LocalDate pastWeekLocalDate = d01.minusDays(7);
		LocalDate nextWeekLocalDate = d01.plusDays(7); //Varias sobrecargas de metodo para calcular as datas
		Instant pastWeekInstant = d02.minus(7, ChronoUnit.DAYS); //Instant e diferente
		Instant nextWeelInstant = d02.plus(7, ChronoUnit.DAYS);
		
		
		System.out.println(pastWeekLocalDate);
		System.out.println(nextWeekLocalDate);
		
		System.out.println(pastWeekInstant);
		System.out.println(nextWeelInstant);
		
		
		Duration t1 = Duration.between(pastWeekInstant, nextWeelInstant); //Para fazer a contra entre as datas
		Duration t2 = Duration.between(pastWeekLocalDate.atStartOfDay(), nextWeekLocalDate.atStartOfDay()); //Mesmo sendo uma LocalDate que não tem time, ao usar .atStartOfDay ele ganha a propriedade de tempo
		
		
		System.out.println(t1.toDays()); //Pode ser exibida de varias maneiras, como dias, semanas, horas , minutos, etc.
		System.out.println(t2.toMinutes());
	}

}
