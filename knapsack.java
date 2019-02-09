import java.util.*;
import java.lang.*;
import java.math.*;
public class Knapsack01 {

  
     static int bottomUpDP(int val[], int wt[], int W){
        int K[][] = new int[val.length+1][W+1];
        for(int i=0; i <= val.length; i++){
            for(int j=0; j <= W; j++){
                if(i == 0 || j == 0){
                    K[i][j] = 0;
                    continue;
                }
                if(j - wt[i-1] >= 0){
                    K[i][j] = Math.max(K[i-1][j], K[i-1][j-wt[i-1]] + val[i-1]);
                }else{
                    K[i][j] = K[i-1][j];
                }
            }
        }
        return K[val.length][W];
    }
     public static void main(String args[]){
        
       Scanner scan=new Scanner(System.in);
       int T=scan.nextInt();
       int m,n;
       m=0;
       n=0;
       int wt[]=new int[T];
       int val[]=new int[T];
       for(int i=0;i<T;i++){
         wt[m]=scan.nextInt();
         val[n]=scan.nextInt();
         m++;
         n++;
         
       }
       int Max=scan.nextInt();
        
        int r = bottomUpDP(val, wt, Max);
     
        System.out.println(r);
        
    }
}
