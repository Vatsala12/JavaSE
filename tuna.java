import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
public class tuna extends JFrame{
    private JLabel item1;
    public tuna()
    {
        super("Title");
        setLayout(new FlowLayout());
        item1= new JLabel("This is a sentence");
        item1.setToolTipText("on hover ");
        add(item1);
    }
}
