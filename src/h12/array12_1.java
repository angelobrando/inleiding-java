package h12;
import java.awt.*;
import java.applet.*;

public class array12_1 extends Applet  {
    double[] salaris;
    double kopie;

    public void init() {
        salaris = new double[5];
        kopie = 0.0;

        for (int teller = 0; teller < salaris.length; teller ++) {
            salaris[teller] = 100 * teller + 100;
        }
        kopie = salaris[0] + salaris[1] + salaris[2] + salaris[3] + salaris[4];
        kopie = kopie / 5;
    }

    public void paint(Graphics g) {
        for (int teller = 0; teller < salaris.length; teller ++) {
            g.drawString("" + salaris[teller], 100, 20 * teller + 20);
        }
        g.drawString(""+ kopie, 50,20);
    }
}