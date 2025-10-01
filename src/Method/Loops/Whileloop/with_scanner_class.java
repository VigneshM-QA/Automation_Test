package Method.Loops.Whileloop;

import java.util.Scanner;

public class with_scanner_class {
    public static void main(String[] args) {
//  Scanner sc = new Scanner(System.in);
        String age = args[0];  // setup arguments using "Edit Configurations" -> provide a i value ex:30
        int i = Integer.parseInt(age); // converting String to integer
        System.out.println(i);
            while (i <= 34) {
            System.out.println("It is valid age:");
            i++;
        }
    }
}
