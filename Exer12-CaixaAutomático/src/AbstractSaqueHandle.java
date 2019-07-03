
public abstract class AbstractSaqueHandle {
	
	public AbstractSaqueHandle proximaOpcao;
    
    public AbstractSaqueHandle(){
    
    }
    
    
    public void setProximaOpcao(AbstractSaqueHandle proximaOpcao) {
        this.proximaOpcao = proximaOpcao;
    }
    
    public AbstractSaqueHandle getProximaOpcao(){
        return this.proximaOpcao;
    }
    
    public void processHandle(String num){
         num = saque(num);

    }
    
    public abstract String saque(String valor);
	
}
