package h02;

import java.applet.Applet;
import java.awt.*;

//importeer de benodigde klassen uit de Java bibliotheek
//een klasse met de naam Show van het type Applet
public class Hello extends Applet {

    //een (lege) methode die de Applet initialiseert
    public void init() {
    setBackground(Color.white);
    }
    //een methode die de inhoud van het scherm tekent
    public void paint(Graphics g) {
        g.setColor(Color.blue);
        g.drawString("Anwar", 50, 60 );
        g.setColor(Color.red);
        g.drawString("Bougamza", 50, 78 );
    }

}