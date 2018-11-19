package h12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
public class array12_4 extends Applet {
    Boolean gevonden;
    TextField tv;
    Button okknop;
    int[] intteller;
    double[] doubledata = {100.0, 200.0, 500.0, 400.0, 300.0 };
    String input;
    int teller;
    double doubleresult;
    public void init(){
        doubleresult = 0.0;
        teller = 0;
        setSize(600,500);
        tv = new TextField(20);
        add(tv);
        okknop = new Button("Ok-Knop");
        okknop.addActionListener(new KnopActionListener());
        add(okknop);
        intteller = new int[5];
        doubledata = new double[5];
        gevonden = false;

    }
    public void paint(Graphics g) {
        if (gevonden == true){
            gevonden = false;
            g.drawString(""+ doubleresult, 40,50);
        }
        else{g.drawString("de waarde is niet gevonden",40,50); }

    }
    private class KnopActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            while (teller < doubledata.length){
                input = tv.getText();
                 doubleresult = Double.parseDouble(input);

                    if (doubleresult == doubledata[teller]){
                        doubleresult = doubledata[teller];
                        gevonden = true;

                    }
                    if (gevonden == true){
                        repaint();
                    }
                teller ++;
                }
            }
        }
    }
