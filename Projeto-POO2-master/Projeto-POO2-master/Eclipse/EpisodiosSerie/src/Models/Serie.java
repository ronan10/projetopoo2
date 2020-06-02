package Models;

public class Serie {

	private String nome;
	private String temporada;
	private int ano;
	private boolean episodioAssistido;
	private String nota;

	public Serie(String nome, String temporada, int ano, boolean episodioAssistido, String nota) {
		this.nome = nome;
		this.temporada = temporada;
		this.ano = ano;
		this.episodioAssistido = episodioAssistido;
		this.nota = nota;
	}

	public String toString() {
		return "Nome: " + this.nome + " Temporada: " + this.temporada + " Ano: " + this.ano + " Episodio Assistido: "
				+ this.isEpisodioAssistido() + "Nota: " + this.nota;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTemporada() {
		return temporada;
	}

	public void setTemporada(String temporada) {
		this.temporada = temporada;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public boolean isEpisodioAssistido() {
		return episodioAssistido;
	}

	public void setEpisodioAssistido(boolean episodioAssistido) {
		this.episodioAssistido = episodioAssistido;
	}

	public String getNota() {
		return nota;
	}

	public void setNota(String nota) {
		this.nota = nota;
	}

}
