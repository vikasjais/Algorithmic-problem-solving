
package javaapplication42;
import java.util.*;
/*
 author @vikas jaiswal
 */
public class left_rotation {

  

    public static void main(String args[]){

        Scanner scan=new Scanner(System.in);
        Stack stk1=new Stack();
        Stack stk2=new Stack();
    
        int g=scan.nextInt();

        for(int i=0;i<g;i++){

            int n1=scan.nextInt();
            int n2=scan.nextInt();
            int max=scan.nextInt();
            for(int k=0;k<n1;k++){
                stk1.push(scan.nextInt());
            }
            for(int k=0;k<n2;k++){
                stk2.push(scan.nextInt());
            }
            stk1.reverse();
            stk2.reverse();
            stk1.display();
            stk2.display();
            




        }


    }
}


class Stack{
    int arr[]=new int[100000000];
    int top;
    Stack(){
        top=-1;
    }
    void push(int n){
        arr[++top]=n;

    }
    int pop(){
        return arr[top--];

    }
    int pick(){
        return arr[top];
    }

    void reverse(){
        int m=0;
        int temp;
        for(int j=top;j>=top/2;j--){
            temp=arr[j];
            arr[j]=arr[m];
            arr[m]=temp;
            m++;
        }
    }
    void display(){
        for(int i=top;i>=0;i--)
        System.out.print(arr[i]+" ");
    }


}

