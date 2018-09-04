package h04;
import java.applet.Applet;
import java.awt.*;
public class Praktijk_Opdracht extends Applet {
    public void init(){}
        public void paint (Graphics g) {
            g.drawLine(20,20,300,20);
            g.drawRect(20,40,300,200);
            g.drawRoundRect(20,280,300,200,20,20);
            g.setColor(Color.magenta);
            g.fillRect(340,40,300,200);
            g.setColor(Color.black);
            g.drawOval(340,40,300,200);
            g.setColor(Color.magenta);
            g.fillOval(340,280,300,200);
            g.fillArc(680,40,300,150,0,35);
            g.setColor(Color.black);
            g.drawOval(680,40,300,150);

            }
        }

