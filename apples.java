
import javax.swing.JOptionPane;
public class apples {
    public static void main(String []args) 
    {
        String fn=JOptionPane.showInputDialog("Enter first num");
         String sn=JOptionPane.showInputDialog("Enter second num");
         int num1=Integer.parseInt(fn);
          int num2=Integer.parseInt(sn);
          int sum= num1+num2;
          //JOptionPane.showMessageDialog(null,"The answer is" +sum+"the title");
          JOptionPane.showMessageDialog(null, "The sum is" +sum);
         
    }
}
