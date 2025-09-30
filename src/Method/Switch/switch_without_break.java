package Method.Switch;

import java.util.Scanner;

public class switch_without_break {
    public static void main() {
        // Print 1 to 7 to tell the Days eg: 1- Sunday, 2-Monday, 3-Tuesday ...., 7+ ... -> invalid data
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Day number(1 to 7): ");
        int Number = sc.nextInt();
        // Didnot use the break it will run all other cases also...
        switch (Number) {
            case 1:
                System.out.println("It is Sunday");
            case 2:
                System.out.println("It is Monday");
            case 3:
                System.out.println("It is Tuesday");
            case 4:
                System.out.println("It is Wednesday");
            case 5:
                System.out.println("It is Thursday");
            case 6:
                System.out.println("It is Friday");
            case 7:
                System.out.println("It is Saturday");
            default:
                System.out.println("Invalid Input - There is No day details here");
                break;
        }
        sc.close();
    }
}