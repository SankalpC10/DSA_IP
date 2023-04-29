package a_Introduction;

public class l_bitwiseOperators {
    public static void main(String[] args) {
        int x=3,y=6;
        System.out.println(x&y);
        System.out.println(x|y);
        System.out.println(x^y);

        //Bitwise NOT
        System.out.println("Bitwise NOT");
        x=1;
        System.out.println(~x);//2^32-1-1.. 1s complement
        x=5;
        System.out.println(~x);//2^32-6

        //LeftShift Operator => multiplication by 2
        System.out.println("LeftShift");
        x=3;
        System.out.println(x<<1);
        System.out.println(x<<2);
        System.out.println(x<<29);
        System.out.println(x<<30);//for large numbers doesn't work
        x=-1;
        System.out.println(x<<1);

        //RightShift Operator =>division by 2
        System.out.println("RightShift");
        x=12;
        System.out.println(x>>1);
        System.out.println(x>>2);
        System.out.println(x>>3);
        System.out.println(x>>4);
        System.out.println(x>>5);//fill leading with 0
        x=-2;
        System.out.println(x>>1);//fill leading bit with 1 for negative
        System.out.println(x>>2);//Always get -1

        //Unsigned RightShift
        System.out.println("Unsigned Right Shift");
        x=-2;
        System.out.println(x>>>1);
        System.out.println(x>>>2);
    }
}
