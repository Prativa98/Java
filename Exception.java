package exceptin1;
import java.util.Scanner;
public class Exception {
    public static void main(String[] args) {
   int a,b;
   int c[]=new int[4];
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a Number to Divide:");
        a=s.nextInt();
        System.out.println("With which number you want to divide?");
        b=s.nextInt();
        try{
            float sum=a/b;
            System.out.println("the value is :"+sum);
            c[4]=6;
        }catch(ArithmeticException e){
            System.out.println("Exception 1:"+e);
        }
            catch(ArrayIndexOutOfBoundsException g){
        System.out.println("Exception 2:"+g);
    }
    
}}
