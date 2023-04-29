package a_Introduction;
import java.util.Scanner;

import static java.lang.Math.pow;

public class n_nthTermGP {
    public int nthTermGP(int a,int r,int N){
        return (int) (a*Math.pow(r,N-1));
    }

    public static void main(String[] args) {
        n_nthTermGP test = new n_nthTermGP();
        //int val1=test.nthTermGP(2,2,4);
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();//2
        int r=sc.nextInt();//2
        int N=sc.nextInt();//4
        int val1=test.nthTermGP(a,r,N);
        System.out.println(val1);//should give 16
    }
}
