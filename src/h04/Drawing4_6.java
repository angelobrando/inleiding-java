package h04;
import java.awt.*;
import java.applet.Applet;
public class Drawing4_6 extends Applet {
    public void init(){}
        public void paint (Graphics g) {
        g.setColor(Color.black);
        g.fillRect(20,20,200,610);
        g.setColor(Color.red);
        g.fillArc(25,30,190,190,1,360);
        g.setColor(Color.yellow);
        g.fillArc(25,230,190,190,1,360);
        g.setColor(Color.green);
        g.fillArc(25,430,190,190,1,360);
        }





}
