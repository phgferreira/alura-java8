import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Datas {

	public static void main(String[] args) {
		LocalDate hoje = LocalDate.now();
		System.out.println(hoje);
		
		LocalDate proximoAniversario = LocalDate.of(2023, Month.SEPTEMBER, 13);
		
		int anos = proximoAniversario.getYear() - hoje.getYear();
		System.out.println(anos);
		
		Period periodo = Period.between(hoje, proximoAniversario);
		System.out.println(periodo.getDays());
		
		LocalDate quatroAnosDepois = proximoAniversario.plusYears(4);
		System.out.println(quatroAnosDepois);
		
		DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println(proximoAniversario.format(dateFormat));
		
		DateTimeFormatter dateTimeFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		LocalDateTime agora = LocalDateTime.now();
		System.out.println(agora.format(dateTimeFormat));
		
		LocalTime intervalo = LocalTime.of(15, 30);
		System.out.println(intervalo);
	}

}
