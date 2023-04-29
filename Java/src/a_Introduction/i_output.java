package a_Introduction;


public class i_output {
    public static void main(String[] args) {
        int x=10,y=20;
        char z = 'G';
        String str = "GFG";
        System.out.println(x);
        System.out.println(x+y);
        System.out.println(x+""+y);
        System.out.print(str+" ");
        System.out.print("Courses\n");

        System.out.format("Value of x is %d\n",x);
        double k =Math.PI;
        System.out.println(k);
        System.out.format("Value of Pi=%.2f\n",k); //prints 2 decimal places : Value of Pi=3.14
        System.out.format("Value of Pi=%5.2f\n",k); //prints at least 5 characters : Value of Pi= 3.14
        System.out.format("Value of Pi=%05.2f\n",k); //fill with 0 : Value of Pi=03.14
        System.out.format("x%d,y%d",x,y); //multiple placeholders
    }
}
