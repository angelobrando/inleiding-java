package h12;

import java.applet.Applet;
import java.awt.*;

public class array12_2 extends Applet {
    int knoparray[];
    Button[] knoppo;
    public void init(){
        knoppo = new Button[25];
        knoparray = new int[25];
        for (int teller = 0; teller < knoppo.length; teller ++){
            knoppo[teller] = new Button();
            add (knoppo[teller]);

        }
        repaint();
    }
    public void paint (Graphics g){




    }


}
