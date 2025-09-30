package Method.Switch;

import java.util.Scanner;

public class switch_case {
    public static void main() {
        // Print 1 to 7 to tell the Days eg: 1- Sunday, 2-Monday, 3-Tuesday ...., 7+ ... -> invalid data
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Day number(1 to 7): ");
        int Number = sc.nextInt();
        switch (Number){
            case 1:
                System.out.println("It is Sunday");
                break;
            case 2:
                System.out.println("It is Monday");
                break;
            case 3:
                System.out.println("It is Tuesday");
                break;
            case 4:
                System.out.println("It is Wednesday");
                break;
            case 5:
                System.out.println("It is Thursday");
                break;
            case 6:
                System.out.println("It is Friday");
                break;
            case 7:
                System.out.println("It is Saturday");
                break;
            default:
                System.out.println("Invalid Input - There is No day details here");
                break;
                }
                sc.close();
    }
}
