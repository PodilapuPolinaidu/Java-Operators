package Operators;

public class Logical {
    public static void main(String[] args) {
        int a = 5, b=10;
        // and operator
        System.out.println(a<b);
        System.out.println( a!=5 && a++ ==a );
        System.out.println(a);

        // or operator

        System.out.println(a !=5 || a++ == a);
        System.out.println(a);
    }
}
