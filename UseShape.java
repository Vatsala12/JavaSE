import java.util.Scanner;
 class Shape {
    double a,b,c,d;
    
    public void displayarea(double a,double b)
    {
        
    }
}
class Triangle extends Shape
{
    public void displayarea()
    {
        
    }
}
class Rectangle extends Shape{
    public void displayarea()
    {
        
    }
}

public class UseShape
{
    public static void main(String []args)
    {
        Scanner kb= new Scanner(System.in);
        Shape s;
        s= new Triangle();
        s= new Rectangle();
        System.out.println("Enter the dimensions");
        
        
    }
            
}