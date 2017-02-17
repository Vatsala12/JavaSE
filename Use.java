import java.util.Scanner;
class Student
{
    String name;
    int rollno;
    public void setData(String n,int r)
    {
        n=name;
        r=rollno;
    }  
 
}
class Test extends Student
{
    
        int phy,che,mat,hin,csc;
        public void setMarks(int p,int c,int m,int h,int cs)
        {
            p=phy;
            c=che;
            m=mat;
            h=hin;  
            cs=csc;
            
                    
        } }
            class Report extends Test
            {
                float per;
            
               
                public void Calc()
                {
           per=(phy*che*mat*hin*csc/5)*100;
            
                    
}
                 public void show()
                {
                 System.out.println("Student name=" +name);
                    System.out.println("Roll num= "+rollno);
                    System.out.println("percent="+per);
                }
}
public class Use
{    public static void main(String[] args) {
        Scanner kb= new Scanner(System.in);
            System.out.println("Enter name &roll num=");
            String a=kb.next();
            int b=kb.nextInt();
            System.out.println("------------");
            System.out.println("Enter marks of phy , chem, maths, hindi ,csc =");
            int c=kb.nextInt();
            int d=kb.nextInt();
            int e=kb.nextInt();
            int f=kb.nextInt();
            int g=kb.nextInt();
            System.out.println("------------");
               Report r= new Report();
               r.setData( a, b);
               r.setMarks(c, d, e, f, g);
              
               r.Calc();
              r.show();

}

    
}


   
