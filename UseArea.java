import java.util.Scanner;
class Area{
    int a,b,ar1;
    float c,d,ar2;
    double r,ar;
    Area(int a,int b){
        this.a=a;
        this.b=b;
        ar1=a*b;
        System.out.println("Area of rectangle="+ar1);
    }
    Area(float c,float d)
    {
        this.c=c;
        this.d=d;
        ar2=c*d/2;
        System.out.println("Area of Triangle="+ar2);
    }
    Area(int a)
    {
        this.a=a;
        ar1=a*a;
        System.out.println("Area of square="+ar1);
    }
    Area(double r)
    {
       this.r=r;
       ar=Math.PI*Math.pow(r, 2);
       System.out.println("Area of circle="+ar);
    }
    
}
public class UseArea {

    
    public static void main(String[] args) {
       Scanner kb= new Scanner(System.in);
       System.out.println("Enter length and width");
        int a= kb.nextInt();
        int b = kb.nextInt();
        System.out.println("Enter base and height ");
        float c=kb.nextFloat();
        float d=kb.nextFloat();
        System.out.println("Enter the size");
        int e=kb.nextInt();
        System.out.println("Enter the radius");
        double r=kb.nextDouble();
        Area a1= new Area(a,b);
         Area a2= new Area(c,d);
         Area a3= new Area(e);
         Area a4= new Area(r);
    }
    
}
