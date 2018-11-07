package h04;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Time;

public class Drawing extends Applet {


    static TextField txtField = new TextField();
    static Button btn = new Button("Klik");

    public static String lblTokyo;
    public static String lblBejin;
    public static String lblLondon ;
    public static String lblNewYork;
    public  static String lblMessage;

    public static Panel pnl = new Panel();

    public void init(){

        add(txtField);
        add(btn);
        btn.addActionListener(new ButtonEvent());

    }

        public void paint(Graphics g) {
            g.drawString(lblMessage,20,40);
            g.drawString(lblTokyo,20,60);
            g.drawString(lblBejin,20,80);
            g.drawString(lblLondon,20,100);
            g.drawString(lblNewYork,20,120);
            g.drawString("biscuit made",80,800);


    }

    private class ButtonEvent implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String value = txtField.getText();
            Integer intvalue = Integer.parseInt(value);



            if(intvalue > 23 || intvalue < 0)
            {
                lblMessage = "Onjuist tijd ingetypt";

                lblBejin = "";
                lblTokyo = "";
                lblLondon = "";
                lblNewYork = "";
            }
            else if(value == " ")
            {

                lblBejin = "";
                lblTokyo = "";
                lblLondon = "";
                lblNewYork = "";

            }
            else
            {
                lblMessage = "";
                lblTokyo   = "De tijd in tokyo is "    +  (intvalue + 9 > 23 ?  (intvalue - 24 + 9) + ":00": intvalue + 9 < 0 ?  (intvalue - 24 + 9) + ":00": (intvalue + 9) + ":00"); //+9
                lblBejin   = "De tijd in bejin is "    +  (intvalue + 5 > 23 ?  (intvalue - 24 + 5) + ":00": intvalue + 5 < 0 ?  (intvalue - 24 + 5) + ":00": (intvalue + 5) + ":00"); //+5
                lblLondon  = "De tijd in london is "   +  (intvalue - 1 > 23 ?  (intvalue + 24 - 1) + ":00": intvalue - 1 < 0 ?  (intvalue + 24 -1) + ":00": (intvalue - 1) + ":00"); //-1
                lblNewYork = "De tijd in new york is " +  (intvalue + 6 > 23 ?  (intvalue - 24 + 6) + ":00": intvalue + 6 < 0 ?  (intvalue - 24 + 6) + ":00": (intvalue + 6) + ":00"); //+6
            }

            repaint();
        }
    }
}


