package a_Introduction;
/* Type Conversion
    Widening or Implicit Conversion: byte->short->int->long(64 bit)->float(32 bit but exponents are stored differently)->double(64 bit)
                                     char->int
    Narrowing or Explicit Conversion => loss of data
* */

public class f_typeConversion {
    public static void main(String[] args) {
        int x=100;
        long y=x;
        double z=x;
        System.out.println(x+" "+y+" "+z);

        //explicit
        double d =65.4;
        int i = (int)d;
        char c = (char)i;
        System.out.println(i+" "+c); //65 is ASCII value of A.
    }
}
