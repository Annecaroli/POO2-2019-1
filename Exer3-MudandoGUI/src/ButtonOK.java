import java.awt.Image;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;


public class ButtonOK  extends JButton{
    
    public ButtonOK(){
     Image img = null;
        try {
            img = ImageIO.read(getClass().getResource("/Ok-icon.png"));
        } catch (IOException ex) {
            Logger.getLogger(ButtonCancel.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.setIcon(new ImageIcon(img));
    }
    
}