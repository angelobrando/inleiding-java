package h04;
import java.awt.*;
import java.applet.Applet;
public class Drawing4_3 extends Applet {

    public void init ()
    {}
    public void paint (Graphics g)  {
        g.setColor(Color.red);
        g.fillRect(20,60,60,20);
        g.setColor(Color.white);
        g.fillRect(20,80,60,20);
        g.setColor(Color.blue);
        g.fillRect(20,100,60,20);
        g.setColor(Color.black);
        g.drawLine(20,60,20,160);

    }

}
