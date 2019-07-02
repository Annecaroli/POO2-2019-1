
public class PadraoObservador {

	public static void main(String[] args) {
		
		/* cria um novo membro de email */
		MembroEmail mEmail = new MembroEmail();
		
		/* crio uma nova mensagem para ser enviada ao grupo de amil */
		CaixaEntradaGrupo msg = new CaixaEntradaGrupo();
		msg.addObserver(mEmail);
		msg.setNovaMensagem("Hello, world!");
	}

}
