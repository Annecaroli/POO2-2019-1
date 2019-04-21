
public class FabricaTim extends FabricaAbstrataEnvios{
	
	 @Override
	 public EnvioSMS criaEnvioSMS () {
		 return new EnvioSMSTim("Assincrono");
	 }
	 @Override
	 public Cobranca criaCobranca() {
		 return new CobrancaTim();
	 }
}
