import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class OrdenaStrings {

	public static void main(String[] args) {
		
		List<String> palavras = new ArrayList<>();
		palavras.add("alura online");
		palavras.add("editora casa do codigo");
		palavras.add("caelum");
		
		palavras.sort(Comparator.comparing( s -> s.charAt(s.length()-1) ));
		System.out.println(palavras);
		
		palavras.forEach(System.out::println);
	}

}
