
public class Main {

	public static void main(String[] args) {
		
		//GeradorTelefone geradorNum = GeradorTelefone.getInstance();

        System.out.println("Telefone: " + GeradorTelefone.INSTANCE.getNextTelefone());
        System.out.println("Pr�ximo telefone: " + GeradorTelefone.INSTANCE.getNextTelefone());
        System.out.println("Pr�ximo telefone: " + GeradorTelefone.INSTANCE.getNextTelefone());
        System.out.println("Pr�ximo telefone: " + GeradorTelefone.INSTANCE.getNextTelefone());		

	}
}
