package Operators;

public class Arithmetic {
    public static void main(String[] args) {
        double a = 20, b = 5, c = 5, d = 0;


        System.out.println("Add: " +(a+b));
        System.out.println("Sub: " +(a-b));
        System.out.println("Mul: " +(a*b));
       // System.out.println("Div: " +(a/b));
        System.out.println("Mod: " +(a%b));
        System.out.println("exception " + (a/d));
        // precedence level
        System.out.println(a + b * c);
        System.out.println(a * b + c);



    }
}
