
public class NotaVinteHandle extends AbstractSaqueHandle {
	
	public NotaVinteHandle() {
        
    }

    public AbstractSaqueHandle getProximaOpcao() {
        return proximaOpcao;
    }
    
    @Override
    public String saque(String valor) {
        
        if ((Integer.parseInt(valor)-20) > 0){
            
            String v[] = valor.split("");
            int n = Integer.parseInt(v[0]);
            System.out.println(n/2 + " notas de 20");
            int s = Integer.parseInt(valor);
            s = s-(10*n);
            valor = Integer.toString(s);
            
        }
        proximaOpcao.saque(valor);
        return valor;
    }

}
