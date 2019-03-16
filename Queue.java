import java.util.*;
/**
 *
 * @author Vikas Jaiswal
 */
 class Main {

    /**
     * Stack implementation
     */
  public static void main(String args[]){
                Scanner scan=new Scanner(System.in);
           queue Q=new queue();
           System.out.println("1:Enqueue\n2:Dequeue\n3:front\4:exit");
      OUTER:
      while (true) {
          System.out.println("1:PUSH\n2:POP\n3:PEEK\4:exit");
          int n=scan.nextInt();
          switch (n) {
              case 4:
                  break OUTER;
              case 1:
                  System.out.println("Enter number to push on stack");
                  int x=scan.nextInt();
                  Q.enqueue(x);
                  break;
              case 2:
                  Q.dequeue();
                  break;
              case 3:
                  int s=Q.Front();
                  System.out.println(s);
                  break;
              default:
                  break;
          }
      }
         
            
            
}
}
    
class queue{
    int arr[]=new int[1000];
    int front,rear;
    queue(){
        front=0;
        rear=-1;
    }
    void enqueue(int x){
       if(rear==arr.length)
            System.out.println("OVERFLOW CASE");
       else
            arr[rear++]=x;
    }
    void dequeue(){
        arr[front++]=0;
        
        }
       
    
    int Front(){
        return arr[front];
    }
}
     
