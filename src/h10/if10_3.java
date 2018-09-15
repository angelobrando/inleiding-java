package h10;
import java.awt.*;
import java.applet.Applet;
import java.awt.event.*;
public class if10_3<override> extends Applet {
    double doub1;
    double doub2;
    TextField tv;
    Button knop;
    int in1;
    String string1;
    String string2;
public void init(){
    knop = new Button("knop");
    tv = new TextField(20);
    knop.addActionListener(new knoplistener());
    add (knop);
    add (tv);
    in1 = 0;
    string1 = "";
    string2 = "";
    }
public void paint (Graphics g){
        g.drawString(string2,40,40);

    }
private class knoplistener implements ActionListener{
    @Override
public void actionPerformed (ActionEvent e){
        string1 = tv.getText();
        in1 = Integer.parseInt(string1);
            switch (in1){
            case 1:
                string2 = "31";
                break;
            case 2:
                string2 = "28/29";
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
                string2 = "3";
                break;
                default:
                    string2 = "Die maan kennen wij nog niet";
                    break;

        }
repaint();
        }

    }


    }

