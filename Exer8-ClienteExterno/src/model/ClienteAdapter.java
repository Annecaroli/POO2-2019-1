package model;

public class ClienteAdapter implements ICliente {
	
	ClienteExterno ce;
	
	/* Construtor da classe */
	public ClienteAdapter(ClienteExterno ce){
		this.ce = ce;		
	}

	/* metodos gets */
	public String getCelular() {
		return ce.getDddCelular() + " " + ce.getCelular();
	}

	public String getEmail() {
		return ce.getEmail();
	}

	public String getNomeCompleto() {
		return ce.getNome() + " " + ce.getSobreNome();
	}

	public String getTelefone() {
		return ce.getDddTelefone() + " " + ce.getTelefone();
	}

	@Override
	public void setCelular(String celular) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setEmail(String email) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setNomeCompleto(String nomeCompleto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setTelefone(String telefone) {
		// TODO Auto-generated method stub
		
	}

}
