package h06;

import java.applet.Applet;
import java.awt.*;
public class Praktijk_Opdracht6 extends Applet {
float hc;
        public void init () {
            int t = (int) (6.9F+5.9F+6.3F)/3*10;
            hc = t/10f;


        }
public void paint (Graphics g) {
            g.drawString("Score "+hc,20,20);
}






}

