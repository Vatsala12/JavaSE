import java.awt.*;
import java.applet.Applet;
import java.awt.event.*;
public class MyTwoButtonApplet extends Applet implements ActionListener{
    private Button b1,b2;
    public void init()
    {
        b1=new Button("RED");
        b2=new Button("GREEN");
        add(b1);
        add(b2);
        b1.addActionListener(this);
        b2.addActionListener(this);
        
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==b1)
        setBackground(Color.red);
        else 
        
        setBackground(Color.green);
    }
}
