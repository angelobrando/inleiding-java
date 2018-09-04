package h04;
import java.applet.Applet;
import java.awt.*;
public class Drawing4_4 extends Applet {
    public void init()
    {}
    public void paint (Graphics g) {
        g.drawLine(40,20,40,100);
        g.drawLine(40,40,38,40);
        g.drawLine(40,80,38,80);
        g.drawLine(40,20,38,20);
        g.setColor(Color.yellow);
        g.fillRect(40,20,40,100);
        g.setColor(Color.red);
        g.fillRect(80,40,40,80);
        g.setColor(Color.blue);
        g.fillRect(120,80,40,40);
        g.setColor(Color.black);
        g.drawString( "100",8,22);
        g.drawString( "80",16,40);
        g.drawString( "40",18,80);
        g.drawString("Jereon",40,143);
        g.drawString("Hans",80,143);
        g.drawString("Valerie",120,143);
    }

}
