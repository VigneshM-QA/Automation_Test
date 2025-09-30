package Method.Loops.For_Loop;

public class even_odd {
    public static void main() {
        // Print even and odd numbers in 1 to 50

        for (int i = 0; i <= 50; i++) {
            if(i %2 == 0){
                System.out.println("Even"+ i);
            }
            else {
                System.out.println("Odd"+ i);
            }
        }
    }
}
