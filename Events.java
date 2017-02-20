import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Events extends JFrame {
    private JTextField item1,item2, item3;
    JPasswordField pswrd;
    public Events()
    {
        super("The title");
        setLayout(new FlowLayout());
        item1= new JTextField(10);
        add(item1);
        item2= new JTextField("Enter text here");
        add(item2);
        item3= new JTextField("uneditable",20);
        item3.setEditable(false);
        pswrd= new JPasswordField("mypass");
        add(pswrd);
        thehandler h = new thehandler();
       item1.addActionListener(h);
         item2.addActionListener(h);
           item3.addActionListener(h);
           pswrd.addActionListener(h);
    }
    private class thehandler implements ActionListener {
        public void actionPerformed(ActionEvent event)
        {
           String string= " ";
           if(event.getSource()==item1)
               string= String.format("Field 1: %s", event.getActionCommand());
           
           else if(event.getSource()==item2)
               string= String.format("Field 2: %s", event.getActionCommand());
           else if(event.getSource()==item3)
               string= String.format("Field 3: %s", event.getActionCommand());
           else if(event.getSource()==pswrd)
               string= String.format("password field is : %s",event.getActionCommand());
           
           
           JOptionPane.showMessageDialog(null,string);
           
        }
    }
}
