
public class MetodoFabrica {

	public static void main(String[] args) {
		Formato formato;
		
        formato = FabricaFormato.gerarFormato("jpeg");
        formato.geraImg();
        
        formato = FabricaFormato.gerarFormato("png");
        formato.geraImg();
        
        formato = FabricaFormato.gerarFormato("gif");
        formato.geraImg();
        
        formato = FabricaFormato.gerarFormato("bmp");
        formato.geraImg();
        System.out.println("Fim");
	}

}
