package a_Introduction;

public class d_nonPrimitiveDataTypes {
    //any datatype which is not primitive -ex:class,string
    class Point{
        int x,y;
    }

    public void assign(){
        Point p1 = new Point(); // create variables of non-primitive datatype using new operator
        System.out.println(p1.x +" "+ p1.y);// default values
        p1.x=10; //to access members
        p1.y=20;
        System.out.println(p1.x +" "+ p1.y);
        Point p2 = p1;// reference
        p2.x =30;
        System.out.println(p1.x + " "+ p2.x); // reference value
    }

    public static void main(String[] args) {
        d_nonPrimitiveDataTypes assign = new d_nonPrimitiveDataTypes();
        assign.assign();
        int x1 =10;
        int x2 = x1;// allocates memory
        x2 =20;
        System.out.println(x1 + " "+ x2); // no reference
    }
}

/*
* Primitive vs Non Primitive
* Primitive are member variables, non-primitives are always references
* Non-Primitive: Memory allocated in Heap, Primitives in Stack.
* Stack memory is used for function calls, Heap for dynamic memory
* Member of non primitive gets default value
* */
