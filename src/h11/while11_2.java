package h11;

import java.applet.Applet;
import java.awt.*;
public class while11_2 extends Applet {

public void init(){

}
public void paint (Graphics g){
    for(int int1 = 10; int1 <= 20; int1 ++){
        int int2 = 20 + (int1*10); //Magic
        g.drawString(""+int1,20,int2);
    }

}


}
