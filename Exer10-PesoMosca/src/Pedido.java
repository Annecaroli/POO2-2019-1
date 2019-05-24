import java.util.ArrayList;

public class Pedido {
	
	public ArrayList<Item> itens = new ArrayList<Item>();

	public void addItemPedido(Item item) {
		itens.add(item);
	}

}
