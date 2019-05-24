
public class CaixaEntradaGrupo extends Observable {
	
	public String mensagem;
	
	/* metodos da classe */
	public void setNovaMensagem(String mensagem) {
		this.mensagem = mensagem;
		notifyObserver();
	}
	
	public String getMensagem() {
		return mensagem;
	}

}
