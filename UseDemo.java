class Demo {
    public void incre(int i,int j)
    {
        i=i+1;
        j=j+1;
    }
}
public class UseDemo {

    public static void main(String[] args) {
        Demo d= new Demo();
        int i=10,j=20;
        System.out.println("Before calling incre;i="+i+",j="+j);
        d.incre(i, j);
        System.out.println("After calling incre;i="+i+",j="+j);
    }
    
}
