import javax.swing.JButton;

public class FabricaBotoesSemIcone extends FabricaAbstrataBotoes {
	
	public JButton criaBotaoOK() {
        JButton ok = new JButton();
        ok.setText("ok");
        return ok;
    }

    public JButton criaBotaoCancel() {
    	JButton cancela = new JButton();
        cancela.setText("cancela");
        return cancela;	
    }
}
