import java.time.LocalDate;
import java.time.Month;

public class Datas {

	public static void main(String[] args) {
		LocalDate hoje = LocalDate.now();
		System.out.println(hoje);
		
		LocalDate proximoAniversario = LocalDate.of(2023, Month.SEPTEMBER, 13);
		
		int anos = proximoAniversario.getYear() - hoje.getYear();
		System.out.println(anos);
	}

}
