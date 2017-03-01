import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class MyButton extends Applet implements ActionListener {
   private Button b;
   private String cname;
    private int count= 0;
    public void init()
    {   
        b= new Button("Click me");
        add(b);
        b.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e)
    { 
        if(count %2==0)
        { setBackground(Color.red);
        cname= "Red";
        }
    else 
        {setBackground(Color.GREEN);
        cname="Green";
        }
    ++count;
        showStatus("This is click no  "+count+"and color is  "+cname);
    }
    
    
}
