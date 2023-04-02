package a_Introduction;
import java.io.*; // we want to access all classes in io package

public class g_inputBufferedReader {
    public static void main(String[] args) throws IOException { //throws checked exceptions
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //System.in is input stream that converts it into stream of bytes.
                                                                                  //InputStreamReader converts stream of bytes to stream of characters
                                                                                  //BufferedReader expects stream of characters to read data from.
        System.out.println("Enter a String");
        String s = br.readLine();
        System.out.println("You Entered: "+s);

        //for integer
        System.out.println("Enter an integer");
        int x = Integer.parseInt(br.readLine());
        System.out.println("You Entered: "+x);
    }
}
