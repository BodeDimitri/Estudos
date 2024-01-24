package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;

public class ProgramTimeToGlobal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Instant d01 = Instant.parse("2024-01-23T01:30:26Z");
		LocalDate d02 = LocalDate.parse("2023-01-23");
		
		LocalDate r1 = LocalDate.ofInstant(d01, ZoneId.systemDefault()); //ofInstant permite calcular um Instant de outra zona baseada na sua ou em uma zona escolhida
		LocalDate r2 = LocalDate.ofInstant(d01, ZoneId.of("Portugal")); //Especificando o país em qual vai ser feita a conversão
		
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(d02.getDayOfMonth()); //De dados que não são Instant e possível retornar varias informações
	}

}
