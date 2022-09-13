import java.util.ArrayList;
import java.util.List;

public class OrdenaStrings {

	public static void main(String[] args) {
		
		List<String> palavras = new ArrayList<>();
		palavras.add("alura online");
		palavras.add("editora casa do codigo");
		palavras.add("caelum");
		
		//Comparator<String> comparador = new ComparadorPorTamanho();
		//Collections.sort(palavras, comparador);
		/* Não é uma boa prática ficar usando classes utilitárias com métodos estáticos,
		 * por isso essa forma abaixo é melhor
		 */
		palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));
		System.out.println(palavras);
		
//		for (String palavra : palavras) {
//			System.out.println(palavra);
//		}
		
		/* Não é possível instanciar uma interface exceto que na sua inicialização
		 * você defina a sua implementação, a forma que fazemos isso abaixo chama-se
		 * classe anônima (sem nome).
		 * 
		 * Nesse caso onde implemetamos uma interface que só tem um método é possível
		 * utilizarmos o lambda dessa forma e deixar o código mais limpo ainda.
		 * 
		 * Tendo um único parâmetro nós podemos tirar as as aspas e tendo apenas
		 * um único comando podemos tirar as chaves e o ponto de vírgula.
		 */
		palavras.forEach(string -> System.out.println(string));
	}

}

//class ComparadorPorTamanho implements Comparator<String> {
//
//	@Override
//	public int compare(String s1, String s2) {
//		if (s1.length() < s2.length())
//			return -1;
//		if (s1.length() > s2.length())
//			return 1;
//		return 0;
//	}
//	
//}

//class ImprimeNaLinha implements Consumer<String> {
//
//	@Override
//	public void accept(String string) {
//		System.out.println(string);
//	}
//	
//}
