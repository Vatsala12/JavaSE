import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class MouseApplet extends Applet implements MouseListener {
    public void init()
    {
        this.addMouseListener(this);
        
    }
    public void mouseClicked(MouseEvent e)
    {
        int x=e.getX();
        int y=e.getY();
        showStatus("x="+x+"y="+y);
    }
     public void mouseExited(MouseEvent e)
    {
          setBackground(Color.PINK);
    }
      public void mouseEntered(MouseEvent e)
    {
        setBackground(Color.BLACK);
    }
       public void mousePressed(MouseEvent e)
    {
        setBackground(Color.ORANGE);
    }
        public void mouseReleased(MouseEvent e)
    {
        setBackground(Color.YELLOW);
    }
}
