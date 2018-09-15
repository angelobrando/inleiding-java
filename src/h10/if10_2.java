package h10;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class if10_2 extends Applet {
    String s1;
    String s2;
    Button knop;
    double hold;
    double var;
    TextField tv;
    double shold;
    public void init() {
        tv = new TextField(20);
        knop = new Button("Knop");
        knop.addActionListener(new knopListener());
        s1 = "";
        s2 = "";
        hold = 0;
        var = 0;
        add (knop);
        add (tv);
        shold = 2000000000;
    }
    public void paint (Graphics g){
        g.drawString("Dit is het grootste getal:"+hold,40,40);
        g.drawString("Dit is het kleinste getal"+shold, 40,80);
    }

    private class knopListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            s1 = tv.getText();
            var = Double.parseDouble(s1);
            if (var > hold) {
                hold = var;
            }
            if (var < shold){
                shold = var;
            }
            repaint();
        }
    }
}









