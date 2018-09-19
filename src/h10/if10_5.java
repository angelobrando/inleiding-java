package h10;
import java.awt.event.*;
import java.applet.Applet;
import java.awt.Graphics;
import java.awt.*;
public class if10_5 extends Applet {
    double do1;
    double do2;
    String tvstring;
    String string2;
    String string3;
    double do3;
    int int1;
    TextField tv;
    Button btn;
public void init() {
    tv = new TextField();
    btn = new Button("knopo");
    btn.addActionListener(new BtnListener());
    add(tv);
    add(btn);
    tvstring = "";
    string2 = "";
    string3 = "";
    do1 = 0.0;
    do2 = 0.0;
    do3 = 0.0;
    int1 = 0;
}
    public void paint (Graphics g){
        g.drawString(string2,60,60);
        g.drawString(" het gemiddelde is  "+do3,60,80);
        g.drawString(string3,60,120);
        g.drawString("je eindcijfer is = "+do3,60,100);
    }

    private class BtnListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            tvstring = tv.getText();
            do1 = Double.parseDouble(tvstring);
            if (do1 < 5.0) {
                string2 = "Onvoldoende";
            } else if (do1 > 5.0) {
                string2 = "Voldoende!";
            }
            if(do3 == 0){
                do3 = do1;
            }else {
                do3 = (do3 + do1) / 2;
            }
            int1 ++;
        if (do3 > 5.0){
            string3 = "je bent geslaagd";
        } else if (do3 < 5.0){
          string3 = "je bent keihard gezakt";
        }
        do3 =  ((int)(do3 * 10)) /10D;

        repaint();
        }
    }
}
