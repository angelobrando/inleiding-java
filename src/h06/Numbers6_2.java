package h06;
import java.awt.*;
import java.applet.Applet;
public class Numbers6_2 extends Applet {
    int hc;
    public void init(){
        hc = 365*24*60*60;}
        public void paint (Graphics g){
            g.drawString("seconden in een jaar "+ hc,20,20);
        }




}
