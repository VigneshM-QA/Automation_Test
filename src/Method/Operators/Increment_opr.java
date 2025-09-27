package Method.Operators;

public class Increment_opr {
    public static void main() {
        // ++ operand
        // ++a --> Pre-Increment -> Value is incremented and print
        // a++ --> Post-Increment -> Print the value first and then increment
        int a = 10;
        int b = ++a;
        System.out.println(b); //Value increment and print
        System.out.println(a);

        int a_post = 5;
        System.out.println(a_post++);
        System.out.println(a_post++);
        System.out.println(a_post);

        // Example:
        int c = 13;
        System.out.println(c++ + c);
        System.out.println(c); // c incremented and now c is 4

    }
}
