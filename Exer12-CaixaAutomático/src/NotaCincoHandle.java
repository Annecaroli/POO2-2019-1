
public class NotaCincoHandle extends AbstractSaqueHandle {
	
	private String num;
    
    public NotaCincoHandle() {
        
    }
    
    public void setNum(String num){
        this.num = num;
    }
    
    @Override
    public String saque(String valor) {
        
        if ((Integer.parseInt(valor)-5) >= 0){
            String v[] = valor.split("");
            int n = Integer.parseInt(v[0]);
            System.out.println("1 nota de 5");
            int s = Integer.parseInt(valor);
            s = s-5;
            valor = Integer.toString(s);
        }
        
        return valor;
    }

}
