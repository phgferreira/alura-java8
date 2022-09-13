
public class Curso {

	private String nome;
	private Integer quantidadeAlunos;

	public Curso(String nome, Integer quantidadeAlunos) {
		this.nome = nome;
		this.quantidadeAlunos = quantidadeAlunos;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getQuantidadeAlunos() {
		return quantidadeAlunos;
	}

	public void setQuantidadeAlunos(Integer quantidadeAlunos) {
		this.quantidadeAlunos = quantidadeAlunos;
	}

}
