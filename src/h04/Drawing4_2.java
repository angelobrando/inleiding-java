package h04;

import java.applet.Applet;
import java.awt.*;

public class Drawing4_2 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.blue);
        g.setColor(Color.red);
        g.fillOval(80, 30, 200, 90);
        g.setColor(Color.yellow);
        g.fillRect(80, 80, 200, 200);
        g.setColor(Color.green);
        g.fillRect(120,210,50,70);
        g.setColor(Color.orange);
        g.fillRect(120,110,50,50);
        g.setColor(Color.orange);
        g.fillRect(190,110,50,50);
            /* dit geeft een half gare driehoek, de arc angle is de graden en de start angle vanaf waar hij een
            kleurtje krijgt
             */
    }        }

