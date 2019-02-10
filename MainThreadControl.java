
package mainthreadcontrol;
public class MainThreadControl {

    public static void main(String[] args) {
        Thread t=Thread.currentThread();
        System.out.println("Before Changing"+ t);
        t.setName("Mai'me");
        t.setPriority(3);
        System.out.println("after changing:"+t);
    }
    
}
