package h11;

import java.applet.Applet;
import java.awt.*;
public class while11_4 extends Applet {
    public void init() {


    }

    public void paint (Graphics g){
        for(int int1 = 1; int1 <= 300; int1 ++){
            int int3 = 3 * int1;
            int int2 = 2 * (int1*10); //Magic
        g.drawString(""+int3,40,int2);
        }
    }
}
