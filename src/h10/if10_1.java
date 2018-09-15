package h10;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class if10_1 extends Applet {
    String s1;
            String s2;
    Button knop;
    double hold;
            double var;
    TextField tv;
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
    }
    public void paint (Graphics g){
        g.drawString("Dit is het grootste getal:"+hold,40,40);

        }

    private class knopListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            s1 = tv.getText();
            var = Double.parseDouble(s1);
            if (var > hold) {
                hold = var;
            }
repaint();
            }
        }
    }








