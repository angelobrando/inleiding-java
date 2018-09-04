package h04;

import java.applet.Applet;
import java.awt.*;
public class Drawing4_7 extends Applet {
    public void init(){}
        public void paint (Graphics g) {
            g.setColor(Color.black);
            g.drawRoundRect(20,20,70,70,10,10);
            g.fillArc(40,40,10,10,1,360);
            g.fillArc(60,40,10,10,1,360);
            g.fillArc(40,60,10,10,1,360);
            g.fillArc(60,60,10,10,1,360);
        }
}
