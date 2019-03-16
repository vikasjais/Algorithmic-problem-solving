
package javaapplication40;
import java.util.*;

public class JavaApplication40 {

  	public static void main (String[] args) throws java.lang.Exception
	{
	   Scanner scan=new Scanner(System.in);
           int n=scan.nextInt();
           int a=0;
           int b=1;
            System.out.print("0 1 ");
           for(int i=0;i<n-2;i++){
               int c=a+b;
               System.out.print(c+" ");
               a=b;
               b=c;
               
           }
   
}
    
       
        }
            
        
