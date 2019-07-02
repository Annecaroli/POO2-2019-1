
public class Item {
	
	private String nome;
    private String descricao;
    private StatusItem status;

    /* metodos setters */
    
	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public void setStatus(StatusItem status) {
		this.status = status;
	}
	
	/* metodos getters */
	
	public String getNome() {
		return nome;
	}

	public String setDescricao() {
		return descricao;
	}

	public StatusItem getStatus() {
		return status;
	}

}
