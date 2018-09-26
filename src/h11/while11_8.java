package h11;

import java.applet.Applet;
import java.awt.*;

public class while11_8 extends Applet {

    public void init(){
        setSize(1000,1000);
    }
    public void paint (Graphics g){
        for (int i = 50;i<500;i += 10){
            g.drawArc(10,10,i,i,0,360);
        }



    }

}
