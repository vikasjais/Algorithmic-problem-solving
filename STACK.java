import java.util.*;
import java.lang.*;
import java.io.*;
class STACK {
 
    
    public static void main(String args[]){
       stack stk=new stack();
       stk.push(100);
       stk.push(500);
        System.out.println(stk.peak());    
        System.out.println(stk.peak());

}
}
class stack{
    int arr[]=new int[1000];
    int top;
    stack(){
        top=-1;
    }
    void push(int x){
        if(isFull())
         System.out.println("Stack is full");
        else
        arr[++top]=x;
    }
    void pop(){
        if(isEmpty())
            System.out.println("Stack is Empty");
        else top=-1;
    }
    int peak(){
        if(isEmpty()){
            System.out.println("Stack is Empty");
            return Integer.MIN_VALUE;
        }
        else return arr[top--];
    }
    boolean isFull(){
        return top==arr.length-1;
    }
    boolean isEmpty(){
        return top==-1;
    }
}
