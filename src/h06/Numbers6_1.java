package h06;
import java.applet.Applet;
        import java.awt.*;
public class Numbers6_1 extends Applet {
    float hc;
    public void init () {
        hc = 133/4F;}
public void paint (Graphics g) {
        g.drawString("Jan "+hc,20,20);
    g.drawString("Ali "+hc,20,40);
    g.drawString("Jeannette "+hc,20,60);
    g.drawString("Anwar "+hc,20,80);
}
}

