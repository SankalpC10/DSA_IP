package a_Introduction;

import java.util.Scanner;

public class m_nthTermAP {
    public int nthTermAP(int a,int d,int N){
        return (a+(N-1)*d);
    }

    public static void main(String[] args) {
        m_nthTermAP test=new m_nthTermAP();
        int value1=test.nthTermAP(5,2,10);
        System.out.println(value1);
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int d=sc.nextInt();
        int N=sc.nextInt();
        int value2= test.nthTermAP(a,d,N);
        System.out.println(value2);
    }
}
