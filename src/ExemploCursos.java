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
		cursos = cursos.stream()
				.filter(curso -> curso.getQuantidadeAlunos() >= 100)
				.collect(Collectors.toList());
			
			cursos.stream().forEach(curso -> System.out.println(curso.getNome()));
		
//		OptionalDouble soma = cursos.stream()
//			// Esse trecho de código utiliza o design pattern chamado encadeamento
//			.filter(curso -> curso.getQuantidadeAlunos() >= 100)
//			.mapToInt(Curso::getQuantidadeAlunos)
//			.average();
//		
//		System.out.println(soma);
		

		// Esse método retorna o elemento, se for nulo, retorna NoSuchElementException
		//optionalCurso.get();
		
		// Esse método diz que se o objeto for nulo, retorna nulo e não dá o NoSuchElementException
		//Curso curso = optionalCurso.orElse(null);
		//System.out.println(curso.getNome());
		
		// Uma outra forma é, se o elemento não for nulo (for presente) então executa a seguinte expressão lambda
		//optionalCurso.ifPresent(curso -> System.out.println(curso.getNome()));
		
	}

}
