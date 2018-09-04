package h04;
import java.applet.Applet;
import java.awt.*;
public class Drawing4_5 extends Applet {


    public void init ()
    {}
    public void paint (Graphics g) {
     g.setColor(Color.blue);
     g.fillRect(20,20,1000,400);
     g.setColor(Color.yellow);
     g.fillOval(20,20,1000,400);
     g.setColor(Color.black);
        g.setFont(new Font("TimesRoman", Font.PLAIN, 40));
     g.drawString("IKEA",510,170);

    }
}
