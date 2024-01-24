package legado;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class ProgramCalendarDataLegado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
		
		Date d = Date.from(Instant.parse("2024-01-24T19:13:00z"));
		
		System.out.println(sdf.format(d));
		
		Calendar cal = Calendar.getInstance(); //Usado para calculo de data
		cal.setTime(d); //Data foi instanciada
		cal.add(Calendar.HOUR_OF_DAY, 4); //Primeiro parametro e o que vai ser adicionado e o segundo o quanto
		d = cal.getTime(); // Data voltando para a variavel que estava sendo armazenada
		
		System.out.println(sdf.format(d));
		
		System.out.println("--------------");
		
		int minutes = cal.get(Calendar.MINUTE); //Retorna uma informação da sua escolha
		int month = cal.get(Calendar.MONTH); //Não se esqueça que o mês sempre começa a contar apartir do 0
		
		System.out.println(minutes);
		System.out.println(month + 1);
	}

}
