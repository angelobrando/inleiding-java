package h11;

import java.applet.Applet;
import java.awt.*;

public class while11_7 extends Applet {
    int inxx;

    public void init() {
        setSize(1000,1000);
        inxx = 300;
    }

    public void paint(Graphics g) {
        for (int i = 100; i < 1000; i += 10) {
            inxx -= 5;
            g.drawArc(inxx, inxx, i, i, 0, 360);
        }
    }
}
