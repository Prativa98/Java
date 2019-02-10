
package runnablemethod1;
public class RunnableMethod1 implements Runnable{
 public void run(){
System.out.println("thread is running...");
}

public static void main(String args[]){
RunnableMethod1 m1=new RunnableMethod1(); 
Thread t1 =new Thread(m1); 
t1.start();
}
}


