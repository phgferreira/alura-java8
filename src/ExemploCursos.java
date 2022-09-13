import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ExemploCursos {

	public static void main(String[] args) {
		List<Curso> cursos = new ArrayList<>();
		cursos.add(new Curso("Python", 45));
		cursos.add(new Curso("JavaScript", 150));
		cursos.add(new Curso("Java 8", 113));
		cursos.add(new Curso("C", 55));
		
		cursos.sort(Comparator.comparing(Curso::getQuantidadeAlunos));
		
		int soma = cursos.stream()
			// Esse trecho de código utiliza o design pattern chamado encadeamento
			.filter(curso -> curso.getQuantidadeAlunos() >= 100)
			.mapToInt(Curso::getQuantidadeAlunos)
			.sum();
		
		System.out.println(soma);
		
	}

}
