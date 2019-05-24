
public class StatusItem {
	
	public enum Estado{
		CARRINHO, FECHADO, PAGO, ENVIADO
	}

	private Estado estado;
	private boolean podeCancelar;
	private boolean compraConcluida;
	
	public StatusItem(Estado estado, boolean cancelar, boolean concluida){
        this.setEstado(estado);
        this.podeCancelar = cancelar;
        this.compraConcluida = concluida;
    }
	
	
	
	/* metodos setters */
	public void setEstado(Estado estado) {
		this.estado = estado;
	}
	
    public void setPodeCancelar(boolean podeCancelar) {
        this.podeCancelar = podeCancelar;
    }
    
    public void setCompraConcluida(boolean compraConcluida) {
        this.compraConcluida = compraConcluida;
    }


    /* metodos getters */
    public Estado getEstado() {
		return estado;
	}
    
    public boolean compraConcluida() {
        return compraConcluida;
    }

    public boolean podeCancelar() {
        return podeCancelar;
    }
	
}
