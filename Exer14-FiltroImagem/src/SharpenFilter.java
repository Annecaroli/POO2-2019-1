import java.awt.image.BufferedImageOp;
import java.awt.image.ConvolveOp;
import java.awt.image.Kernel;

public class SharpenFilter extends StrategyFilter {
	
	public static final float[] SHARPEN3x3 = { // sharpening filter kernel
		    0.f, -1.f,  0.f,
		   -1.f,  5.f, -1.f,
		    0.f, -1.f,  0.f
		    };
		 
		    
		    
		    @Override
		    public BufferedImageOp applyFilter(){
		        return new ConvolveOp(new Kernel(3, 3, SHARPEN3x3),
		                                ConvolveOp.EDGE_NO_OP,
		                                null);
		        
		    }

}
