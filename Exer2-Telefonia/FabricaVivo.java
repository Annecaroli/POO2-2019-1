
public class FabricaVivo extends FabricaAbstrataEnvios{
	
	@Override
    public  Cobranca criaCobranca() {
        return new CobrancaVivo();
    }
    @Override
    public EnvioSMS criaEnvioSMS() {
        return new EnvioSMSVivo(); 
    }

}
