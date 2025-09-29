package Method;

import java.util.Scanner;

public class Grade_calculation {
    public static void main(String[] args) {
        // Grade A = 90-100
        // Grade B = 80-89
        // Grade C = 70-79
        // Grade D = 60-69
        // Grade E = >50
        // Grad F = Fail <49
        Scanner sc = new Scanner(System.in);
        System.out.println("Marks Scored: ");
        int Marks = sc.nextInt();

        if (Marks >= 90 && Marks < 100) {
            System.out.println("Grade is A");
        } else if (Marks >= 80 && Marks < 89) {
            System.out.println("Grade is B");
        } else if (Marks>=70 && Marks<79) {
            System.out.println("Grade is C");
        } else if (Marks>=60 && Marks<69) {
            System.out.println("Grad is D");
        }
        else if (Marks>=50 && Marks<60) {
            System.out.println("Grad is E");
        }
            else {
            System.out.println("Grade is Fail");
        }
        sc.close();
    }
}
