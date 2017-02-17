import java.util.Scanner;
public class MyArray {

   
    public static void main(String[] args) {
        int arr[][],i,j,m,n;
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter the size of Array");
        m=kb.nextInt();
        n=kb.nextInt();
        arr= new int[m][n];
        System.out.println("Enter the numbers ");
        for(i=0;i<m;i++)
           
                {
                    for(j=0;j<n;j++){
                        arr[i][j]=kb.nextInt();
                    }
            
        }
        System.out.println("Elements of Array=");
        for(i=0;i<m;i++)
           
                {
                    for(j=0;j<n;j++){
                        System.out.print(arr[i][j]+" ");
                    }
                    System.out.println(" ");
                }
        int sum=0;
        
     for(i=0;i<m;i++)
           
                {
                    for(j=0;j<n;j++){
                        sum=sum+arr[i][j];
                    }
    }
        System.out.println("sum="+sum);
        System.out.println("sum="+(float)sum/(m*n));
       
       
    }
}
