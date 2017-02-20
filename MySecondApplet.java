import java.applet.Applet;
import java.awt.*;
public class MySecondApplet extends Applet {
    public void init()
    {
        Color c1= new Color(255,255,0);
        Color c2=  new Color(0,0,255);
        setBackground(c1);
         setBackground(c2);
         
    }
    public void paint(Graphics g)
    {  Font f= new Font("comic sans MS",Font.BOLD+Font.ITALIC,24);
    g.setFont(f);
    g.setColor(Color.red);
        g.drawString("Welcome to applet",50,100);
        //Date d= new Date();
       // showStatus(d.toString());
    }
}
