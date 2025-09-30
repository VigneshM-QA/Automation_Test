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
        char Grade = 'F';
        if (Marks >= 90 && Marks < 100) {
            Grade = 'A';
        } else if (Marks >= 80 && Marks < 89) {
           Grade = 'B';
        } else if (Marks>=70 && Marks<79) {
            Grade = 'C';
        } else if (Marks>=60 && Marks<69) {
            Grade = 'D';
        }
        else if (Marks>=50 && Marks<60) {
            Grade = 'E';
        }
        else if (Marks >100 || Marks<=0) {
            Grade = 'O';
        }
            else {
            Grade = 'F';
        }
        System.out.println("Your Grade is:" +Grade);
        sc.close();
    }
}
