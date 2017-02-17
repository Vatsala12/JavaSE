import java.util.Scanner;
public class MyArr {

    
    public static void main(String[] args) {
    int arr[][],i,j;
    arr = new int[2][3];
    Scanner kb = new Scanner(System.in);
        System.out.println("enter elements of array=");
        for(i=0;i<2;i++)
        {
            for(j=0;j<3;j++)
            {
                arr[i][j]=kb.nextInt();
            }
        }
        
        for(i=0;i<2;i++)
        {
            for(j=0;j<3;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println(" ");
    }
}
}
