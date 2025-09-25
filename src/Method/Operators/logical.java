package Method.Operators;

public class logical {
    public static void main() {
        // && , || , ! --> AND, OR, NOT operator

        boolean a = true;
        boolean b = false;
        System.out.println(a||b);
        System.out.println(a&&b);
        System.out.println(!b);
        System.out.println(!!b);
        System.out.println(!!!!a); // ! -> NOT can perform infinity and compares with other
    }
}
