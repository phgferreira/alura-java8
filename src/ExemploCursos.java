import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

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
		
		Optional<Curso> optionalCurso = cursos.stream()
			.filter(curso -> curso.getQuantidadeAlunos() >= 100)
			.findAny();
		
		// Esse método retorna o elemento, se for nulo, retorna NoSuchElementException
		//optionalCurso.get();
		
		// Esse método diz que se o objeto for nulo, retorna nulo e não dá o NoSuchElementException
		//Curso curso = optionalCurso.orElse(null);
		//System.out.println(curso.getNome());
		
		// Uma outra forma é, se o elemento não for nulo (for presente) então executa a seguinte expressão lambda
		optionalCurso.ifPresent(curso -> System.out.println(curso.getNome()));
	}

}
