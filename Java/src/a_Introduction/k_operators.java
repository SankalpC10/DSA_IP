package a_Introduction;

import java.util.Scanner;

public class k_operators {
    public static void main(String[] args) {
        int x=10,y=20;
        System.out.println(x+y);
        System.out.println(x*y);
        System.out.println(y/x);
        int z=(x+y*10);
        System.out.println(z);
        z=x++;//z=x => x=x+1
        System.out.println(z+" "+x);
        z=++x;//x=x+1 =>z=x
        System.out.println(z+" "+x);
        x = 10;
        y=5;
        x+=y;
        System.out.println(x);
        x%=y;
        System.out.println(x);
        z=x=y;// Associativity left to right
        System.out.println(z);

        //Logical Operators
        String usr="geek",pwd="GEEK";
        Scanner sc =new Scanner(System.in);
        String iu=sc.next();
        String ip=sc.next();
        if(usr.equals(iu) && pwd.equals(ip))
            System.out.println("Welcome");
        else
            System.out.println("Try Again");

        //Booleans
        boolean a=true,b=false;
        System.out.println(a&&b);
        System.out.println(a||b);
        System.out.println(!a);

        //Short-circuiting
        //1. First condition in logical and is false
        //2. First condition in logical or is true
        // Second expression won't be evaluated in this case
        System.out.println(" ");
        //Relational Operrators
        x=10;y=20;
        System.out.println(x==y);
        System.out.println(x!=y);
        System.out.println(x<y);
        System.out.println(x>y);
        System.out.println(x>=y);
        System.out.println(x<=y);
    }
}
