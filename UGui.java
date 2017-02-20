import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

 class Gui extends JFrame
{
    private JButton reg;
    private JButton custom;
     
    public Gui()
    {
        super("The title");
        setLayout(new FlowLayout());
        reg = new JButton("reg Button");
        add(reg);
        Icon b= new ImageIcon(getClass().getResource("b.png"));
         Icon x= new ImageIcon(getClass().getResource("x.png"));
         custom= new JButton("Custom",b);
         custom.setRolloverIcon(x);
         add(custom);
         Handler h= new Handler();
         reg.addActionListener(h);
         custom.addActionListener(h);
    }
    private class Handler implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
            JOptionPane.showMessageDialog(null, String.format("%s", event.getActionCommand()));
        }
    }
}

public class UGui {

    
    public static void main(String[] args) {
        Gui g = new Gui();
        g.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        g.setSize(300,200);
        g.setVisible(true);
           
    }
    
}