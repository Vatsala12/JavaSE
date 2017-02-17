interface Std
{
  String name(String n);
  int roll(int r);

}

interface Test1 extends Std
{
 void marks(int p,int c,int m,int h,int cs);
 int smarks(int s);

}
interface Report1 extends Test1
{    
     float per();
      void show();
}
  class Result implements Report1
{ 
    String name;
int roll,phy,che,mat,hin,cse,sprt;
float per;

    public String name(String n)
     {
     name=n;
     return n;
}
  public int roll(int r)
  {
      roll=r;
      return r;
  }       
   public void marks(int p,int c,int m,int h,int cs)
   {
       phy=p;
       che=c;
       mat=m;
       hin=h;
       cse=cs;
       
   }
   public int smarks(int s)
   {
       sprt=s;
       return s;
   }
 public float per()
 {
     per=(phy+che+mat+hin+cse)/5;
     return per;
 }
    
   
    public void show()
{
    System.out.println("Name of student="+name);
    System.out.println("Roll num="+roll);
    System.out.println("Sports marks="+sprt);
    System.out.println("Percent="+per);
    }

}
public class UseRE 
{
 public static void main(String[] args) 
 {
        java.util.Scanner kb= new java.util.Scanner(System.in);
        Result re= new Result();
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
               System.out.println("Enter sports marks=");
               int s=kb.nextInt();
               re.name(a);
               re.roll(b);
               re.marks(c, d, e, f, g);
               re.smarks(s);
               re.per();
              re.show();
        
    }
    
   
    
}
