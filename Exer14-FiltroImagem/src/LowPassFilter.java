import java.awt.image.BufferedImageOp;
import java.awt.image.ConvolveOp;
import java.awt.image.Kernel;

public class LowPassFilter extends StrategyFilter {
	
	public static final float[] BLUR3x3 = {
	        0.1f, 0.1f, 0.1f,    // low-pass filter kernel
	        0.1f, 0.2f, 0.1f,
	        0.1f, 0.1f, 0.1f
	    };
	    

	    @Override
	    public BufferedImageOp applyFilter(){
	         return new ConvolveOp(new Kernel(3, 3, BLUR3x3),
	                                ConvolveOp.EDGE_NO_OP,
	                                null);
	    }

}
