import java.util.Scanner;
public class Table 
{
public static void main(String[] args) 
{
   int a,t;
   Scanner kb= new Scanner(System.in);
    System.out.println("Enter the num=");
   a=kb.nextInt();
   for(int i=1;i<=10;i++)
   { 
       for(int j=1;j<=10;j++)
       {
           t=a*j;
       }
       System.out.println(+a+"*"+i+"="+(a*i));
   }
     
}
    
}
