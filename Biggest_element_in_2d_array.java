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
  int max=-9999;
  int arr[][]=new int[5][5];
  for(int i=0;i<arr.length;i++){
      for(int j=0;j<arr[i].length;j++){
          arr[i][j]=scan.nextInt();
          if(arr[i][j]>max){
              max=arr[i][j];
          }
        
  }
         
}
        System.out.println(max);
    }  }


    
    

