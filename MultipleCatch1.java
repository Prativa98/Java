
package multiplecatch1;


public class MultipleCatch1 {

    public static void main(String[] args) {
       try{
       
       int sum=5/0;
       }catch(ArrayIndexOutOfBoundsException e){
           System.out.println("This won't be Printed");
       }
       catch(ArithmeticException e){
       
           System.out.println("Exception:"+e);
       }
        System.out.println("NormalFlow");
    }
    
}
