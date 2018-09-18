package h10;
import java.awt.*;
import java.applet.Applet;
import java.awt.event.*;
public class if10_4 extends Applet {
    TextField tv;
    Button knop;
    int in1;
    String string1;
    String string2;
    TextField tv2;
    int in2;
    String string3;
    public void init(){
        knop = new Button("knop");
        tv = new TextField(20);
        knop.addActionListener(new knoplistener());
        tv2 = new TextField("jaar",20);
        add (knop);
        add (tv);
        add (tv2);
        in1 = 0;
        string1 = "";
        string2 = "";

        string3 = "";
        in2 = 0;
    }
    public void paint (Graphics g){
        g.drawString(string2,40,40);
        g.drawString(string3,60,40);

    }
    private class knoplistener implements ActionListener{
        @Override
        public void actionPerformed (ActionEvent e){
            string1 = tv.getText();
            in1 = Integer.parseInt(string1);
            string3 = tv2.getText();
            in2 = Integer.parseInt(string3);
            switch (in1){
                case 1:
                    string2 = "31";
                    break;
                case 2:
                    if (in2 % 4 == 0){
                        string2 = "28";
                    }
                    else {
                        string2 = "29";
                    }
                    break;
                case 3:
                    string2 = "31";
                    break;
                case 4:
                    string2 = "30";
                    break;
                case 5:
                    string2 = "31";
                    break;
                case 6:
                    string2 = "30";
                    break;
                case 7:
                    string2 = "31";
                    break;
                case 8:
                    string2 = "30";
                    break;
                case 9:
                    string2 = "31";
                    break;
                case 10:
                    string2 = "31";
                    break;
                case 11:
                    string2 = "30";
                    break;
                case 12:
                    string2 = "31";
                    break;
                default:
                    string2 = "Die maan kennen wij nog niet";
                    break;

            }
            repaint();
        }

    }


}

