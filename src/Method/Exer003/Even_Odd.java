package Method.Exer003;

import java.util.Scanner;

public class Even_Odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int number = sc.nextInt();
        // Modulus
        // 10%2 == 0 reminder => Even
        // 10%2 == 1 reminder => odd
        if(number%2 == 0){
            System.out.println("It is even number");
        }
        else {
            System.out.println("it is odd number");
        }
        sc.close();
    }
}
