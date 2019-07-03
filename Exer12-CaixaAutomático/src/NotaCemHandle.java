
public class NotaCemHandle extends AbstractSaqueHandle {
	
	public NotaCemHandle() {
        
    }
   
    public AbstractSaqueHandle getProximaOpcao() {
        return proximaOpcao;
    }
    

    @Override
    public String saque(String valor) {
        
        if ((Integer.parseInt(valor)-100) > 0){
            String v[] = valor.split("");
            int n = Integer.parseInt(v[0]);
            System.out.println(n + " notas de " + Math.pow(10, 2));
            int s = Integer.parseInt(valor);
            s = s-(100*n);
            valor = Integer.toString(s);
            
        }
        proximaOpcao.saque(valor);
        return valor;
    }

}
