import java.awt.image.BufferedImageOp;
import java.awt.image.ByteLookupTable;
import java.awt.image.LookupOp;

public class LookupFilter extends StrategyFilter {
	
	@Override
    public BufferedImageOp applyFilter(){
            byte lut[] = new byte[256];
            for (int j=0; j<256; j++) {
                lut[j] = (byte)(256-j); 
            }
            ByteLookupTable blut = new ByteLookupTable(0, lut); 
            return new LookupOp(blut, null);
    }

}
