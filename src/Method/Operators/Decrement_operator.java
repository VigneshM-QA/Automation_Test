package Method.Operators;

public class Decrement_operator {
    public static void main() {
        int a = 5;
        int result = --a;
        System.out.println(result); // 4
        System.out.println(a); // 4

        System.out.println(result--);

        int b = 3;
        System.out.println(--b + --b + b--);
        System.out.println(b);
        // 2 + 1 + 1

        int c = 45;
        System.out.println(--c - c-- - --c - c);
        System.out.println(c);
        // 44 - 44 - 42 - 42 -> -84
    }
}
