import java.time.LocalDate;
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
		
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println(proximoAniversario.format(formato));
	}

}
