package a_Introduction;
import java.util.Scanner;
//Buffered Reader is basic,flexible, synchronized(multi thread) but faster than Scanner as Scanner performs postprocessing when taking inputs like nextFloat()
public class h_inputScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println("You entered: "+s);
        int x =sc.nextInt();
        System.out.println("You entered: "+x);
        float f=sc.nextFloat();
        System.out.println("You entered: "+f);
    }
}
