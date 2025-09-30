package Method.Loops.For_Loop;

public class break_loop {
    public static void main(String[] args) {
        // Print even and odd numbers in 1 to 50

        for (int i = 0; i <= 50; i++) {
            if (i == 5) {
                break;
            }
            System.out.println(i);
        }
    }
}
