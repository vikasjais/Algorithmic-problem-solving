/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;
import java.util.*;
/**
 *
 * @author Vikas Jaiswal
 */
public class Test {

    public static void main(String args[]){

   Scanner scan=new Scanner(System.in);
  String arr[]=new String[scan.nextInt()];
  int n=arr.length;
  for(int j=0;j<arr.length;j++){
     arr[j]=scan.next();
     
  }
  for(int i=0;i<(int)(arr.length/2);i++){
      if(arr[i].equals(arr[n-1])){
          n=n-1;
            }
      else{
          System.out.println("Not palindrome");
          break;
      
  }
         
}
    }  }


    
    

