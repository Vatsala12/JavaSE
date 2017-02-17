import java.util.Scanner;
public class Max 
{

    
   public static void main(String[] args) {
    int i,j, a[],b[];
    a= new int[5];
    b= new int[5];
    Scanner kb= new Scanner(System.in);
       System.out.println("enter  num of 1 array=");
       for(i=0;i<5;i++)
       {
           a[i]=kb.nextInt();
       }
        System.out.println("enter  num of 2 array=");
       for(i=0;i<5;i++)
       {
           b[i]=kb.nextInt();
    }
       System.out.println("similar elements=");
   for(i=0;i<5;i++)
   {
       for(j=0;j<5;j++)
       {
           
       
       if(a[i]==b[j])
        
       System.out.println(+a[i]);
  
   }
   }
   }
   }
   

          
       
           
   
   
      

