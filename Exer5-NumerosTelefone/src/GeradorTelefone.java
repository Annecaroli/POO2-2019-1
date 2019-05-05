
public enum GeradorTelefone {
	
	INSTANCE;
	private long numTelefone = 999990100;

    public synchronized long getNextTelefone() {
    	return ++numTelefone;
    }

	
}
