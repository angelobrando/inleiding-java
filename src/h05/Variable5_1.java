package h05;
import java.applet.Applet;
import java.awt.*;
import java.awt.color.ColorSpace;

public class Variable5_1 extends Applet {
    Color ma;
    Color bl;
    int wid;
    int hei;
    public void init() {
        ma = Color.magenta;
        bl = Color.black;
        wid = 300;
        hei = 200 ;
    }
    public void paint (Graphics g) {
        g.drawLine(20,20,300,20);
        g.drawRect(20,40,wid,hei);
        g.drawRoundRect(20,280,wid,hei,20,20);
        g.setColor(ma);
        g.fillRect(340,40,wid,hei);
        g.setColor(bl);
        g.drawOval(340,40,wid,hei);
        g.setColor(ma);
        g.fillOval(340,280,wid,hei);
        g.fillArc(680,40,wid,hei,0,35);
        g.setColor(bl);
        g.drawOval(680,40,wid,hei);

    }
}