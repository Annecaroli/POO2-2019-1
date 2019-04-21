import javax.swing.JOptionPane;


public class MetodoFabricaAbstrata {

	public static void main(String[] args) {
		
		String escolha = JOptionPane.showInputDialog("Tim, Vivo ou Claro?");
		
        int telefone = Integer.parseInt(JOptionPane.showInputDialog("Telefone?"));
        
        String texto = JOptionPane.showInputDialog("Mensagem");
        
        Mensagem msg = new Mensagem(texto);
        
        FabricaAbstrataEnvios fabrica = null;
        
        if(escolha.equalsIgnoreCase("tim")){
            fabrica = new FabricaTim();
        }else if(escolha.equalsIgnoreCase("vivo")){
            fabrica = new FabricaVivo();            
        }else{
        	fabrica = new FabricaClaro();
        }
        EnvioSMS envio = fabrica.criaEnvioSMS();
        
        if(envio.enviar(msg, telefone)){            
            Cobranca cobranca = fabrica.criaCobranca();
            cobranca.cobrar(telefone);
        }  

	}

}
