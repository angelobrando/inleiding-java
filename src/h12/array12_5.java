package h12;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class array12_5 extends Applet {
    double[] arraylist = {100.0, 200.0, 500.0, 400.0, 300.0 };
    Boolean finderans;
    TextField tvinputsearch;
    Button okgobutton;
    double tobefound;
    double found;
public void init (){
    arraylist = new double[5];
    finderans = false;
    tvinputsearch = new TextField(20);
    add(tvinputsearch);
    tobefound = 0.0;
    found = 0.0;
    okgobutton = new Button("Button");
    okgobutton.addActionListener(new Knoplistener());
    add(okgobutton);
}
    public void paint (Graphics g){
        if (finderans == true){
            g.drawString("Ik heb dit gevonden = "+found,40,60);
        }
        if (finderans == false){
            g.drawString("Voer een getal in dat in de database moet zitten",40,40);
        }


    }
    private class Knoplistener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String tempstring;
            tempstring = tvinputsearch.getText();
            tobefound = Double.parseDouble(tempstring);
            for (int countup = 0; countup < arraylist.length; countup++)
                    if (arraylist[countup] == tobefound){
                        found = arraylist[countup];
                        finderans = true;
                        System.out.println("ditwerkt");
                        repaint();
                        break;
                    }
                }


        }
    }

