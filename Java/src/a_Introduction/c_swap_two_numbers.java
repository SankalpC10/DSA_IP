package a_Introduction;

public class c_swap_two_numbers {
    public static void swap_two_numbers(int a,int b){
        int temp;
        temp = b;
        b = a;
        a =temp;
        System.out.println(a+ " " +b);
    }

    public static void main(String[] args) {
        int a = 10,b=20;
        System.out.println(a+ " " +b);
        swap_two_numbers(a,b);
    }
}
