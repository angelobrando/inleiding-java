package h11;

import java.applet.Applet;
import java.awt.*;

public class while11_5 extends Applet {
    int inty;
    public void init(){
inty = 0;

    }
    public void paint (Graphics g){
/*for (int intx = 300; intx >=1000; inty += 5){
    inty = intx;
    g.drawRect(inty,intx,20,20);


        }
*/
    for(int i=0; i<10;i++){
        int c = 10 +(i*10);
        g.drawRect(c,c,10,10);
    }


    }

}
