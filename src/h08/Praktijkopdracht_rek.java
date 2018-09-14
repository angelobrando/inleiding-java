package h08;
import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;
public class Praktijkopdracht_rek extends Applet {
    TextField tv;
    TextField tv2;
    Button delen;
    Button keer;
    Button plus;
    Button minus;
    String stv;
    String stv2;
    Double firstnum;
    Double secnum;
    Double finnum;
    public void init(){
        firstnum = 0.0;
        secnum = 0.0;
        finnum = 0.0;
        tv2 = new TextField(20);
        tv = new TextField(20);
        delen = new Button("/");
        keer = new Button("*");
        plus = new Button("+");
        minus = new Button("-");
        add (tv);
        add (tv2);
        add (delen);
        add (keer);
        add (plus);
        add (minus);
        delen.addActionListener(new delen1());
        keer.addActionListener(new keer1());
        plus.addActionListener(new plus1());
        minus.addActionListener(new minus1());
    }
    public void paint (Graphics g){
        g.drawString(finnum+"",40,40);

    }
    private class delen1 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            stv = tv.getText();
            stv2 = tv2.getText();
            firstnum = Double.parseDouble(stv);
            secnum = Double.parseDouble(stv2);
            finnum = firstnum / secnum;
            repaint();
        }
    }
    private class keer1 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            stv = tv.getText();
            stv2 = tv2.getText();
            firstnum = Double.parseDouble(stv);
            secnum = Double.parseDouble(stv2);
            finnum = firstnum * secnum;
            repaint();
        }
    }
    private class plus1 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            stv = tv.getText();
            stv2 = tv2.getText();
            firstnum = Double.parseDouble(stv);
            secnum = Double.parseDouble(stv2);
            finnum = firstnum + secnum;
            repaint();
        }
    }
    private class minus1 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            stv = tv.getText();
            stv2 = tv2.getText();
            firstnum = Double.parseDouble(stv);
            secnum = Double.parseDouble(stv2);
            finnum = firstnum - secnum;
            repaint();
        }
    }
}
