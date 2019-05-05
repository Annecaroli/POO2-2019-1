
public class MetodoBuilder {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		DiretorRefeicao criaRefeicao = new DiretorRefeicao();      
        
        Refeicao refeicao1 = criaRefeicao.preparaNaoVegetariana("laranja", "suco");                
        Refeicao refeicao2 = criaRefeicao.preparaVegetariana("guarana", "refrigerante");
    }

}
