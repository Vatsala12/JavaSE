import java.applet.Applet;
import java.awt.*;
public class Face extends Applet {
    public void paint(Graphics g)
    { 
        setBackground(Color.GRAY);
        setForeground(Color.BLACK);
        g.drawOval(40,40,120,150 ); //head
         g.drawOval(57,75,30,20); //l eye
       //g.drawLine(60, 60, 60, 20);
       //g.drawLine(160, 96, 70, 20);
        g.drawOval(110,75,30,20);  // r eye
        g.fillOval(68,81,10,10);  //pupil l
        g.fillOval(121,81,10,10); //pupil r
       g.drawString("Hey!! I'm Mayank", 10, 20);
        g.drawOval(25,92,15,30); // l ear
        g.drawOval(160,92,15,30); // r ear
       g.drawArc(60,125,80,40,180,180); //mouth
         g.setColor(Color.red);
          g.fillOval(85,100,30,30);  //nose
          g.setColor(Color.PINK);
          g.fillOval(50, 105, 15, 15);
          g.fillOval(130, 105, 15, 15);
    }    
}
