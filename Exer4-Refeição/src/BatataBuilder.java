
public class BatataBuilder extends RefeicaoBuilder{
	
	public BatataBuilder(Refeicao novaRefeicao){
        this.refeicao = novaRefeicao;
    }
	
    public void prepadaBatata(){
        System.out.println("cria batata");
        this.refeicao.setBatata(new Batata());                
    }

}
