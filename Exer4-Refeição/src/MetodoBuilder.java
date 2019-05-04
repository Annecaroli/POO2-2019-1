
public class MetodoBuilder {

	public static void main(String[] args) {
		
		DiretorRefeicao criaRefeicao = new DiretorRefeicao();      
        
        Refeicao refeicao1 = criaRefeicao.preparaNaoVegetariana("laranja", "suco");                
        Refeicao refeicao2 = criaRefeicao.preparaVegetariana("guarana", "refrigerante");
        Refeicao refeicao3 = criaRefeicao.preparaBatata();
    }

}
