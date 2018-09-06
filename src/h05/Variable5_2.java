package h05;
        import java.applet.Applet;
        import java.awt.*;
public class Variable5_2 extends Applet {
    int heij;
    int heih;
    int heiv;
    public void init()
    {
        heij = 100;
        heih = 80;
        heiv = 40;
    }
    public void paint (Graphics g) {
        g.drawLine(40,20,40,100);
        g.drawLine(40,40,38,40);
        g.drawLine(40,80,38,80);
        g.drawLine(40,20,38,20);
        g.setColor(Color.yellow);
        g.fillRect(40,20,40,heij);
        g.setColor(Color.red);
        g.fillRect(80,40,40,heih);
        g.setColor(Color.blue);
        g.fillRect(120,80,40,heiv);
        g.setColor(Color.black);
        g.drawString( "100",8,22);
        g.drawString( "80",16,40);
        g.drawString( "40",18,80);
        g.drawString("Jereon",40,143);
        g.drawString("Hans",80,143);
        g.drawString("Valerie",120,143);
    }

}
