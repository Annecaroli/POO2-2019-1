
public class MembroEmail implements Observer {
	
	public String email;
	
	/* metodos da classe */
	public void update(Observable ob) {
		CaixaEntradaGrupo mensagem = (CaixaEntradaGrupo) ob;
		System.out.printf("Voc� recebeu a seguinte mensagem: %s", mensagem.getMensagem());
	}
}
