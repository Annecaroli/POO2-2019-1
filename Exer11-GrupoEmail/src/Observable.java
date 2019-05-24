import java.util.ArrayList;

public class Observable {
	
	public ArrayList<Observer> monitores = new ArrayList<Observer>();
	
	/* metodos da classe */
	public void addObserver(Observer ob){
		this.monitores.add(ob);
	}
	
	public void deleteObserver(Observer ob) {
		this.monitores.remove(ob);
	}
	
	public void notifyObserver() {
		for(Observer ob : monitores) {
			ob.update(this);
		}
	}

}
