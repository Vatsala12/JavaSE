/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vatsala shrivastava
 */
import java.util.Scanner;
public class ex {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        {
          int n=kb.nextInt();
          String ans="";
          if(n%2==1||(n>=6&&n<=20))
          {
              ans="weird";
          }
          else if(n%2==0&&(n>=2||n<=5||n>20))
          {
              ans="Not weird";
              
          }
          System.out.println(ans);    
           
          
        }
        // TODO code application logic here
    }
    
}
