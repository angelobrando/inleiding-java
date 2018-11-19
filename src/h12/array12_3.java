package h12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
public class array12_3 extends Applet {

TextField[] tv;
Button okknop;
int[] intteller;
String[] stringtemp;
    public void init(){
        setSize(6000,500);
        tv = new TextField[5];
        okknop = new Button("Ok-Knop");
        okknop.addActionListener(new KnopActionListener());
        add(okknop);
        intteller = new int[5];
        stringtemp = new String[5];
            for (int teller = 0; teller < stringtemp.length; teller ++){
                tv[teller] = new TextField(20);
                add(tv[teller]);
        }
    }
    public void paint(Graphics g) {
        for (int teller = 0; teller < tv.length; teller++) {
            Arrays.sort(intteller);
            g.drawString("" + intteller[teller], 200, 30 * teller + 20);
        }
    }
     private class KnopActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            for (int teller = 0; teller < tv.length; teller ++){
                stringtemp[teller] = tv[teller].getText();
                intteller[teller] = Integer.parseInt(stringtemp[teller]);
                repaint();

            }
        }
    }
}
