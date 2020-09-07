package fiado;

public class Consumidor {
	private String nome;
	private int telefone;
	private int[] fiados;
	private int posicao = 0;

	public Consumidor(String nome, int telefone) {
		this.nome = nome;
		this.fiados = new int[10];
		this.telefone= telefone;
	}

	// GETTER E SETTER
	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getTel() {
		return this.telefone;
	}
	public void setTel(int telefone) {
		this.telefone=telefone;
	}

	public void registrarFiado(int valor) {
		this.fiados[posicao] = valor;
		posicao++;

	}

	public int getFiado() {
		int total = 0;

		for (int fiado : fiados) {
			total += fiado;
		}
		return total;
	}
}
