package h11;

import java.applet.Applet;
import java.awt.*;

public class while11_1 extends Applet {
int in1;
int in2;
public void init (){
    in1 = 20;
}
public void paint (Graphics g){
    for (in1 = 20; in1 <= 200; in1+=20) {
        g.drawLine(in1, 20, in1, 90);
    }

}
}
