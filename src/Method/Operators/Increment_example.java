package Method.Operators;

public class Increment_example {
    public static void main() {
        int a = 3;
        System.out.println(a++ + ++a);
        // 4 + 4

        int b = 12;
        System.out.println(b++ + ++b + b++ + b);
        //  b++	12 (use, then ++)	13
        //  ++b	++13 → 14	14
        // b++	14 (use, then ++)	15
        //  b	15	15

    }
}
