
public class MembroWhatsapp implements Observer{
	
	public int numero;
	
	/* metodos da classe */
	public void update(Observable ob) {
		CaixaEntradaGrupo mensagem = (CaixaEntradaGrupo) ob;
		System.out.printf("Voc� recebeu a seguinte mensagem: %s", mensagem.getMensagem());
	}

}
