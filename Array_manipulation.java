//https://www.hackerrank.com/challenges/crush/problem?isFullScreen=false
package test;
import java.util.*;
/**
 *
 * @author Vikas Jaiswal
 */
public class Test {

 

    public static void main(String args[]){
Scanner scan=new Scanner(System.in);

int n=scan.nextInt();
int m=scan.nextInt();
int arr[]=new int[n];
int a,b,k;
for(int i=0;i<n;i++)
arr[i]=0;

for(int j=0;j<m;j++){

a=scan.nextInt();
b=scan.nextInt();
k=scan.nextInt();
for(int o=a-1;o<=b-1;o++){

    arr[o]+=k;
}


}

int max=arr[0];
for(int l:arr){
    if(max<l){
        max=l;
    }
}
System.out.println(max);


    }
}

    
    

