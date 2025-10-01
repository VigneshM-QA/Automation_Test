package Method.Loops.do_while_loop;

public class do_while {
    public static void main(String[] args) {
        // Do while --> Initialization -> Do (code) -> Increment -> condition
        int a = 0;
        do {
            System.out.println("Run a Code:" + a);
            a++;
        } while (a <= 10);   // Condition will be given last in Do while loop statement
    }
}
