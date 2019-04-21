
public class FabricaFormato {
    public static Formato gerarFormato(String formato) {
        Formato gerador = null;
        
        if (formato.equalsIgnoreCase("jpeg")){
            gerador = new FormatoJPEG();
        } else if (formato.equalsIgnoreCase("png")){
            gerador = new FormatoPNG();
        } else if (formato.equalsIgnoreCase("gif")) {
        	gerador = new FormatoGIF();
        }else {
        	gerador = new FormatoBMP();
        }
        return gerador;
    }
}
