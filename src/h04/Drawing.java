package h04;

import java.applet.Applet;
import java.awt.*;

public class Drawing extends Applet {

        public void init() {
        }

        public void paint(Graphics g) {
            setBackground(Color.blue);
            g.setColor(Color.yellow);
            g.drawRect(20, 20, 100, 50);
            g.fillRect(20, 80, 100, 50);
            g.fillArc(100,100,200,360,0,45);
            /* dit geeft een half gare driehoek, de arc angle is de graden en de start angle vanaf waar hij een
            kleurtje krijgt
             */
}        }

