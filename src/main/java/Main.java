import javax.swing.*;
import java.awt.*;

public class Main extends JPanel {
    Image image=new ImageIcon("2.png").getImage();
    public void paint(Graphics g){
//        g.drawLine(20, 20, 100, 100);
        g.drawImage(image,0,0,null);

    }
}
