package Method.Loops.do_while_loop;

public class Example01 {
    public static void main(String[] args) {
        int a = 0;
        do {
            System.out.println("Run: " +a);
            a++;
        }while (a < 0);  // condition is giving in last so above print statement will run
    }
}
