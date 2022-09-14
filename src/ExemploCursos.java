import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ExemploCursos {

	public static void main(String[] args) {
		List<Curso> cursos = new ArrayList<>();
		cursos.add(new Curso("Python", 45));
		cursos.add(new Curso("JavaScript", 150));
		cursos.add(new Curso("Java 8", 113));
		cursos.add(new Curso("C", 55));
		
		cursos.sort(Comparator.comparing(Curso::getQuantidadeAlunos));

		// Usando o collector conseguimos retornar uma lista e inclusive podemos sobreescrever a referência com isso
		cursos.stream()
				.filter(curso -> curso.getQuantidadeAlunos() >= 100)
				.collect(Collectors.toMap(
						curso -> curso.getNome(),
						curso -> curso.getQuantidadeAlunos()))
				.forEach((nome, quantidadeAlunos) -> System.out.println(nome + " ten " + quantidadeAlunos));
			
		
	}

}
