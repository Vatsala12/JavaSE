
class Worker
{ 
    float rate,sal;
    int hw;
    public void setData(float rate,int hw)
    {
        this.rate=rate;
        this.hw=hw;
    }
    public float calculateSal()
    {
        if(hw<=40)
        {
            sal=hw*rate;
        }
        else
            sal=hw*2*rate;
        return sal;
    }
    public void showSal()
    {
        System.out.println("Salary= Rs"+sal);
    }
}
public class UseWorker {

    
    public static void main(String[] args) {
        java.util.Scanner kb= new java.util.Scanner(System.in);
        Worker w= new Worker();
        System.out.println("Enter rate & working hrs");
        int a=kb.nextInt(); 
        int b=kb.nextInt();
        
        w.setData(a, b);
        w.calculateSal();
        w.showSal();
    }
    
}
