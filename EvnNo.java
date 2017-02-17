import java.util.Scanner;
public class EvnNo {

   public static void main(String[] args) 
   { int a,i;
   Scanner sc= new Scanner(System.in);
       System.out.println("Enter a int value");
        a=sc.nextInt();
        
  for(i=a;i>1;i--)
  {
      if(i%2==0)
          System.out.println("even num="+i); 
  }
      }
}