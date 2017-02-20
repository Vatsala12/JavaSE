import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class MyTwoButton extends Applet implements ActionListener{
    private Button b1,b2;
    public void init()
    {
        b1= new Button("Yellow");
        b2= new Button("Blue");
       
        add(b1);
        add(b2);
        
        b1.addActionListener(this);
        b2.addActionListener(this);
       
    }
    public void actionPerformed(ActionEvent e)
    {         

        if(e.getSource()==b1)
        {
            setBackground(Color.yellow);
        }
        else 
            
        {setBackground(Color.BLUE);
        }
        
    }
}
