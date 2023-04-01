package a_Introduction;
/*
* Java has concept of wrapper classes for each primitive type(non reference) to implement in fully object-oriented Java Collections(non-primitive)
* int -> Integer; float -> Float(Autoboxing)
* */

public class e_autoboxingUnboxing {
    public static void main(String[] args) {
        int x1 =10;
        Integer x2 = x1; //Autoboxing (Automatically becomes integer object)
        int x3 = x2; //Auto-Unboxing
        System.out.println(x1 + " " +x2+ " "+x3);
        int x4 =10;
        System.out.println(x1==x4);//same
        Integer x5=400,x6=400;
        System.out.println(x5==x6);//not same
    }
}
