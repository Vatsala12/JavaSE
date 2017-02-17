import java.util.Scanner;
public class Evenodd {

   
    public static void main(String[] args) {
      
        int i,evensum=0,oddsum=0;
        int arr[];
        arr= new int[10];
        
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter 10 num!");
        for( i=0;i<10;i++)
            
        {
            arr[i]=kb.nextInt();
            
        }
        
            for(i=0;i<10;i++)
            {    
        if(arr[i]%2==0)
            
        
                System.out.println("Even num="+arr[i]);  
        
            }
           
            
        for(i=0;i<10;i++){ 
            
            
            
             if(arr[i]%2!=0)
                 
                 
             
               
       
    
                    System.out.println("Odd num="+arr[i]);
         
     
        } 
        
        int sum=0;
             for(i=0;i<10;i++)
             
             {
                  if(arr[i]%2==0)
                 evensum=evensum+arr[i];
                 
             
             
            if(arr[i]%2!=0)
                     
            {  
             oddsum=oddsum+arr[i];
                     }
             
             
             }System.out.println("evn sum="+evensum);
             System.out.println("odd sum="+oddsum);
    }               
}
        


    


    
    