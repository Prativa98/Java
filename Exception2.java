package exception2;
public class Exception2 {
    public static void main(String[] args) {
        int a[]=new int[2];
        try{
        a[2]=5/0;
        }catch(ArithmeticException e1){
            System.out.println("Exptn:"+e1);
        }
        catch(ArrayIndexOutOfBoundsException e2){
            System.out.println("excptn"+e2);
        }
    }
    
}
