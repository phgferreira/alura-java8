import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class OrdenaStrings {

	public static void main(String[] args) {
		
		List<String> palavras = new ArrayList<>();
		palavras.add("alura online");
		palavras.add("editora casa do codigo");
		palavras.add("caelum");
		
		Comparator<String> comparador = new ComparadorPorTamanho();
		//Collections.sort(palavras, comparador);
		/* Não é uma boa prática ficar usando classes utilitárias com métodos estáticos,
		 * por isso essa forma abaixo é melhor
		 */
		palavras.sort(comparador);
		System.out.println(palavras);
		
		for (String palavra : palavras) {
			System.out.println(palavra);
		}
	}

}

class ComparadorPorTamanho implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {
		if (s1.length() < s2.length())
			return -1;
		if (s1.length() > s2.length())
			return 1;
		return 0;
	}
	
}