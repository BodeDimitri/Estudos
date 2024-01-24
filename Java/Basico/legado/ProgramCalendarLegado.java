package legado;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.TimeZone;

public class ProgramCalendarLegado {
	
	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy"); //E passada a formatação
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		sdf3.setTimeZone(TimeZone.getTimeZone("GMT")); //Mudado a timezone, agora imprime no horario do Brasil
		
		Date x1 = new Date(); //Horário do pc
		Date x2 = new Date(1000L * 60L * 60L * 5L); //Calculo usado para fazer calculos com o tempo, o L significa milisegundos, por isso ele e multiplicado depois pelos segundos e depois por minutos que viram horas

		
		Date y1 = sdf1.parse("24/01/2024"); //Passa a data em questão
		Date y2 = sdf2.parse("24/01/2024 18:17:00");
		Date y3 = Date.from(Instant.parse("2024-01-24T18:30:00Z")); //Letra Z indicia o horario UTC que leva em base o nosso PC, que em relação ao UTC esta atrasado em 3 horas
		
		System.out.println(sdf1.format(y1)); //Usado o format para formatar a data
		System.out.println(sdf2.format(y2));
		System.out.println(x1);
		System.out.println(x2);
		System.out.println(sdf3.format(y3));
	}
}
