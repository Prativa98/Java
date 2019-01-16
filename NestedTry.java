
package nestedtry;

public class NestedTry {
    public static void main(String[] args) {
     try{
     int s=5/0;
         try{
     int a[]=new int[3];
     a[3]=2;     
     }
     catch(ArrayIndexOutOfBoundsException e){
         System.out.println("ex1:"+e);
     }
     
     }catch(ArithmeticException a){
         System.out.println("ex2:"+a);
     }
        
        
    }
    
}
