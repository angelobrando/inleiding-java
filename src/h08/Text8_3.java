package h08;
        import java.awt.*;
        import java.applet.Applet;
        import java.awt.event.*;
public class Text8_3 extends Applet  {
    Label lb;
    TextField tv;
    Button kp;
    Button kp1;
    double s;
    String s1;
    String s2;
    public void init (){
        lb = new Label("Yes");
        tv = new TextField(s1,20);
        kp = new Button("Draw");
        kp1 = new Button("Reset");
        kp.addActionListener(new tvListener());
        kp1.addActionListener(new tv1Listener());
        add (tv);
        add (kp);
        add (kp1);
    }
    public void paint (Graphics g){
        g.drawString((s/100)*21+"", 40,40);
    }
    private class tvListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            s1 = tv.getText();
            s = Double.parseDouble(s1);

            repaint();
        }

    }
    private class tv1Listener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            tv.setText("");
        }
    }
}
