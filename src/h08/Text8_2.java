package h08;
import java.awt.*;
import java.applet.Applet;
import java.awt.event.*;

public class Text8_2 extends Applet  {
    Button kp;
    Button kp1;
    Button kp2;
    Button kp3;
    Integer s;
    Integer s1;
    Integer s2;
    Integer s3;
    Integer s4;
    public void init (){
        kp = new Button("Jongens");
        kp1 = new Button("Meiden");
        kp2 = new Button ("Dames");
        kp3 = new Button ("Heren");
        kp.addActionListener(new kpListener());
        kp1.addActionListener(new kp1Listener());
        kp2.addActionListener(new kp2Listener());
        kp3.addActionListener(new kp3Listener());
        add (kp2);
        add (kp);
        add (kp1);
        add (kp3);
        s = 0;
        s1 = 0;
        s2 = 0;
        s3 = 0 ;

    }
    public void paint (Graphics g){
        g.drawString( s+"", 40,40);
        g.drawString( s1+"", 100,40);
        g.drawString( s2+"", 160,40);
        g.drawString( s3+"", 200,40);
        g.drawString( s3+s1+s2+s+"",40,100);

    }
    private class kpListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            s ++;
            repaint();
        }}
        private class kp2Listener implements ActionListener{
            @Override
            public void actionPerformed(ActionEvent e) {
            s1 ++;
            repaint();
            }}
            private class kp3Listener implements ActionListener{
                @Override
                public void actionPerformed(ActionEvent e) {
                    s2 ++;
                    repaint();
                }}
              private class kp1Listener implements ActionListener{
                @Override
                public void actionPerformed(ActionEvent e){
                    s3 ++;
                    repaint();
                }}

}
