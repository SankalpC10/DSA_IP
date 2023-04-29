package a_Introduction;

import java.util.Scanner;

public class p_lastDigit {
    public int lastDigit(int N){
        int r=Math.abs(N)%10;
        return r;
    }
    public static void main(String[] args) {
        p_lastDigit test=new p_lastDigit();
        Scanner sc =new Scanner(System.in);
        int N= sc.nextInt();
        int val=test.lastDigit(N);
        System.out.println(val);
    }
}
