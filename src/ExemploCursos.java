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
		
		cursos.stream()
			// Esse trecho de código utiliza o design pattern chamado encadeamento
			.filter(curso -> curso.getQuantidadeAlunos() >= 100)
			.map(Curso::getQuantidadeAlunos)
			.forEach(System.out::println);
		
		// O filter feito acima não impacta no objeto original, por isso precisou usar o for each encadeado acima
		//cursos.forEach(curso -> System.out.println(curso.getNome()));
	}

}
