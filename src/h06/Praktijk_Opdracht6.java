package h06;

import java.applet.Applet;
import java.awt.*;
public class Praktijk_Opdracht6 extends Applet {
float hc;
        public void init () {
            int t = (69+59+63)/3;
            hc = t/10f;
        }
public void paint (Graphics g) {
            g.drawString("Score "+hc,20,20);
}






}

