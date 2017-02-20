import java.util.Scanner;
class Info
{
    String name,acc;
    int accno;
    float bal,nbal,wbal;
    Info(String name,String acc,int accno)
    {
        name=this.name;
        acc=this.acc;
        accno=this.accno;
    }
    public float getbal(float bal){
        this.bal=bal;
        return bal;
        
    }
    public void deposit(float nbal)
    {   this.nbal=nbal;
        bal=nbal+bal;
        System.out.println(" your current Bal="+bal);   
    }
   
    public void withdraw(float wbal)
    {
        this.wbal=wbal;
        if(wbal<bal)
        {
            bal=bal-wbal;
        
        System.out.println("Amount withdraw,your Balnace="+bal);  
        }
        else
        {
            System.out.println("Insufficient Balance");
        }
    }
    public void display()
    {
        System.out.println("Name ="+name);
        System.out.println("Balance in the Account="+bal);
    }
}

public class BankAcc {

   
    public static void main(String[] args) {
      Scanner kb=new Scanner(System.in);
      
        System.out.println("Enter the Name,Account Type,Account No & Balance");
        String a= kb.next();
        String b=kb.next();
        int c= kb.nextInt();
        Info n= new Info(a,b,c);
        float d=kb.nextFloat();
        
        n.getbal(d);
        System.out.println("Enter the amt to be deposited");
        float e=kb.nextFloat();
        n.deposit(e);
        System.out.println("Enter the amt to be withdrawl!");
       float w=kb.nextFloat();
        n.withdraw(w);
        
    }
    
}
