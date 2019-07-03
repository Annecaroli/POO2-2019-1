
public class Handle {
	
	public static void main(String[] args){
        AbstractSaqueHandle cem = new NotaCemHandle();
        AbstractSaqueHandle cinquenta = new NotaCinquentaHandle();
        AbstractSaqueHandle vinte = new NotaVinteHandle();
        AbstractSaqueHandle cinco = new NotaCincoHandle();
        
        
        cem.setProximaOpcao(cinquenta);
        cinquenta.setProximaOpcao(vinte);
        vinte.setProximaOpcao(cinco);
        
        cem.processHandle("595");
    }

}
