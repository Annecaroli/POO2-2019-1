import java.util.ArrayList;

public class FlyweightStatusItem {
	static ArrayList<StatusItem> flyweightsItens;
	
	public FlyweightStatusItem() {
		
		flyweightsItens = new ArrayList<StatusItem>();
		
		flyweightsItens.add(new StatusItem(StatusItem.Estado.CARRINHO, true, false));
        flyweightsItens.add(new StatusItem(StatusItem.Estado.FECHADO, true, false));
        flyweightsItens.add(new StatusItem(StatusItem.Estado.PAGO, true, true));
        flyweightsItens.add(new StatusItem(StatusItem.Estado.ENVIADO, false, true));
        //flyweightsItens.add(new StatusItem(StatusItem.Estado.ENTREGUE, false, true));
	}
	
	public static StatusItem get(StatusItem.Estado est) {
		switch(est){
        	case CARRINHO:
        		return flyweightsItens.get(0);
        	case FECHADO:
        		return flyweightsItens.get(1);
        	case PAGO:
        		return flyweightsItens.get(2);
        	case ENVIADO:
        		return flyweightsItens.get(3);
        	default:
        		return flyweightsItens.get(4);
		}
	}
}