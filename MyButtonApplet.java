import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class MyButtonApplet extends Applet implements ActionListener
{
private Button b;
public void init()
{
b = new Button("Click me");
add(b);
b.addActionListener(this);
}
public void actionPerformed(ActionEvent e)
{
setBackground(Color.red);
}
}
